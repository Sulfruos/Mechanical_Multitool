package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.*;
import javafx.event.*;
import java.util.Optional;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;




public class Controller2
{
    public Button notepadButton;
    public Button todoButton;
    public Button timerButton;
    public Button sketchButton;
    public Button pauseButton;
    public TextField timeLeft;
    public boolean doTimer = true;
    public boolean isPause = true;
    public Stage stage;
    public boolean isFinished = false;



    public void getStage()
    {
        stage = this.stage;
    }
/*
    public void playIt()
    {
        if (isFinished)
        {
            String musicFile = "Alarm-Fast.mp3";

            Media sound = new Media(new File(musicFile).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();
            isFinished = false;
        }
    */


    public Timeline timerstuff = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
            if (doTimer && (timeLeft.getText() != "0:00") && (timeLeft.getText() != "0:0"))
            {
                String content = timeLeft.getText();
                char[] parser = content.toCharArray();
                int removeIndex = 0;
                for (int i = 0; i < parser.length; i++) {
                    if (parser[i] == ':') {
                        removeIndex = i;
                    }
                }

                char[] newArray = new char[parser.length - 1];

                for (int j = 0, k = 0; j < parser.length; j++) {
                    if (j == removeIndex) {

                    } else {
                        newArray[k++] = parser[j];
                    }
                }

                if (newArray.length == 2)
                {
                    String toConvert = Character.toString(newArray[0]);

                    int toConvert2 = Integer.parseInt(toConvert);

                    int toConvert3 = toConvert2 * 60;

                    String toConvert4 = Character.toString(newArray[1]);

                    int toConvert6 = Integer.parseInt(toConvert4);

                    int toConvert8 = (toConvert6);

                    int toConvert9 = (toConvert3 + toConvert8) - 1;

                    int toConvert10 = toConvert9 / 60;
                    int toConvert11 = toConvert9 % 60;

                    timeLeft.setText(toConvert10 + ":" + toConvert11);
                }
                if (newArray.length == 3)
                {
                    String toConvert = Character.toString(newArray[0]);

                    int toConvert2 = Integer.parseInt(toConvert);

                    int toConvert3 = toConvert2 * 60;

                    String toConvert4 = Character.toString(newArray[1]);
                    String toConvert5 = Character.toString(newArray[2]);
                    int toConvert6 = Integer.parseInt(toConvert4);
                    int toConvert7 = Integer.parseInt(toConvert5);

                    int toConvert8 = ((toConvert6 * 10) + toConvert7);

                    int toConvert9 = (toConvert3 + toConvert8) - 1;

                    int toConvert10 = toConvert9 / 60;
                    int toConvert11 = toConvert9 % 60;

                    timeLeft.setText(toConvert10 + ":" + toConvert11);
                }
                else if (newArray.length == 4)
                {
                    String toConvert = Character.toString(newArray[0]);
                    String toConvert2 = Character.toString(newArray[1]);

                    int toConvert3 = Integer.parseInt(toConvert);
                    int toConvert4 = Integer.parseInt(toConvert2);

                    int toConvert5 = ((toConvert3 * 10) + toConvert4);

                    int toConvert6 = toConvert5 * 60;

                    String toConvert7 = Character.toString(newArray[2]);
                    String toConvert8 = Character.toString(newArray[3]);
                    int toConvert9 = Integer.parseInt(toConvert7);
                    int toConvert10 = Integer.parseInt(toConvert8);

                    int toConvert11 = ((toConvert9 * 10) + toConvert10);

                    int toConvert12 = (toConvert6 + toConvert11) - 1;
                    int toConvert13 = toConvert12 / 60;
                    int toConvert14 = toConvert12 % 60;

                    timeLeft.setText(toConvert13 + ":" + toConvert14);
                }

            }

        }
    }));

    public void whenNotepadPressed(ActionEvent actionEvent) throws Exception
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirm Switch");
        alert.setHeaderText("Are you sure you want to switch programs? This will discard the current timer.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Stage stage;
            Parent root;
            stage = (Stage) timerButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file1.fxml"));
            root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }



    public void whenTodoPressed(ActionEvent actionEvent) throws Exception
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirm Switch");
        alert.setHeaderText("Are you sure you want to switch programs? This will discard the current timer.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            Stage stage;
            Parent root;
            stage = (Stage) todoButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file3.fxml"));
            root = loader.load();
            Controller3 todoController = loader.getController();
            todoController.loadData();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void whenTimerPressed(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirm Switch");
        alert.setHeaderText("Are you sure you want to switch programs? This will discard the current timer.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK)
        {
            Stage stage;
            Parent root;
            stage = (Stage) timerButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/sample/file2.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void whenSketchPressed(ActionEvent actionEvent) throws Exception
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirm Switch");
        //Text text1 = new Text("Are you sure you want to switch programs? This will discard the current timer.");
        //Font font = Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12);
        alert.setHeaderText("Are you sure you want to switch programs? This will discard the current timer.");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK)
        {
            Stage stage;
            Parent root;
            stage = (Stage) sketchButton.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file4.fxml"));
            root = loader.load();
            Controller4 sketchController = loader.getController();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void whenStartPressed(ActionEvent actionEvent)
    {
        timerstuff.stop();
        pauseButton.setText("Pause");
        isPause = true;
        String content = timeLeft.getText();
        char[] parser = content.toCharArray();
        int removeIndex = 0;
        for (int i = 0; i < parser.length; i++) {
            if (parser[i] == ':') {
                removeIndex = i;
            }
        }

        char[] newArray = new char[parser.length - 1];

        for (int j = 0, k = 0; j < parser.length; j++) {
            if (j == removeIndex) {

            } else {
                newArray[k++] = parser[j];
            }
        }

        //now we have an array of characters of all the integers, no colon


        String transition = String.copyValueOf(newArray);

        int timeTransition = Integer.parseInt(transition); //time without colon. still needs sorting

        int time = 0;

        if (newArray.length == 2) {
            time = timeTransition; //if under a minute, just countdown
        } else if (newArray.length == 3) {
            String toConvert = Character.toString(newArray[0]);

            int toConvert2 = Integer.parseInt(toConvert);

            int toConvert3 = toConvert2 * 60;

            String toConvert4 = Character.toString(newArray[1]);
            String toConvert5 = Character.toString(newArray[2]);
            int toConvert6 = Integer.parseInt(toConvert4);
            int toConvert7 = Integer.parseInt(toConvert5);

            int toConvert8 = ((toConvert6 * 10) + toConvert7);

            int finalConversion = toConvert3 + toConvert8;

            time = finalConversion;
        } else if (newArray.length == 4) {
            String toConvert = Character.toString(newArray[0]);
            String toConvert2 = Character.toString(newArray[1]);

            int toConvert3 = Integer.parseInt(toConvert);
            int toConvert4 = Integer.parseInt(toConvert2);

            int toConvert5 = ((toConvert3 * 10) + toConvert4);

            int toConvert6 = toConvert5 * 60;

            String toConvert7 = Character.toString(newArray[2]);
            String toConvert8 = Character.toString(newArray[3]);
            int toConvert9 = Integer.parseInt(toConvert7);
            int toConvert10 = Integer.parseInt(toConvert8);

            int toConvert11 = ((toConvert9 * 10) + toConvert10);

            int finalConversion = toConvert6 + toConvert11;

            time = finalConversion;
        }

        timerstuff.setCycleCount(time);
        timerstuff.play();
        timerstuff.setOnFinished(event -> {
            isFinished = true;
            System.out.println("Done!");
        });;


    }

    public void whenPausePressed(ActionEvent actionEvent)
    {
        if (isPause)
        {
            timerstuff.stop();
            isPause = false;
            pauseButton.setText("Reset");
        }
        else //stop button
        {
            timerstuff.stop();
            timeLeft.setText("0:00");
            pauseButton.setText("Pause");
            isPause = true;
        }
    }






}


