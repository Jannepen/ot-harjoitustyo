
package tetris.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TetrisUi extends Application {
    
    @Override
    public void start(Stage window) throws Exception {
        window.setTitle("Hello world");
        window.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
