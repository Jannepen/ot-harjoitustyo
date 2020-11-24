
package tetris.domain;

import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Piece {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    int piecenumber;
    int form;
    int size = 20;
    
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
        Rectangle rectangle = new Rectangle(size*x,size*y,size-1,size-1);
        return rectangle;
    }
    
    //returns a random number between 0 and 6
    public int randomNumber() {
        Random random = new Random();
        int n = random.nextInt(7);
        return 1;
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
    public void createO() { 
        a = rectangleCreator(5,0);
        b = rectangleCreator(6,0);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
    }
    
    //creates original I-piece
    public void createI() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(5,3);
    }
    
    //creates second form of I-piece
    public void createI2() {
        a = rectangleCreator(3,0);
        b = rectangleCreator(4,0);
        c = rectangleCreator(5,0);
        d = rectangleCreator(6,0);
    }
    
    //creates S-piece
    public void createS() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(6,0);
        c = rectangleCreator(4,1);
        d = rectangleCreator(5,1);
    }
    
    //creates second form of S-piece
    public void createS2() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(6,1);
        d = rectangleCreator(6,2);
    }
    
    //creates Z-piece
    public void createZ() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
    }
    
    //creates second form of Z-piece
    public void createZ2() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(4,1);
        d = rectangleCreator(4,2);
    }
    
    //creates L-piece
    public void createL() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(6,2);
    }
    
    //creates second form of L-piece
    public void createL2() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(6,0);
        d = rectangleCreator(4,1);
    }
    
        //creates third form of L-piece
    public void createL3() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(5,1);
        d = rectangleCreator(5,2);
    }
    
        //creates fourth form of L-piece
    public void createL4() {
        a = rectangleCreator(6,0);
        b = rectangleCreator(4,1);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
    }
    
    //creates J-piece
    public void createJ() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(4,2);
    }
    
    //creates second form of J-piece
    public void createJ2() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(4,1);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
    }
    
    //creates third form of J-piece
    public void createJ3() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(6,0);
        c = rectangleCreator(5,1);
        d = rectangleCreator(5,2);
    }
    
    //creates fourth form of J-piece
    public void createJ4() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(6,0);
        d = rectangleCreator(6,1);
    }
    
    //creates T-piece
    public void createT() {
        a = rectangleCreator(4,0);
        b = rectangleCreator(5,0);
        c = rectangleCreator(6,0);
        d = rectangleCreator(5,1);
    }
    
    //creates second form of T-piece
    public void createT2() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(4,1);
        c = rectangleCreator(5,1);
        d = rectangleCreator(5,2);
    }
    
    //creates third form of T-piece
    public void createT3() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(4,1);
        c = rectangleCreator(5,1);
        d = rectangleCreator(6,1);
    }

    //creates fourth form of T-piece
    public void createT4() {
        a = rectangleCreator(5,0);
        b = rectangleCreator(5,1);
        c = rectangleCreator(5,2);
        d = rectangleCreator(6,1);
    }
    
    //creates a new randomly chosen piece
    public Piece newPiece() {
        piecenumber = randomNumber();
        form = 0;
        
        if (piecenumber == 0){ //creates O-piece
            createO();
        } else if (piecenumber == 1){ //creates I-piece
            createI();
        } else if (piecenumber == 2) { //creates S-piece
            createS();
        } else if (piecenumber == 3) { //creates Z-piece
            createZ();
        } else if (piecenumber == 4) { //creates L-piece
            createL();
        } else if (piecenumber == 5) { //creates J-piece
            createJ();
        } else if (piecenumber == 6) { //creates T-piece
            createT();
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
    //rotates piece when called
    public void changeForm() {
        if (piecenumber == 0) { 
            createO();
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
    
//    //creates original I-piece
//    public void createI() {
//        a = rectangleCreator(5,0);
//        b = rectangleCreator(5,1);
//        c = rectangleCreator(5,2);
//        d = rectangleCreator(5,3);
//    }
    
    public Rectangle rectangleMover(Rectangle rectangle, int x, int y) {
        rectangle = rectangleCreator((int)rectangle.getX()/size+x,(int)rectangle.getY()/size+y);
        return rectangle;
    }
    
    //rotates I-piece
    public Piece rotateI() {
        if (form == 0) {
//            createI2();
            a = rectangleMover(a,0,0);
            b = rectangleMover(b,-2,-1);
            c = rectangleMover(c,-1,-2);
            d = rectangleMover(d,1,-3);
//            b = rectangleCreator((int)b.getX()/size-2,(int)b.getY()/size-1);
//            c = rectangleCreator((int)c.getX()/size-1,(int)c.getY()/size-2);
//            d = rectangleCreator((int)d.getX()/size+1,(int)d.getY()/size-3);
//            a = rectangleCreator(5,0);
//            b = rectangleCreator(3,0);
//            c = rectangleCreator(4,0);
//            d = rectangleCreator(6,0);
            form = 1;
        } else if (form == 1) {
            createI();
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
    //rotates S-piece
    public Piece rotateS() {
        if (form == 0) {
            createS2();
            form = 1;
        } else if (form == 1) {
            createS();
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
    //rotates Z-piece
    public Piece rotateZ() {
        if (form == 0) {
            createZ2();
            form = 1;
        } else if (form == 1) {
            createZ();
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
        //rotates L-piece
    public Piece rotateL() {
        if (form == 0) {
            createL2();
            form = 1;
        } else if (form == 1) {
            createL3();
            form = 2;
        } else if (form == 2) {
            createL4();
            form = 3;
        } else if (form == 3) {
            createL();
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
        //rotates L-piece
    public Piece rotateJ() {
        if (form == 0) {
            createJ2();
            form = 1;
        } else if (form == 1) {
            createJ3();
            form = 2;
        } else if (form == 2) {
            createJ4();
            form = 3;
        } else if (form == 3) {
            createJ();
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
    
        //rotates L-piece
    public Piece rotateT() {
        if (form == 0) {
            createT2();
            form = 1;
        } else if (form == 1) {
            createT3();
            form = 2;
        } else if (form == 2) {
            createT4();
            form = 3;
        } else if (form == 3) {
            createT();
            form = 0;
        }
        return new Piece(a,b,c,d,piecenumber,form);
    }
}
