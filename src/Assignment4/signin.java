package Assignment4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Viper
 */
public class signin extends Application {
    String user,pass;
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        
        
//        DataInputStream input=new DataInputStream(new FileInputStream(file));
//        DataOutputStream output=new DataOutputStream(new FileOutputStream(file));

        Image image=new Image("https://i.picsum.photos/id/480/200/200.jpg?hmac=q_kzh_8Ih85_5t_jN3rcD3npeNBLA41oDGtQZVkmmYs",200,200,true,true);
        ImageView image1=new ImageView(image);
        
        GridPane p=new GridPane();
//        Label l1=new Label("Welcome");
//        l1.setFont(Font.font("Arial",BOLD,25));
        p.add(image1, 0, 0);
        p.add(new Label("Username"), 0, 1);
        p.add(new Label("Password"), 0, 2);
        TextField username=new TextField();
        TextField password=new TextField();
        p.add(username, 1, 1);
        p.add(password, 1, 2);
        Button btn=new Button("Login");
        p.add(btn, 1, 3);
        GridPane.setHalignment(btn, HPos.RIGHT);
        p.setVgap(20);
        
        
        
//        user=username.getText();
//        pass=password.getText();
//        username.setOnAction(e->{
//            if(username.getText().contains("s"))
//                System.out.println("test");
//        });
        btn.setOnAction(e->{
            File file=new File("users.txt");
            Scanner fileScan;
            try {
                fileScan = new Scanner(file);
                fileScan.nextLine();
                fileScan.nextLine();
            
            while(fileScan.hasNext()){
                if(fileScan.next().equalsIgnoreCase(username.getText()))
                {
                    if(fileScan.next().equals(password.getText())){
                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Logged in");
                    a.show();
                    break;
                    }
                    else{
                        Alert b=new Alert(Alert.AlertType.WARNING);
                        b.setContentText("Wrong password");
                        b.show();
                        break;
                    }
                }
                else{
                    if(fileScan.next().equals(password.getText())){
                    Alert a=new Alert(Alert.AlertType.WARNING);
                    a.setContentText("Wrong username");
                    a.show();
                    break;
                    }
                }
        }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(signin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            System.out.println("It doesn't exist");
            
        });
        
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
