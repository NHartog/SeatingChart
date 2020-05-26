package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    //"initializes" and starts projects
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("files/sample.fxml"));
        root.setId("pane");
        root.getStylesheets().add(getClass().getResource("files/main.css").toExternalForm());
        primaryStage.setTitle("Seating Chart");
        primaryStage.setScene(new Scene(root, 830, 755));
        primaryStage.show();
    }

    //starts project

    public static void main(String[] args) {
        launch(args);
    }
}
