
package tetris.ui;

import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TetrisUi extends Application {
    
    public int size = 20;
    public int xmax = 11*size;
    public int ymax = 21*size;
    public Group group = new Group();
    
    @Override
    public void start(Stage window) throws Exception {
        
        newPiece();
        
        Scene scene = new Scene(group, xmax, ymax);
        
        window.setScene(scene);
        window.show();
       
        
    }
    
    public void newPiece() {
        
        Random random = new Random();
        
        int n = random.nextInt(7);
        
        if (n == 0){
            Rectangle a = new Rectangle(size*5,0,size-1,size-1);
            Rectangle b = new Rectangle(size*6,0,size-1,size-1);
            Rectangle c = new Rectangle(size*5,size*1,size-1,size-1);
            Rectangle d = new Rectangle(size*6,size*1,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        } else if (n == 1){
            Rectangle a = new Rectangle(size*5,0,size-1,size-1);
            Rectangle b = new Rectangle(size*5,size*1,size-1,size-1);
            Rectangle c = new Rectangle(size*5,size*2,size-1,size-1);
            Rectangle d = new Rectangle(size*5,size*3,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        } else if (n == 2) {
            Rectangle a = new Rectangle(size*5,0,size-1,size-1);
            Rectangle b = new Rectangle(size*6,0,size-1,size-1);
            Rectangle c = new Rectangle(size*4,size*1,size-1,size-1);
            Rectangle d = new Rectangle(size*5,size*1,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        } else if (n == 3) {
            Rectangle a = new Rectangle(size*4,0,size-1,size-1);
            Rectangle b = new Rectangle(size*5,0,size-1,size-1);
            Rectangle c = new Rectangle(size*5,size*1,size-1,size-1);
            Rectangle d = new Rectangle(size*6,size*1,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        } else if (n == 4) {
            Rectangle a = new Rectangle(size*5,0,size-1,size-1);
            Rectangle b = new Rectangle(size*5,size*1,size-1,size-1);
            Rectangle c = new Rectangle(size*5,size*2,size-1,size-1);
            Rectangle d = new Rectangle(size*6,size*2,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        } else if (n == 5) {
            Rectangle a = new Rectangle(size*5,0,size-1,size-1);
            Rectangle b = new Rectangle(size*5,size*1,size-1,size-1);
            Rectangle c = new Rectangle(size*5,size*2,size-1,size-1);
            Rectangle d = new Rectangle(size*4,size*2,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        } else if (n == 6) {
            Rectangle a = new Rectangle(size*4,0,size-1,size-1);
            Rectangle b = new Rectangle(size*5,0,size-1,size-1);
            Rectangle c = new Rectangle(size*6,0,size-1,size-1);
            Rectangle d = new Rectangle(size*5,size*1,size-1,size-1);
            group.getChildren().addAll(a,b,c,d);
        }
        
    }

    
    
    public static void main(String[] args) {
        launch(args);
    }
}
