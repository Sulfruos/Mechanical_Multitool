package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("file1.fxml"));
        Parent root1 = loader.load();
        Scene scene1 = new Scene(root1, 1000, 750);
        primaryStage.setTitle("Mechanical Multitool");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }

}
