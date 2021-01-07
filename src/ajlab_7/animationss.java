package ajlab_7;

import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Viper
 */
public class animationss extends Application {
    Transition setTranslateTransition(Node node){
        TranslateTransition tt=new TranslateTransition();
        tt.setNode(node);
        tt.setDuration(Duration.millis(2000));
        tt.setCycleCount(2);
        tt.setAutoReverse(true);
        tt.setByX(300);
        return tt;
    }
    
    ScaleTransition setScaleTransition(Node node){
        ScaleTransition st=new ScaleTransition();
        st.setNode(node);
        st.setDuration(Duration.millis(2000));
        st.setCycleCount(2);
        st.setAutoReverse(true);
        st.setToX(5);
        st.setToY(5);
        return st;
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle c=new Circle(50);
        c.setCenterX(150);
        c.setCenterY(300);
        c.setFill(Color.BLUE);
        
        Transition tt=this.setTranslateTransition(c);

        ScaleTransition st=this.setScaleTransition(c);

        SequentialTransition str=new SequentialTransition(tt,st);
//        str.play();
        ParallelTransition pt=new ParallelTransition(tt,st);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();
        Group root=new Group(c);
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
