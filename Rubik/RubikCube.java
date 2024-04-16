public class RubikCube {
    private RubikFace[] faces = new RubikFace[6];

    public RubikCube() {
        // Initializing each face with different color.
        faces[0] = new RubikFace("White");
        faces[1] = new RubikFace("Orange");
        faces[2] = new RubikFace("Blue");
        faces[3] = new RubikFace("Yellow");
        faces[4] = new RubikFace("Red");
        faces[5] = new RubikFace("Green");
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append("      ").append(arrayToString(faces[0].getRow(i))).append("\n");
        }
        for (int i = 0; i < 3; i++) {
            result.append(arrayToString(faces[2].getRow(i))).append(" ")
                  .append(arrayToString(faces[1].getRow(i))).append(" ")
                  .append(arrayToString(faces[5].getRow(i))).append("\n");
        }
        for (int i = 0; i < 3; i++) {
            result.append("      ").append(arrayToString(faces[3].getRow(i))).append("\n");
        }
        for (int i = 0; i < 3; i++) {
            result.append("      ").append(arrayToString(faces[4].getRow(i))).append("\n");
        }
        return result.toString();
    }

    private String arrayToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    public void left() {
        RubikFace temp = faces[1];
        faces[1] = faces[5];
        faces[5] = faces[4];
        faces[4] = faces[2];
        faces[2] = temp;
    }

    public void right() {
        RubikFace temp = faces[1];
        faces[1] = faces[2];
        faces[2] = faces[4];
        faces[4] = faces[5];
        faces[5] = temp;
    }

    public void up() {
        RubikFace temp = faces[0];
        faces[0] = faces[4];
        faces[4] = faces[3];
        faces[3] = faces[1];
        faces[1] = temp;
    }

    public void down() {
        RubikFace temp = faces[0];
        faces[0] = faces[1];
        faces[1] = faces[3];
        faces[3] = faces[4];
        faces[4] = temp;
    }

    public void cw() {
        faces[2].rotateCW();
        String[] topRow = faces[0].getRow(2);
        String[] rightCol = faces[1].getColumn(0);
        String[] bottomRow = faces[3].getRow(0);
        String[] leftCol = faces[5].getColumn(2);

        faces[0].setRow(2, leftCol);
        faces[1].setColumn(0, topRow);
        faces[3].setRow(0, rightCol);
        faces[5].setColumn(2, bottomRow);
    }

    public void ccw() {
        faces[2].rotateCCW();
        String[] topRow = faces[0].getRow(2);
        String[] rightCol = faces[1].getColumn(0);
        String[] bottomRow = faces[3].getRow(0);
        String[] leftCol = faces[5].getColumn(2);

        faces[0].setRow(2, rightCol);
        faces[1].setColumn(0, bottomRow);
        faces[3].setRow(0, leftCol);
        faces[5].setColumn(2, topRow);
    }
}
