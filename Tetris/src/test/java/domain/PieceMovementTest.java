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

public class PieceMovementTest {
    
    Piece piece;
    Rectangle r;
    
    @Before
    public void setUp() {
        r = new Rectangle(100,20,19,19);
        piece = new Piece(r,r,r,r,0,0);
    }
    
    @Test
    public void pieceMovesDownCorrectly() {
        piece.moveDown();
        assertEquals(40, (int)piece.getA().getY());
    }
    
    @Test
    public void pieceMovesToTheRightCorrectly() {
        piece.moveRight();
        assertEquals(120, (int)piece.getB().getX());
    }
    
    @Test
    public void pieceMovesToTheLeftCorrectly() {
        piece.moveLeft();
        assertEquals(80, (int)piece.getB().getX());
    }
}
