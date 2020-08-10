package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            primaryStage.setTitle("Demon Restaurant");
            Parent root = FXMLLoader.load(getClass().getResource("create.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Kính chào quý khách!");
            alert.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
