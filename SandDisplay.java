import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Hashtable;

public class SandDisplay extends JComponent implements MouseListener, MouseMotionListener, ActionListener, ChangeListener {
    private BufferedImage image;
    private int cellSize;
    private JFrame frame;
    private int tool;
    private int numRows;
    private int numCols;
    private int[] mouseLoc; // Location in array format [row, col]
    private JButton[] buttons;
    private JSlider slider;
    private int speed;

    public SandDisplay(String title, int numRows, int numCols, String[] buttonNames) {
        this.numRows = numRows;
        this.numCols = numCols;
        tool = 1;
        mouseLoc = null;
        speed = computeSpeed(50);

        cellSize = Math.max(1, 600 / Math.max(numRows, numCols));
        image = new BufferedImage(numCols * cellSize, numRows * cellSize, BufferedImage.TYPE_INT_RGB);

        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.LINE_AXIS));
        frame.getContentPane().add(topPanel);

        setPreferredSize(new Dimension(numCols * cellSize, numRows * cellSize));
        addMouseListener(this);
        addMouseMotionListener(this);
        topPanel.add(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.PAGE_AXIS));
        topPanel.add(buttonPanel);

        buttons = new JButton[buttonNames.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonNames[i]);
            buttons[i].setActionCommand("" + i);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        buttons[tool].setSelected(true);

        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.addChangeListener(this);
        slider.setMajorTickSpacing(5);
        slider.setSnapToTicks(true);
        slider.setPaintTicks(true);
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel("Slow"));
        labelTable.put(100, new JLabel("Fast"));
        slider.setLabelTable(labelTable);
        slider.setPaintLabels(true);

        frame.getContentPane().add(slider);

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public int getSpeed() {
        return speed;
    }

    public int getTool() {
        return tool;
    }

    public int[] getMouseLocation() {
        return mouseLoc;
    }

    private int computeSpeed(int sliderValue) {
        return (int)Math.pow(10, 0.05 * sliderValue + 1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        mouseLoc = toLocation(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseLoc = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseLoc = toLocation(e);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tool = Integer.parseInt(e.getActionCommand());
        for (JButton button : buttons) {
            button.setSelected(false);
        }
        ((JButton)e.getSource()).setSelected(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            speed = computeSpeed(slider.getValue());
        }
    }

    private int[] toLocation(MouseEvent e) {
        int row = e.getY() / cellSize;
        int col = e.getX() / cellSize;
        if (row < 0 || row >= numRows || col < 0 || col >= numCols)
            return null;
        return new int[] { row, col };
    }

    public void setColor(int row, int col, Color color) {
        Graphics g = image.getGraphics();
        g.setColor(color);
        g.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
        g.dispose();
    }

    public void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
