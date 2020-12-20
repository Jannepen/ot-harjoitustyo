
package tetris.application;

import java.util.Arrays;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import tetris.ui.TetrisUi;

/**
 * Pelikentästä vastaava luokka
 */

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
    
    public int getX() {
        return field.length;
    }
    
    public int getY() {
        return field[0].length;
    }
    
    public int getValue(int x, int y) {
        return field[x][y];
    }
    
    public int getLines() {
        return lines;
    }
    
    public void setField(int[][] newfield) {
        field = newfield;
    }
    
/**
 * lisää parametrina annetun palikan pelikentälle
 * @param   piece   palikka
 */
    public void addPiece(Piece piece) {
        field[(int) piece.getA().getX() / size][(int) piece.getA().getY() / size] = 1;
        field[(int) piece.getB().getX() / size][(int) piece.getB().getY() / size] = 1;
        field[(int) piece.getC().getX() / size][(int) piece.getC().getY() / size] = 1;
        field[(int) piece.getD().getX() / size][(int) piece.getD().getY() / size] = 1;
    }
    
/**
 * tarkistaa onko parametrina annetun palikan alla neliöitä
 * @param   piece   palikka
 * @return true jos palikan alla on neliö
 */
    public boolean checkForRectanglesUnder(Piece piece) {
        return field[(int) piece.getA().getX() / size][(int) piece.getA().getY() / size + 1] == 1 || field[(int) piece.getB().getX() / size][(int) piece.getB().getY() / size + 1] == 1 || field[(int) piece.getC().getX() / size][(int) piece.getC().getY() / size + 1] == 1 || field[(int) piece.getD().getX() / size][(int) piece.getD().getY() / size + 1] == 1;
    }
    
/**
 * tarkistaa onko parametrina annetun palikan oikealla puolella neliöitä
 * @param   piece   palikka
 * @return true jos palikan oikealla puolella on neliö
 */
    public boolean checkForRectanglesRight(Piece piece) {
        return field[(int) piece.getA().getX() / size + 1][(int) piece.getA().getY() / size ] == 1 || field[(int) piece.getB().getX() / size + 1][(int) piece.getB().getY() / size] == 1 || field[(int) piece.getC().getX() / size + 1][(int) piece.getC().getY() / size] == 1 || field[(int) piece.getD().getX() / size + 1][(int) piece.getD().getY() / size] == 1;
    }
    
/**
 * tarkistaa onko parametrina annetun palikan vasemmalla puolella neliöitä
 * @param   piece   palikka
 * @return true jos palikan vasemmalla puolella on neliö
 */
    public boolean checkForRectanglesLeft(Piece piece) {
        return field[(int) piece.getA().getX() / size - 1][(int) piece.getA().getY() / size ] == 1 || field[(int) piece.getB().getX() / size - 1][(int) piece.getB().getY() / size] == 1 || field[(int) piece.getC().getX() / size - 1][(int) piece.getC().getY() / size] == 1 || field[(int) piece.getD().getX() / size - 1][(int) piece.getD().getY() / size] == 1;
    }
    
/**
 * tarkistaa onko parametrina annetun palikan kohdalla neliöitä
 * @param   piece   palikka
 * @return true jos palikan kohdalla on neliö
 */
    public boolean checkIfPieceOverlaps(Piece piece) {
        return field[(int) piece.getA().getX() / size][(int) piece.getA().getY() / size] == 1 || field[(int) piece.getB().getX() / size][(int) piece.getB().getY() / size] == 1 || field[(int) piece.getC().getX() / size][(int) piece.getC().getY() / size] == 1 || field[(int) piece.getD().getX() / size][(int) piece.getD().getY() / size] == 1;
    }
    
/**
 * tarkistaa loppuuko peli
 * @return true jos peli loppuu
 */
    public boolean checkForGameOver() {
        for (int[] field1 : field) {
            if (field1[3] == 1) {
                return true;
            }
        }
        return false;
    }
    
/**
 * tarkistaa onko pelikentällä täysiä rivejä
 */
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
    
/**
 * päivittää pelikentän oikeaksi täyden rivin poistuttua
 * @param   line   rivi josta täysi rivi löytyy 
 */
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
        
/**
 * päivittää käyttöliittymässä näkyvän pelin oikeaan muotoon täyden rivin poistuttua
 */
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
