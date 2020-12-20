
package tetris.domain;

import java.util.Arrays;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import tetris.ui.TetrisUi;

public class Field {
    public static int size = TetrisUi.SIZE;
    public static Group group = TetrisUi.group;
    private int[][] field;
    private int lines;
    
    public Field(int x, int y) {
        field = new int[x][y];
        for (int[] a : field) {
            Arrays.fill(a, 0);
        }
    }
    
    public int[][] getField() {
        return field;
    }
    
    public int getLines() {
        return lines;
    }
    
    public void addPiece(Piece piece) {
        field[(int) piece.getA().getX() / size][(int) piece.getA().getY() / size] = 1;
        field[(int) piece.getB().getX() / size][(int) piece.getB().getY() / size] = 1;
        field[(int) piece.getC().getX() / size][(int) piece.getC().getY() / size] = 1;
        field[(int) piece.getD().getX() / size][(int) piece.getD().getY() / size] = 1;
    }
    
    public boolean checkForRectanglesUnder(Piece piece) {
        return field[(int) piece.getA().getX() / size][(int) piece.getA().getY() / size + 1] == 1 || field[(int) piece.getB().getX() / size][(int) piece.getB().getY() / size + 1] == 1 || field[(int) piece.getC().getX() / size][(int) piece.getC().getY() / size + 1] == 1 || field[(int) piece.getD().getX() / size][(int) piece.getD().getY() / size + 1] == 1;
    }
    
    public boolean checkForRectanglesRight(Piece piece) {
        return field[(int) piece.getA().getX() / size + 1][(int) piece.getA().getY() / size ] == 1 || field[(int) piece.getB().getX() / size + 1][(int) piece.getB().getY() / size] == 1 || field[(int) piece.getC().getX() / size + 1][(int) piece.getC().getY() / size] == 1 || field[(int) piece.getD().getX() / size + 1][(int) piece.getD().getY() / size] == 1;
    }
    
    public boolean checkForRectanglesLeft(Piece piece) {
        return field[(int) piece.getA().getX() / size - 1][(int) piece.getA().getY() / size ] == 1 || field[(int) piece.getB().getX() / size - 1][(int) piece.getB().getY() / size] == 1 || field[(int) piece.getC().getX() / size - 1][(int) piece.getC().getY() / size] == 1 || field[(int) piece.getD().getX() / size - 1][(int) piece.getD().getY() / size] == 1;
    }
    
    public boolean checkIfPieceOverlaps(Piece piece) {
        return field[(int) piece.getA().getX() / size][(int) piece.getA().getY() / size] == 1 || field[(int) piece.getB().getX() / size][(int) piece.getB().getY() / size] == 1 || field[(int) piece.getC().getX() / size][(int) piece.getC().getY() / size] == 1 || field[(int) piece.getD().getX() / size][(int) piece.getD().getY() / size] == 1;
    }
    
    public boolean checkForGameOver() {
        for (int[] field1 : field) {
            if (field1[3] == 1) {
                return true;
            }
        }
        return false;
    }
    
    public void checkForLines() {
        int full = 0;
        for (int i = 0; i < field[0].length; i++) {
            for (int[] field1 : field) {
                if (field1[i] == 1) {
                    full++;
                }
            }
            if (full == field.length) {
                for (int[] field1 : field) {
                    field1[i] = 0;
                }
                updateField(i);
                lines++;
            }
            full = 0;
        }
    }
    
        public void updateField(int line) {
        int[][] newfield = new int[field.length][field[0].length];
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == 1) {
                    if (i < line) {
                        newfield[j][i + 1] = 1;
                    } else if (i > line) {
                        newfield[j][i] = 1;
                    }
                }
            }
        }
        field = newfield;
        updateGroup();
    }
        
    public void updateGroup() {
        group.getChildren().clear();
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == 1) {
                    Rectangle r = new Rectangle(size * j, size * i, size - 1, size - 1);
                    group.getChildren().add(r);
                }
            }
        }
        Line line = new Line(0, size * 3, size * 11, size * 3);
        group.getChildren().add(line);
    }
    
}
