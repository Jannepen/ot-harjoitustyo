
package domain;

import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.domain.Piece;

public class RectangleHandlingTest {
    
    Piece piece;
    Rectangle r;
    
    @Before
    public void setUp() {
        r = new Rectangle(100,20,19,19);
        piece = new Piece(r,r,r,r,0,0);
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
    
}