/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFinalFx.Util;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 *
 * @author admin
 */
public class Main extends Application {
    Parent root1,root2;
    Stage window;
    Scene scene1,scene2;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage window) throws IOException {
//        root1= FXMLLoader.load(getClass().getResource("Controller/Model.fxml"));
        root1= FXMLLoader.load(getClass().getResource("../View/mainScreen.fxml"));
        scene1 = new Scene(root1);
        window.setTitle("Cornerstone Student management tool");
        window.setScene(scene1);
        window.show();


    }
}
