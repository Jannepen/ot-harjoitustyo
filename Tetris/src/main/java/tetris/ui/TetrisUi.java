
package tetris.ui;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import tetris.domain.Piece;

public class TetrisUi extends Application {
    
    public int size = 20;
    public int xmax = 11*size;
    public int ymax = 21*size;
    public Group group = new Group();
    public Piece piece;
    public Scene scene;

    
    @Override
    public void start(Stage window) throws Exception {
        
        piece = new Piece(new Rectangle(0,0), new Rectangle(0,0),new Rectangle(0,0),new Rectangle(0,0),0,0); //initializing piece

        
        piece.newPiece();
        group.getChildren().addAll(piece.getA(),piece.getB(),piece.getC(),piece.getD());
        System.out.println(piece.getPiecenumber());
        
        scene = new Scene(group, xmax, ymax);
        
        moveOnKeyPressed(piece);
        
        window.setScene(scene);
        window.show();
       
        
    }
    
    private void moveOnKeyPressed(Piece piece) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        piece.removePiece(piece);
                        piece.changeForm();
//                        System.out.println(piece.getForm());
//                        System.out.println(piece.getPiecenumber());
                        System.out.println("toimii");
                        System.out.println(piece.getA().getX());
                        System.out.println(piece.getB().getX());
                        group.getChildren().addAll(piece.getA(),piece.getB(),piece.getC(),piece.getD());
                    break;
                }
            }
        });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
