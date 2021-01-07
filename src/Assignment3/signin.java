package Assignment3;

import Assignment1.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import static javafx.scene.text.FontWeight.BOLD;
import javafx.stage.Stage;

/**
 *
 * @author Viper
 */
public class signin extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        Image image=new Image("https://i.picsum.photos/id/480/200/200.jpg?hmac=q_kzh_8Ih85_5t_jN3rcD3npeNBLA41oDGtQZVkmmYs",200,200,true,true);
        ImageView image1=new ImageView(image);
        
        GridPane p=new GridPane();
//        Label l1=new Label("Welcome");
//        l1.setFont(Font.font("Arial",BOLD,25));
        p.add(image1, 0, 0);
        p.add(new Label("Username"), 0, 1);
        p.add(new Label("Password"), 0, 2);
        p.add(new TextField(), 1, 1);
        p.add(new TextField(), 1, 2);
        Button btn=new Button("Login");
        p.add(btn, 1, 3);
        GridPane.setHalignment(btn, HPos.RIGHT);
        p.setVgap(20);
        
        p.setAlignment(Pos.CENTER);
        Scene scene = new Scene(p, 500, 500);
        
        primaryStage.setTitle("Welcome");
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
