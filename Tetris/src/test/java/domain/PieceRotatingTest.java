
package domain;

import javafx.scene.shape.Rectangle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tetris.domain.Piece;

public class PieceRotatingTest {
    
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

}