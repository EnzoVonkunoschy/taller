package com.example.taller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    boolean produccion = false;
    //boolean produccion = true;

    @Override
    public void start(Stage stage) throws IOException {
        if (produccion) {


        stage.setTitle("Hello!");

        stage.show();
        }else{
            test();
        }
    }

    private void  test(){
        System.out.println("Corriendo tests");
    };
}
