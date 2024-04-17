import java.util.Random;

public class RubikFace {
    private String[][] facets = new String[3][3];
    private static final String[] COLORS = {"White", "Orange", "Blue", "Yellow", "Red", "Green"};

    public RubikFace(String _color) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    facets[i][j] = _color.substring(0, 1);
                } else {
                    facets[i][j] = COLORS[random.nextInt(COLORS.length)].substring(0, 1);
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String[] row : facets) {
            for (String facet : row) {
                sb.append(facet).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    public String[] getRow(int i) {
        return new String[] {facets[i][0], facets[i][1], facets[i][2]};
    }

    public String[] getColumn(int i) {
        return new String[] {facets[0][i], facets[1][i], facets[2][i]};
    }

    public void setRow(int i, String[] row) {
        System.arraycopy(row, 0, facets[i], 0, 3);
    }

    public void setColumn(int i, String[] col) {
        for (int j = 0; j < 3; j++) {
            facets[j][i] = col[j];
        }
    }

    public void rotateCW() {
        String[][] rotated = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotated[i][j] = facets[2 - j][i];
            }
        }
        facets = rotated;
    }

    public void rotateCCW() {
        String[][] rotated = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rotated[i][j] = facets[j][2 - i];
            }
        }
        facets = rotated;
    }
}
