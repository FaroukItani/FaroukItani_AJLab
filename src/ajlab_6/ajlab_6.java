/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajlab_6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Viper
 */
public class ajlab_6 extends Application {
    public class MyInnerHandler implements EventHandler<ActionEvent> {
    
    @Override
    public void handle(ActionEvent event){
        System.out.println("Testing Inner Event Handler");
    }
}

    
    @Override
    public void start(Stage primaryStage) {
        MyOuterHandler moh=new MyOuterHandler();
        MyInnerHandler mih=new MyInnerHandler();
        HBox hbox=new HBox();
        
        Button btn = new Button();
        btn.setText("Test in");
        btn.setOnAction(mih);
        Button btn2=new Button();
        btn2.setOnAction(moh);
        btn2.setText("Test out");
        hbox.getChildren().addAll(btn,btn2);
        
        Scene scene = new Scene(hbox, 300, 250);
        
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
