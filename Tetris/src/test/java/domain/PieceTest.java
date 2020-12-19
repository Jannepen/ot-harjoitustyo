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

public class PieceTest {
    
    Piece piece;
    Rectangle r;
    
    @Before
    public void setUp() {
        r = new Rectangle(100,20,19,19);
        piece = new Piece(r,r,r,r,0,0);
    }
    
    @Test
    public void rotateSChangesTheFormOfSPiece() {
        piece.createS();
        piece.rotateS();
        assertEquals(1, piece.getForm());
    }
    
    @Test 
    public void rotateSChangesToOriginalFormWhenCalledTwice() {
        piece.createS();
        piece.rotateS();
        piece.rotateS();
        assertEquals(0, piece.getForm());
    }
    
        @Test
    public void rotateZChangesTheFormOfZPiece() {
        piece.createZ();
        piece.rotateZ();
        assertEquals(1, piece.getForm());
    }
    
    @Test 
    public void rotateZChangesToOriginalFormWhenCalledTwice() {
        piece.createZ();
        piece.rotateZ();
        piece.rotateZ();
        assertEquals(0, piece.getForm());
    }
    
    @Test
    public void rotateIChangesTheFormOfIPiece() {
        piece.createI();
        piece.rotateI();
        assertEquals(1, piece.getForm());
    }
    
    @Test 
    public void rotateIChangesToOriginalFormWhenCalledTwice() {
        piece.createI();
        piece.rotateI();
        piece.rotateI();
        assertEquals(0, piece.getForm());
    }
    
    @Test
    public void rectangleOutOfBoundsReturnsTrue() {
        r.setX(-1.0);
        assertEquals(true, piece.rectangleOutOfBounds(r));
    }
    
    @Test
    public void returnsTrueWhenRectangleHitsWall() {
        r.setX(-1.0);
        piece.setA(r);
        assertEquals(true, piece.hitsWall());
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
    public void createdRectangleHasCorrectHeight() {
        Rectangle rectangle = piece.rectangleCreator(5,1);
        assertEquals(19, (int)rectangle.getHeight());
    }
    
    @Test
    public void createdRectangleHasCorrectWidth() {
        Rectangle rectangle = piece.rectangleCreator(5,1);
        assertEquals(19, (int)rectangle.getWidth());
    }
    
    @Test
    public void createdRectangleHasCorrectX() {
        Rectangle rectangle = piece.rectangleCreator(5,1);
        assertEquals(100, (int)rectangle.getX());
    }
    
    @Test
    public void createdRectangleHasCorrectY() {
        Rectangle rectangle = piece.rectangleCreator(5,1);
        assertEquals(20, (int)rectangle.getY());
    }

    @Test
    public void rectangleMoverMovesRectangleCorrectlyX() {
        r = piece.rectangleMover(r,1,0);
        assertEquals(120, (int)r.getX());
    }
    
    @Test
    public void rectangleMoverMovesRectangleCorrectlyY() {
        r = piece.rectangleMover(r,0,1);
        assertEquals(40, (int)r.getY());
    }
    
    @Test
    public void createOHasRightPiecenumber() {
        piece = piece.createO();
        assertEquals(0, piece.getPiecenumber());
    }
    
    @Test
    public void createIHasRightPiecenumber() {
        piece = piece.createI();
        assertEquals(1, piece.getPiecenumber());
    }
    
    @Test
    public void createSHasRightPiecenumber() {
        piece = piece.createS();
        assertEquals(2, piece.getPiecenumber());
    }
    
    @Test
    public void createZHasRightPiecenumber() {
        piece = piece.createZ();
        assertEquals(3, piece.getPiecenumber());
    }
    
    @Test
    public void createLHasRightPiecenumber() {
        piece = piece.createL();
        assertEquals(4, piece.getPiecenumber());
    }
    
    @Test
    public void createJHasRightPiecenumber() {
        piece = piece.createJ();
        assertEquals(5, piece.getPiecenumber());
    }
    
    @Test
    public void createTHasRightPiecenumber() {
        piece = piece.createT();
        assertEquals(6, piece.getPiecenumber());
    }
}
