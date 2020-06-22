package at.bmlv.gh.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class LauncherApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        URL login = LauncherApp.class.getClassLoader().getResource("login.fxml");
        Parent parent = FXMLLoader.load(login);

        Scene root = new Scene(parent);

        primaryStage.setScene(root);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
}
