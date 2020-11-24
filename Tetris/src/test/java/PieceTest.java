
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
        piece = new Piece(r,r,r,r,0,0);
        r = new Rectangle(100,20,19,19);
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
    public void rectangleChangesColorToWhite() {
        piece.changeRectangleColor(r);
        assertEquals(true, r.getFill().equals(Color.WHITE));
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
