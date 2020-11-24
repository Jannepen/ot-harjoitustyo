
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
//    
//    @Test
//    public void createdRectangleHasCorrectHeight() {
//        Rectangle rectangle = piece.rectangleCreator(5,1);
//        assertEquals(19, (int)rectangle.getHeight());
//    }
//    
//    @Test
//    public void createdRectangleHasCorrectWidth() {
//        Rectangle rectangle = piece.rectangleCreator(5,1);
//        assertEquals(19, (int)rectangle.getWidth());
//    }
//    
//    @Test
//    public void createdRectangleHasCorrectX() {
//        Rectangle rectangle = piece.rectangleCreator(5,1);
//        assertEquals(100, (int)rectangle.getX());
//    }
//    
//    @Test
//    public void createdRectangleHasCorrectY() {
//        Rectangle rectangle = piece.rectangleCreator(5,1);
//        assertEquals(20, (int)rectangle.getY());
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
