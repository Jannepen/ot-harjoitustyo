
package domain;

import javafx.scene.shape.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.domain.Piece;

public class PieceCreatingTest {
    
    Piece piece;
    Rectangle r;
    
    @Before
    public void setUp() {
        r = new Rectangle(100,20,19,19);
        piece = new Piece(r,r,r,r,0,0);
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
