
package tetris.ui;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import tetris.domain.Piece;

public class TetrisUi extends Application {
    
    public static final int size = 20;
    public static final int xmax = 11 * size;
    public static final int ymax = 21 * size;
    public static Group group = new Group();
    public static int[][] field = new int[xmax/size][ymax/size];
    public Piece piece;
    public Scene scene;
    
    @Override
    public void start(Stage window) throws Exception {
        
        for (int[] a : field) {
            Arrays.fill(a, 0);
        }
        
        piece = new Piece(new Rectangle(0, 0), new Rectangle(0, 0), new Rectangle(0, 0), new Rectangle(0, 0), 0, 0); //initializing piece
        
        piece.newPiece();
        group.getChildren().addAll(piece.getA(), piece.getB(), piece.getC(), piece.getD());
        
        Line line = new Line(0,size*3,xmax,size*3);
        group.getChildren().add(line);
        
        scene = new Scene(group, xmax, ymax);
        
        moveOnKeyPressed(piece);
        
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    public void run() {
                        piece.moveDown();
                        if (piece.checkForGameOver() == true) {
                            gameOver();
                        }
                    }
                });
            }
        };

        timer.scheduleAtFixedRate(task,1000,300);
        
        window.setScene(scene);
        window.show();
        
        window.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });
    }
    
    private void moveOnKeyPressed(Piece piece) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case UP:
                        piece.turnPiece();
                        break;
                    case RIGHT:
                        piece.moveRight();
                        break;
                    case LEFT:
                        piece.moveLeft();
                        break;
                    case DOWN:
                        piece.moveDown();
                        if (piece.checkForGameOver() == true) {
                            gameOver();
                        }
                        break;
                }
            }
        });
    }
    
    private void gameOver() {
        Text gameover = new Text("GAME OVER");
        gameover.setFill(Color.RED);
        gameover.setStyle("-fx-font: 30 arial;");
        gameover.setY(100);
        gameover.setX(10);
        Text score = new Text("SCORE: " + piece.getLines());
        score.setFill(Color.RED);
        score.setStyle("-fx-font: 30 arial;");
        score.setY(150);
        score.setX(10);
        group.getChildren().addAll(gameover, score);
        exitGame();
    }
    
    private void exitGame() {
        Button exit = new Button();
        exit.setText("EXIT GAME");
        exit.setTranslateX(10);
        exit.setTranslateY(200);
        exit.setOnAction((event) -> {
            System.exit(0);
        });
        group.getChildren().add(exit);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
