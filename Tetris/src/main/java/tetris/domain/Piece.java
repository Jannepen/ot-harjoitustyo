
package tetris.domain;

import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Piece {
    private Rectangle a;
    private Rectangle b;
    private Rectangle c;
    private Rectangle d;
    private int piecenumber;
    private int form;
    private int size = 20;
    
    //constructor
    public Piece(Rectangle a, Rectangle b, Rectangle c, Rectangle d, int piecenumber, int form) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.piecenumber = piecenumber;
        this.form = form;
    }

    //bunch of getters
    public Rectangle getA() {
        return this.a;
    }
    
    public Rectangle getB() {
        return this.b;
    }
    
    public Rectangle getC() {
        return this.c;
    }
    
    public Rectangle getD() {
        return this.d;
    }
    
    public int getPiecenumber() {
        return piecenumber;
    }
    
    public int getForm() {
        return form;
    }
    
    //creates a rectangle when given x and y coordinates
    public Rectangle rectangleCreator(int x, int y) {
        Rectangle rectangle = new Rectangle(size*x, size*y, size-1, size-1);
        return rectangle;
    }
    
    //returns a random number between 0 and 6
    public int randomNumber() {
        Random random = new Random();
        int n = random.nextInt(7);
        return n;
    }
    
    //removes given piece
    public Piece removePiece(Piece piece) {
        changeRectangleColor(piece.getA());
        changeRectangleColor(piece.getB());
        changeRectangleColor(piece.getC());
        changeRectangleColor(piece.getD());
        return piece;
    }
    
    //changes the color of given rectangle to white
    public Rectangle changeRectangleColor(Rectangle rectangle) {
        rectangle.setFill(Color.WHITE);
        return rectangle;
    }
    
    //creates O-piece
    public Piece createO() { 
        a = rectangleCreator(5,0);
        b = rectangleCreator(6,0);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
        return new Piece(a,b,c,d,0,0);
    }
    
    //creates original I-piece
    public Piece createI() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(5,3);
        return new Piece(a,b,c,d,1,0);
    }

    
    //creates S-piece
    public Piece createS() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(6,0);
        c = rectangleCreator(4,1);
        d = rectangleCreator(5,1);
        return new Piece(a,b,c,d,2,0);
    }
    
    //creates Z-piece
    public Piece createZ() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
        return new Piece(a,b,c,d,3,0);
    }
    
    //creates L-piece
    public Piece createL() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(6,2);
        return new Piece(a,b,c,d,4,0);
    }
    
    //creates J-piece
    public Piece createJ() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(4,2);
        return new Piece(a,b,c,d,5,0);
    }
    
    //creates T-piece
    public Piece createT() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(6,0);
        d = rectangleCreator(5,1);
        return new Piece(a,b,c,d,6,0);
    }
    
    //creates a new randomly chosen piece
    public Piece newPiece() {
        piecenumber = randomNumber();
        form = 0;
        
        if (piecenumber == 0){ //creates O-piece
            return createO();
        } else if (piecenumber == 1){ //creates I-piece
            return createI();
        } else if (piecenumber == 2) { //creates S-piece
            return createS();
        } else if (piecenumber == 3) { //creates Z-piece
            return createZ();
        } else if (piecenumber == 4) { //creates L-piece
            return createL();
        } else if (piecenumber == 5) { //creates J-piece
            return createJ();
        } else if (piecenumber == 6) { //creates T-piece
            return createT();
        }else{
            return new Piece(a,b,c,d,piecenumber,form);
        }
    }
    
    //rotates piece when called
    public void changeForm() {
        if (piecenumber == 0) { 
            rotateO();
        } else if (piecenumber == 1) { //rotates I-piece
            rotateI();
        } else if (piecenumber == 2) { //rotates S-piece
            rotateS();
        } else if (piecenumber == 3) { //rotates Z-piece
            rotateZ();
        } else if (piecenumber == 4) { //rotates L-piece
            rotateL();
        } else if (piecenumber == 5) { //rotates J-piece
            rotateJ();
        } else if (piecenumber == 6) { //rotates T-piece
            rotateT();
        }
    }
    
    //moves rectangle by given x and y
    public Rectangle rectangleMover(Rectangle rectangle, int x, int y) {
        rectangle = rectangleCreator((int)rectangle.getX()/size+x,(int)rectangle.getY()/size+y);
        return rectangle;
    }

    
    public Piece rotateO() {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,0,0);
            c = rectangleMover(c,0,0);
            d = rectangleMover(d,0,0);
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
    //rotates I-piece
    public Piece rotateI() {
        if (form == 0) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,-2,-1);
            c = rectangleMover(c,-1,-2);
            d = rectangleMover(d,1,-3);
            form = 1;
        } else if (form == 1) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,2,1);
            c = rectangleMover(c,1,2);
            d = rectangleMover(d,-1,3);
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
    //rotates S-piece
    public Piece rotateS() {
        if (form == 0) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,-1,1);
            c = rectangleMover(c,2,0);
            d = rectangleMover(d,1,1);
            form = 1;
        } else if (form == 1) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,1,-1);
            c = rectangleMover(c,-2,0);
            d = rectangleMover(d,-1,-1);
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
    //rotates Z-piece
    public Piece rotateZ() {
        if (form == 0) {
            a = rectangleMover(a,1,0);
            b = rectangleMover(b,0,1);
            c = rectangleMover(c,-1,0);
            d = rectangleMover(d,-2,1);
            form = 1;
        } else if (form == 1) {
            a = rectangleMover(a,-1,0);
            b = rectangleMover(b,0,-1);
            c = rectangleMover(c,1,0);
            d = rectangleMover(d,2,-1);
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
        //rotates L-piece
    public Piece rotateL() {
        if (form == 0) {
            a = rectangleMover(a,-1,0);
            b = rectangleMover(b,0,-1);
            c = rectangleMover(c,1,-2);
            d = rectangleMover(d,-2,-1);
            form = 1;
        } else if (form == 1) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,0,0);
            c = rectangleMover(c,-1,1);
            d = rectangleMover(d,1,1);
            form = 2;
        } else if (form == 2) {
            a = rectangleMover(a,2,0);
            b = rectangleMover(b,-1,1);
            c = rectangleMover(c,0,0);
            d = rectangleMover(d,1,-1);
            form = 3;
        } else if (form == 3) {
            a = rectangleMover(a,-1,0);
            b = rectangleMover(b,1,0);
            c = rectangleMover(c,0,1);
            d = rectangleMover(d,0,1);
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
        //rotates L-piece
    public Piece rotateJ() {
        if (form == 0) {
            a = rectangleMover(a,-1,0);
            b = rectangleMover(b,-1,0);
            c = rectangleMover(c,0,-1);
            d = rectangleMover(d,2,-1);
            form = 1;
        } else if (form == 1) {
            a = rectangleMover(a,1,0);
            b = rectangleMover(b,2,-1);
            c = rectangleMover(c,0,0);
            d = rectangleMover(d,-1,1);
            form = 2;
        } else if (form == 2) {
            a = rectangleMover(a,-1,0);
            b = rectangleMover(b,-1,0);
            c = rectangleMover(c,1,-1);
            d = rectangleMover(d,1,-1);
            form = 3;
        } else if (form == 3) {
            a = rectangleMover(a,1,0);
            b = rectangleMover(b,0,1);
            c = rectangleMover(c,-1,2);
            d = rectangleMover(d,-2,1);
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
        //rotates L-piece
    public Piece rotateT() {
        if (form == 0) {
            a = rectangleMover(a,1,0);
            b = rectangleMover(b,-1,1);
            c = rectangleMover(c,-1,1);
            d = rectangleMover(d,0,1);
            form = 1;
        } else if (form == 1) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,0,0);
            c = rectangleMover(c,0,0);
            d = rectangleMover(d,1,-1);
            form = 2;
        } else if (form == 2) {
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,1,0);
            c = rectangleMover(c,0,1);
            d = rectangleMover(d,0,0);
            form = 3;
        } else if (form == 3) {
            a = rectangleMover(a,-1,0);
            b = rectangleMover(b,0,-1);
            c = rectangleMover(c,1,-2);
            d = rectangleMover(d,-1,0);
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
}
