package domain;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.domain.Piece;

public class PlayingFieldTest {
    
    Piece piece;
    Rectangle r;
    int[][] field;
    
    @Before
    public void setUp() {
        r = new Rectangle(100,20,19,19);
        piece = new Piece(r,r,r,r,0,0);
        field = new int[11][21];
    }
    
    @Test
    public void checkForGameOverReturnsTrueWhenGameOver() {
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[j][i] = 1;
            }
        }
        piece.setField(field);
        assertEquals(true, piece.checkForGameOver());
    }
    
    @Test
    public void pieceToFieldAddsPieceToPlayingField() {
        piece.setField(field);
        piece.createO();
        piece.pieceToField();
        assertEquals(1, field[6][0]);
    }
    
    @Test
    public void checkForLinesAddsALineWhenFound() {
        for (int i = 0; i < field[0].length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (i == 15) {
                    field[j][i] = 1;
                }
            }
        }
        piece.setField(field);
        piece.checkForLines();
        assertEquals(1, piece.getLines());
    }
    
//    @Test
//    public void updateFieldDropsRectanglesAboveFoundLine() {
//        for (int i = 0; i < field[0].length; i++) {
//            for (int j = 0; j < field.length; j++) {
//                if (i == 15) {
//                    field[j][i] = 1;
//                }
//            }
//        }
//        field[5][13] = 1;
//        piece.setField(field);
//        piece.checkForLines();
//        assertEquals(1, field[5][14]);
//    }
}
