/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajlab_4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 *
 * @author Viper
 */
public class ControlsDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Line l=new Line(0,0,20,20);
        Polygon p=new Polygon();
        p.getPoints().addAll(new Double[]{200.0,50.0,400.0,50.0,450.0,150.0,400.0,200.0,200.0,200.0,150.0,150.0});
        //p.setStroke(BLUE);
        p.setFill(AQUA);
        p.setStyle("-fx-stroke:blue");
        FlowPane root = new FlowPane();
        root.getChildren().addAll(p,l);
        root.setBackground(new Background(new BackgroundFill(Color.GREEN,new CornerRadii(0),Insets.EMPTY)));
        
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
