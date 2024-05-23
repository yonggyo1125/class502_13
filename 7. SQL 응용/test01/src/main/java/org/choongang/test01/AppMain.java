package org.choongang.test01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("root2.fxml"));
        Scene scene = new Scene(root);

        stage.setTitle("AppMain");
        stage.setScene(scene);
        stage.show();
        //stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
