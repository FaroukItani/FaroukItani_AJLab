package Assignment2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Viper
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
        HBox hb1=new HBox();
        HBox hb2=new HBox();
        GridPane root=new GridPane();
        Label name=new Label("Name");
        Label email=new Label("Email");
        Label phone=new Label("Phone");
        Label password=new Label("Password");
        Label cp=new Label("Confirm");
        Label country=new Label("Country");
        Label gender=new Label("Gender");
        Label lang=new Label("Language");
        Label about=new Label("About you");
        root.addColumn(0, name,email,phone,password,cp,country,gender,lang,about);

        TextField text1=new TextField();
        text1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
                public void handle(ActionEvent e){
        Label digits=new Label("Name should not include digits");
        if(text1.getText().contains("0"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("1"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("2"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("3"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("4"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("5"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("6"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("7"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("8"))
                root.add(digits, 1, 11);
        if(text1.getText().contains("9"))
                root.add(digits, 1, 11);
        }
        });
    
        TextField text2=new TextField();
        text2.setOnAction(new EventHandler<ActionEvent>(){
        @Override
                public void handle(ActionEvent e){
        Label iemail=new Label("Invalid Email");
        if(!text2.getText().contains("@"))
            root.add(iemail, 1, 12);
        }
        });
        TextField text3=new TextField();
        PasswordField p1=new PasswordField();
        p1.setOnAction(new EventHandler<ActionEvent>(){
        @Override
                public void handle(ActionEvent e){
        Label ipass=new Label("Pass cant contain more than 8 characters");
        if(p1.getLength()>8)
            root.add(ipass, 1, 13);
        }
        });
        PasswordField p2=new PasswordField();
        ComboBox cb=new ComboBox();
        String s1="Select a country";
        String s2="Lebanon";
        String s3="Egypt";
        String s4="USA";
        String s5="Palestine";
        cb.getSelectionModel().select(s1);
        cb.getItems().addAll(s2,s3,s4,s5);
        RadioButton rb1=new RadioButton("Male");
        RadioButton rb2=new RadioButton("Female");
        ToggleGroup grp=new ToggleGroup();
        rb1.setToggleGroup(grp);
        rb2.setToggleGroup(grp);
        hb1.getChildren().addAll(rb1,rb2);
        CheckBox check1=new CheckBox("Arabic");
        CheckBox check2=new CheckBox("English");
        CheckBox check3=new CheckBox("Spanish");
        hb2.getChildren().addAll(check1,check2,check3);
        TextArea ta=new TextArea();
        ta.setPrefHeight(100);
        ta.setPrefWidth(100);
        Button register=new Button("Register");
        register.setPrefWidth(200);
        
        root.addColumn(1, text1,text2,text3,p1,p2,cb,hb1,hb2,ta,register);
        
 
        
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
