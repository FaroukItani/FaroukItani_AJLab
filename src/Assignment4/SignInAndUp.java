/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Viper
 */
public class SignInAndUp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Image i0=new Image("file:///D:\\AUL HW\\AJLab\\slide0.jpg");
        Image i1=new Image("file:///D:\\AUL HW\\AJLab\\slide1.jpg");
        Image i2=new Image("file:///D:\\AUL HW\\AJLab\\slide2.jpg");
        Image i3=new Image("file:///D:\\AUL HW\\AJLab\\slide3.jpg");
        Image i4=new Image("file:///D:\\AUL HW\\AJLab\\slide4.jpg");
        Image i5=new Image("file:///D:\\AUL HW\\AJLab\\slide5.jpg");
        Image i6=new Image("file:///D:\\AUL HW\\AJLab\\slide6.jpg");
        Image i7=new Image("file:///D:\\AUL HW\\AJLab\\slide7.jpg");
        Image i8=new Image("file:///D:\\AUL HW\\AJLab\\slide8.jpg");
        Image i9=new Image("file:///D:\\AUL HW\\AJLab\\slide9.jpg");
        ImageView img0=new ImageView(i0);
        
        img0.setOpacity(0.2);
        
        signin signin1=new signin();
        signup signup1=new signup();
        StackPane root=new StackPane();
        HBox hb=new HBox();
        Button si=new Button("Sign In");
        Button su=new Button("Sign Up");
        
        hb.setSpacing(10);
        hb.getChildren().addAll(si,su);
        EventHandler slideshow= e->{
            if(img0.getImage().equals(i0))
                img0.setImage(i1);
            else if(img0.getImage().equals(i1))
                img0.setImage(i2);
            else if(img0.getImage().equals(i2))
                img0.setImage(i3);
            else if(img0.getImage().equals(i3))
                img0.setImage(i4);
            else if(img0.getImage().equals(i4))
                img0.setImage(i5);
            else if(img0.getImage().equals(i5))
                img0.setImage(i6);
            else if(img0.getImage().equals(i6))
                img0.setImage(i7);
            else if(img0.getImage().equals(i7))
                img0.setImage(i8);
            else if(img0.getImage().equals(i8))
                img0.setImage(i9);
            else if(img0.getImage().equals(i9))
                img0.setImage(i0);
        };
        Timeline t=new Timeline(new KeyFrame(Duration.millis(2000),slideshow));
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
        si.setOnAction(e->{
            try {
                signin1.start(primaryStage);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SignInAndUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        su.setOnAction(e->{
            signup1.start(primaryStage);
        });
        hb.setAlignment(Pos.CENTER);
        root.getChildren().addAll(img0,hb);
        
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
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
