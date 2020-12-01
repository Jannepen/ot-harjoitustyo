
package tetris.ui;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import tetris.domain.Piece;
import tetris.domain.Mover;

public class TetrisUi extends Application {
    
    public int size = 20;
    public int xmax = 11 * size;
    public int ymax = 21 * size;
    public Group group = new Group();
    public Piece piece;
    public Scene scene;
    public ArrayList<Rectangle> rectangles;
//    public Mover mover;

    
    @Override
    public void start(Stage window) throws Exception {
        
        piece = new Piece(new Rectangle(0, 0), new Rectangle(0, 0), new Rectangle(0, 0), new Rectangle(0, 0), 0, 0); //initializing piece
        rectangles = new ArrayList<>();
        Rectangle aaa = new Rectangle(size*5,size*10,size-1,size-1);
        Rectangle aab = new Rectangle(size*6,size*10,size-1,size-1);
        
        piece.newPiece();
        group.getChildren().addAll(piece.getA(), piece.getB(), piece.getC(), piece.getD());
        
        scene = new Scene(group, xmax, ymax);
        
        moveOnKeyPressed(piece);
        
        window.setScene(scene);
        window.show();
    }
    
    private void removePiece(Piece p) {
        group.getChildren().remove(p.getA());
        group.getChildren().remove(p.getB());
        group.getChildren().remove(p.getC());
        group.getChildren().remove(p.getD());
    }
    
    private void moveDown() {
        if (!piece.canDrop()) {
            piece.newPiece();
            return;
        }
        removePiece(piece);
        piece.moveDown();
        group.getChildren().addAll(piece.getA(), piece.getB(), piece.getC(), piece.getD());
    }
    
    private void moveRight() {
        if (!piece.canGoRight()) {
            return;
        }
        removePiece(piece);
        piece.moveRight();
        group.getChildren().addAll(piece.getA(), piece.getB(), piece.getC(), piece.getD());
    }
    
    private void moveLeft() {
        if (!piece.canGoLeft()) {
            return;
        }
        removePiece(piece);
        piece.moveLeft();
        group.getChildren().addAll(piece.getA(), piece.getB(), piece.getC(), piece.getD());
    }
    
    private void turnPiece() {
        if (piece.hitsWall()) {
            return;
        }
        removePiece(piece);
        piece.changeForm();
        group.getChildren().addAll(piece.getA(), piece.getB(), piece.getC(), piece.getD());
    }
    
    private void moveOnKeyPressed(Piece piece) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        turnPiece();
                        break;
                    case RIGHT:
                        moveRight();
                        break;
                    case LEFT:
                        moveLeft();
                        break;
                    case DOWN:
                        moveDown();
                        break;
                }
            }
        });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
