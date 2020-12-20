package application;

import javafx.scene.shape.Rectangle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.application.Piece;

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
    
    @Test
    public void returnsTrueWhenPieceHitsWall() {
        r.setX(-1.0);
        piece.setA(r);
        assertEquals(true, piece.hitsWall());
    }
    
    @Test
    public void returnsfalseWhenPieceDoesntHitWall() {
        piece.createO();
        assertEquals(false, piece.hitsWall());
    }
    
    @Test
    public void turnPieceRotatesIPiece() {
        piece.createI();
        piece.turnPiece();
        assertEquals(1, piece.getForm());
    }
}
