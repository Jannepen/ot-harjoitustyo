package application;

import javafx.scene.shape.Rectangle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.application.Field;
import tetris.application.Piece;

public class PlayingFieldTest {
    
    Piece piece;
    Rectangle r;
    Field field;
    
    @Before
    public void setUp() {
        r = new Rectangle(100,20,19,19);
        piece = new Piece(r,r,r,r,0,0);
        field = new Field(11,21);
    }
    
    @Test
    public void checkForGameOverReturnsTrueWhenGameOver() {
        int[][] newfield = new int[11][21];
        for (int i = 0; i < field.getY(); i++) {
            for (int j = 0; j < field.getX(); j++) {
                newfield[j][i] = 1;
            }
        }
        field.setField(newfield);
        assertEquals(true, field.checkForGameOver());
    }
    
    @Test
    public void AddsPieceToPlayingField() {
        piece.createO();
        field.addPiece(piece);
        assertEquals(1, field.getValue(6, 0));
    }
    
    @Test
    public void checkForLinesAddsALineWhenFound() {
        int[][] newfield = new int[11][21];
        for (int i = 0; i < field.getY(); i++) {
            for (int j = 0; j < field.getX(); j++) {
                if (i == 15) {
                    newfield[j][i] = 1;
                }
            }
        }
        field.setField(newfield);
        field.checkForLines();
        assertEquals(1, field.getLines());
    }
    
    @Test
    public void updateFieldDropsRectanglesAboveFoundLine() {
        int[][] newfield = new int[11][21];
        for (int i = 0; i < field.getY(); i++) {
            for (int j = 0; j < field.getX(); j++) {
                if (i == 15) {
                    newfield[j][i] = 1;
                }
            }
        }
        newfield[5][13] = 1;
        field.setField(newfield);
        field.checkForLines();
        assertEquals(1, field.getValue(5, 14));
    }
    
    @Test
    public void checkForRectanglesUnderReturnsTrue() {
        int[][] newfield = new int[11][21];
        newfield[5][2] = 1;
        piece.createO();
        field.setField(newfield);
        assertEquals(true, field.checkForRectanglesUnder(piece));
    }

    @Test
    public void checkForRectanglesRightReturnsTrue() {
        int[][] newfield = new int[11][21];
        newfield[7][0] = 1;
        piece.createO();
        field.setField(newfield);
        assertEquals(true, field.checkForRectanglesRight(piece));
    }
    
    @Test
    public void checkForRectanglesLeftReturnsTrue() {
        int[][] newfield = new int[11][21];
        newfield[4][0] = 1;
        piece.createO();
        field.setField(newfield);
        assertEquals(true, field.checkForRectanglesLeft(piece));
    }

    @Test
    public void checkIfPieceOverlapsReturnsTrue() {
        int[][] newfield = new int[11][21];
        newfield[5][1] = 1;
        piece.createO();
        field.setField(newfield);
        assertEquals(true, field.checkIfPieceOverlaps(piece));
    }
}
