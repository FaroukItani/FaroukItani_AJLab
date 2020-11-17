/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajlab_1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static javafx.scene.paint.Color.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Viper
 */
public class AJLab extends Application {

    public Text createtext(){
        Text t=new Text(10,20,"Advanced Java");
        t.setFont(Font.font("Arial",FontPosture.ITALIC,20));
        t.setUnderline(true);
        t.setFill(BLUE);
        return t;
    }
    
    ImageView createpath() throws FileNotFoundException{
        InputStream in=new FileInputStream("D:\\skull.png");
        Image image=new Image(in,400,400,true,true);
        ImageView image1=new ImageView(image);
        return image1;
    }
    
    ImageView createIV(){
        Image image=new Image("https://homepages.cae.wisc.edu/~ece533/images/fruits",200,200,true,true);
        ImageView image1=new ImageView(image);
        
        return image1;
    }
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        VBox vbox=new VBox(createtext(),createIV(),createpath());

        
        Scene scene = new Scene(vbox, 300, 250);
        scene.setFill(AQUA);
        
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
