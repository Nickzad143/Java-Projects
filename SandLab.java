import java.awt.Color;

public class SandLab {
    public static final int EMPTY = 0;
    public static final int METAL = 1;
    public static final int SAND = 2;
    public static final int WATER = 3;
    public static final int GAS = 4;
    public static final int ACID = 5;
    public static final int GLASS = 6;
    public static final int MAGMA = 7;

    private int[][] grid;
    private SandDisplay display;
    private boolean noBounds;

    public SandLab(int numRows, int numCols, boolean noBounds) {
        String[] names = {"Empty", "Metal", "Sand", "Water", "Gas", "Acid", "Glass", "Magma"};
        grid = new int[numRows][numCols];
        display = new SandDisplay("Falling Sand", numRows, numCols, names);
        this.noBounds = noBounds;
    }

    public static void main(String[] args) {
        SandLab lab = new SandLab(120, 80, false);
        lab.run();
    }

    private void locationClicked(int row, int col, int tool) {
        if (row >= 0 && row < grid.length && col >= 0 && col < grid[row].length) {
            grid[row][col] = tool;
        }
    }

    public void updateDisplay() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                Color color = switch (grid[row][col]) {
                    case METAL -> Color.DARK_GRAY;
                    case SAND -> Color.YELLOW;
                    case WATER -> Color.BLUE;
                    case GAS -> Color.GRAY;
                    case ACID -> Color.GREEN;
                    case GLASS -> Color.LIGHT_GRAY;
                    case MAGMA -> Color.RED;
                    default -> Color.BLACK;
                };
                display.setColor(row, col, color);
            }
        }
    }

    public void step() {
        for (int row = grid.length - 1; row >= 0; row--) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == SAND && row + 1 < grid.length && grid[row + 1][col] == EMPTY) {
                    grid[row + 1][col] = SAND;
                    grid[row][col] = EMPTY;
                } else if (grid[row][col] == WATER && row + 1 < grid.length && grid[row + 1][col] == EMPTY) {
                    grid[row + 1][col] = WATER;
                    grid[row][col] = EMPTY;
                }
            }
        }
    }

    public void run() {
        while (true) {
            for (int i = 0; i < display.getSpeed(); i++) {
                step();
            }
            updateDisplay();
            display.repaint();
            display.pause(100); // wait for redrawing and for mouse
            int[] mouseLoc = display.getMouseLocation();
            if (mouseLoc != null) {
                locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
            }
        }
    }
}
