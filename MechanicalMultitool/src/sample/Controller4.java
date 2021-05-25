package sample;

import javafx.scene.control.*;
import javafx.event.*;
import java.io.IOException;
import java.nio.file.*;
import java.io.File;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Controller4
{
    public Button notepadButton;
    public Button todoButton;
    public Button timerButton;
    public Button sketchButton;
    public Button square1;
    public Button square2;
    public Button square3;
    public Button square4;
    public Button square5;
    public Button square6;
    public Button square7;
    public Button square8;
    public Button square9;
    public Button square10;
    public Button square11;
    public Button square12;
    public Button square13;
    public Button square14;
    public Button square15;
    public Button square16;
    public Button square17;
    public Button square18;
    public Button square19;
    public Button square20;
    public Button square21;
    public Button square22;
    public Button square23;
    public Button square24;
    public Button square25;
    public Button square26;
    public Button square27;
    public Button square28;
    public Button square29;
    public Button square30;
    public Button square31;
    public Button square32;
    public Button square33;
    public Button square34;
    public Button square35;
    public Button square36;
    public Button square37;
    public Button square38;
    public Button square39;
    public Button square40;
    public Button square41;
    public Button square42;
    public Button square43;
    public Button square44;
    public Button square45;
    public Button square46;
    public Button square47;
    public Button square48;
    public Button square49;
    public Button square50;
    public Button square51;
    public Button square52;
    public Button square53;
    public Button square54;
    public Button square55;
    public Button square56;
    public Button square57;
    public Button square58;
    public Button square59;
    public Button square60;
    public Button square61;
    public Button square62;
    public Button square63;
    public Button square64;
    public boolean square1white = true;
    public boolean square2white = true;
    public boolean square3white = true;
    public boolean square4white = true;
    public boolean square5white = true;
    public boolean square6white = true;
    public boolean square7white = true;
    public boolean square8white = true;
    public boolean square9white = true;
    public boolean square10white = true;
    public boolean square11white = true;
    public boolean square12white = true;
    public boolean square13white = true;
    public boolean square14white = true;
    public boolean square15white = true;
    public boolean square16white = true;
    public boolean square17white = true;
    public boolean square18white = true;
    public boolean square19white = true;
    public boolean square20white = true;
    public boolean square21white = true;
    public boolean square22white = true;
    public boolean square23white = true;
    public boolean square24white = true;
    public boolean square25white = true;
    public boolean square26white = true;
    public boolean square27white = true;
    public boolean square28white = true;
    public boolean square29white = true;
    public boolean square30white = true;
    public boolean square31white = true;
    public boolean square32white = true;
    public boolean square33white = true;
    public boolean square34white = true;
    public boolean square35white = true;
    public boolean square36white = true;
    public boolean square37white = true;
    public boolean square38white = true;
    public boolean square39white = true;
    public boolean square40white = true;
    public boolean square41white = true;
    public boolean square42white = true;
    public boolean square43white = true;
    public boolean square44white = true;
    public boolean square45white = true;
    public boolean square46white = true;
    public boolean square47white = true;
    public boolean square48white = true;
    public boolean square49white = true;
    public boolean square50white = true;
    public boolean square51white = true;
    public boolean square52white = true;
    public boolean square53white = true;
    public boolean square54white = true;
    public boolean square55white = true;
    public boolean square56white = true;
    public boolean square57white = true;
    public boolean square58white = true;
    public boolean square59white = true;
    public boolean square60white = true;
    public boolean square61white = true;
    public boolean square62white = true;
    public boolean square63white = true;
    public boolean square64white = true;
    public String notepadText;


    public void whenNotepadPressed(ActionEvent actionEvent) throws Exception
    {
        Stage stage;
        Parent root;
        stage = (Stage) notepadButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file1.fxml"));
        root = loader.load();
        Controller1 notepadController = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void whenTodoPressed(ActionEvent actionEvent) throws Exception
    {
        Stage stage;
        Parent root;
        stage = (Stage) todoButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file3.fxml"));
        root = loader.load();
        Controller3 todoController = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void whenTimerPressed(ActionEvent actionEvent) throws Exception {
        Stage stage;
        Parent root;
        stage = (Stage) timerButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file2.fxml"));
        root = loader.load();
        Controller2 timerController = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void whenSketchPressed(ActionEvent actionEvent) throws Exception
    {
        Stage stage;
        Parent root;
        stage = (Stage) sketchButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/sample/file4.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void whenGridClicked(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == square1)
        {
            if (square1white)
            {
                square1.setStyle("-fx-background-color: black");
                square1white = false;
            }
            else
            {
                square1.setStyle("-fx-background-color: white");
                square1white = true;
            }
        }
        if (actionEvent.getSource() == square2)
        {
            if (square2white)
            {
                square2.setStyle("-fx-background-color: black");
                square2white = false;
            }
            else
            {
                square2.setStyle("-fx-background-color: white");
                square2white = true;
            }
        }
        if (actionEvent.getSource() == square3)
        {
            if (square3white)
            {
                square3.setStyle("-fx-background-color: black");
                square3white = false;
            }
            else
            {
                square3.setStyle("-fx-background-color: white");
                square3white = true;
            }
        }
        if (actionEvent.getSource() == square4)
        {
            if (square4white)
            {
                square4.setStyle("-fx-background-color: black");
                square4white = false;
            }
            else
            {
                square4.setStyle("-fx-background-color: white");
                square4white = true;
            }
        }
        if (actionEvent.getSource() == square5)
        {
            if (square5white)
            {
                square5.setStyle("-fx-background-color: black");
                square5white = false;
            }
            else
            {
                square5.setStyle("-fx-background-color: white");
                square5white = true;
            }
        }
        if (actionEvent.getSource() == square6)
        {
            if (square6white)
            {
                square6.setStyle("-fx-background-color: black");
                square6white = false;
            }
            else
            {
                square6.setStyle("-fx-background-color: white");
                square6white = true;
            }
        }
        if (actionEvent.getSource() == square7)
        {
            if (square7white)
            {
                square7.setStyle("-fx-background-color: black");
                square7white = false;
            }
            else
            {
                square7.setStyle("-fx-background-color: white");
                square7white = true;
            }
        }
        if (actionEvent.getSource() == square8)
        {
            if (square8white)
            {
                square8.setStyle("-fx-background-color: black");
                square8white = false;
            }
            else
            {
                square8.setStyle("-fx-background-color: white");
                square8white = true;
            }
        }
        if (actionEvent.getSource() == square9)
        {
            if (square9white)
            {
                square9.setStyle("-fx-background-color: black");
                square9white = false;
            }
            else
            {
                square9.setStyle("-fx-background-color: white");
                square9white = true;
            }
        }
        if (actionEvent.getSource() == square10)
        {
            if (square10white)
            {
                square10.setStyle("-fx-background-color: black");
                square10white = false;
            }
            else
            {
                square10.setStyle("-fx-background-color: white");
                square10white = true;
            }
        }
        if (actionEvent.getSource() == square11)
        {
            if (square11white)
            {
                square11.setStyle("-fx-background-color: black");
                square11white = false;
            }
            else
            {
                square11.setStyle("-fx-background-color: white");
                square11white = true;
            }
        }
        if (actionEvent.getSource() == square12)
        {
            if (square12white)
            {
                square12.setStyle("-fx-background-color: black");
                square12white = false;
            }
            else
            {
                square12.setStyle("-fx-background-color: white");
                square12white = true;
            }
        }
        if (actionEvent.getSource() == square13)
        {
            if (square13white)
            {
                square13.setStyle("-fx-background-color: black");
                square13white = false;
            }
            else
            {
                square13.setStyle("-fx-background-color: white");
                square13white = true;
            }
        }
        if (actionEvent.getSource() == square14)
        {
            if (square14white)
            {
                square14.setStyle("-fx-background-color: black");
                square14white = false;
            }
            else
            {
                square14.setStyle("-fx-background-color: white");
                square14white = true;
            }
        }
        if (actionEvent.getSource() == square15)
        {
            if (square15white)
            {
                square15.setStyle("-fx-background-color: black");
                square15white = false;
            }
            else
            {
                square15.setStyle("-fx-background-color: white");
                square15white = true;
            }
        }
        if (actionEvent.getSource() == square16)
        {
            if (square16white)
            {
                square16.setStyle("-fx-background-color: black");
                square16white = false;
            }
            else
            {
                square16.setStyle("-fx-background-color: white");
                square16white = true;
            }
        }
        if (actionEvent.getSource() == square17)
        {
            if (square17white)
            {
                square17.setStyle("-fx-background-color: black");
                square17white = false;
            }
            else
            {
                square17.setStyle("-fx-background-color: white");
                square17white = true;
            }
        }
        if (actionEvent.getSource() == square18)
        {
            if (square18white)
            {
                square18.setStyle("-fx-background-color: black");
                square18white = false;
            }
            else
            {
                square18.setStyle("-fx-background-color: white");
                square18white = true;
            }
        }
        if (actionEvent.getSource() == square19)
        {
            if (square19white)
            {
                square19.setStyle("-fx-background-color: black");
                square19white = false;
            }
            else
            {
                square19.setStyle("-fx-background-color: white");
                square19white = true;
            }
        }
        if (actionEvent.getSource() == square20)
        {
            if (square20white)
            {
                square20.setStyle("-fx-background-color: black");
                square20white = false;
            }
            else
            {
                square20.setStyle("-fx-background-color: white");
                square20white = true;
            }
        }
        if (actionEvent.getSource() == square21)
        {
            if (square21white)
            {
                square21.setStyle("-fx-background-color: black");
                square21white = false;
            }
            else
            {
                square21.setStyle("-fx-background-color: white");
                square21white = true;
            }
        }
        if (actionEvent.getSource() == square22)
        {
            if (square22white)
            {
                square22.setStyle("-fx-background-color: black");
                square22white = false;
            }
            else
            {
                square22.setStyle("-fx-background-color: white");
                square22white = true;
            }
        }
        if (actionEvent.getSource() == square23)
        {
            if (square23white)
            {
                square23.setStyle("-fx-background-color: black");
                square23white = false;
            }
            else
            {
                square23.setStyle("-fx-background-color: white");
                square23white = true;
            }
        }
        if (actionEvent.getSource() == square24)
        {
            if (square24white)
            {
                square24.setStyle("-fx-background-color: black");
                square24white = false;
            }
            else
            {
                square24.setStyle("-fx-background-color: white");
                square24white = true;
            }
        }
        if (actionEvent.getSource() == square25)
        {
            if (square25white)
            {
                square25.setStyle("-fx-background-color: black");
                square25white = false;
            }
            else
            {
                square25.setStyle("-fx-background-color: white");
                square25white = true;
            }
        }
        if (actionEvent.getSource() == square26)
        {
            if (square26white)
            {
                square26.setStyle("-fx-background-color: black");
                square26white = false;
            }
            else
            {
                square26.setStyle("-fx-background-color: white");
                square26white = true;
            }
        }
        if (actionEvent.getSource() == square27)
        {
            if (square27white)
            {
                square27.setStyle("-fx-background-color: black");
                square27white = false;
            }
            else
            {
                square27.setStyle("-fx-background-color: white");
                square27white = true;
            }
        }
        if (actionEvent.getSource() == square28)
        {
            if (square28white)
            {
                square28.setStyle("-fx-background-color: black");
                square28white = false;
            }
            else
            {
                square28.setStyle("-fx-background-color: white");
                square28white = true;
            }
        }
        if (actionEvent.getSource() == square29)
        {
            if (square29white)
            {
                square29.setStyle("-fx-background-color: black");
                square29white = false;
            }
            else
            {
                square29.setStyle("-fx-background-color: white");
                square29white = true;
            }
        }
        if (actionEvent.getSource() == square30)
        {
            if (square30white)
            {
                square30.setStyle("-fx-background-color: black");
                square30white = false;
            }
            else
            {
                square30.setStyle("-fx-background-color: white");
                square30white = true;
            }
        }
        if (actionEvent.getSource() == square31)
        {
            if (square31white)
            {
                square31.setStyle("-fx-background-color: black");
                square31white = false;
            }
            else
            {
                square31.setStyle("-fx-background-color: white");
                square31white = true;
            }
        }
        if (actionEvent.getSource() == square32)
        {
            if (square32white)
            {
                square32.setStyle("-fx-background-color: black");
                square32white = false;
            }
            else
            {
                square32.setStyle("-fx-background-color: white");
                square32white = true;
            }
        }
        if (actionEvent.getSource() == square33)
        {
            if (square33white)
            {
                square33.setStyle("-fx-background-color: black");
                square33white = false;
            }
            else
            {
                square33.setStyle("-fx-background-color: white");
                square33white = true;
            }
        }
        if (actionEvent.getSource() == square34)
        {
            if (square34white)
            {
                square34.setStyle("-fx-background-color: black");
                square34white = false;
            }
            else
            {
                square34.setStyle("-fx-background-color: white");
                square34white = true;
            }
        }
        if (actionEvent.getSource() == square35)
        {
            if (square35white)
            {
                square35.setStyle("-fx-background-color: black");
                square35white = false;
            }
            else
            {
                square35.setStyle("-fx-background-color: white");
                square35white = true;
            }
        }
        if (actionEvent.getSource() == square36)
        {
            if (square36white)
            {
                square36.setStyle("-fx-background-color: black");
                square36white = false;
            }
            else
            {
                square36.setStyle("-fx-background-color: white");
                square36white = true;
            }
        }
        if (actionEvent.getSource() == square37)
        {
            if (square37white)
            {
                square37.setStyle("-fx-background-color: black");
                square37white = false;
            }
            else
            {
                square37.setStyle("-fx-background-color: white");
                square37white = true;
            }
        }
        if (actionEvent.getSource() == square38)
        {
            if (square38white)
            {
                square38.setStyle("-fx-background-color: black");
                square38white = false;
            }
            else
            {
                square38.setStyle("-fx-background-color: white");
                square38white = true;
            }
        }
        if (actionEvent.getSource() == square39)
        {
            if (square39white)
            {
                square39.setStyle("-fx-background-color: black");
                square39white = false;
            }
            else
            {
                square39.setStyle("-fx-background-color: white");
                square39white = true;
            }
        }
        if (actionEvent.getSource() == square40)
        {
            if (square40white)
            {
                square40.setStyle("-fx-background-color: black");
                square40white = false;
            }
            else
            {
                square40.setStyle("-fx-background-color: white");
                square40white = true;
            }
        }
        if (actionEvent.getSource() == square41)
        {
            if (square41white)
            {
                square41.setStyle("-fx-background-color: black");
                square41white = false;
            }
            else
            {
                square41.setStyle("-fx-background-color: white");
                square41white = true;
            }
        }
        if (actionEvent.getSource() == square42)
        {
            if (square42white)
            {
                square42.setStyle("-fx-background-color: black");
                square42white = false;
            }
            else
            {
                square42.setStyle("-fx-background-color: white");
                square42white = true;
            }
        }
        if (actionEvent.getSource() == square43)
        {
            if (square43white)
            {
                square43.setStyle("-fx-background-color: black");
                square43white = false;
            }
            else
            {
                square43.setStyle("-fx-background-color: white");
                square43white = true;
            }
        }
        if (actionEvent.getSource() == square44)
        {
            if (square44white)
            {
                square44.setStyle("-fx-background-color: black");
                square44white = false;
            }
            else
            {
                square44.setStyle("-fx-background-color: white");
                square44white = true;
            }
        }
        if (actionEvent.getSource() == square45)
        {
            if (square45white)
            {
                square45.setStyle("-fx-background-color: black");
                square45white = false;
            }
            else
            {
                square45.setStyle("-fx-background-color: white");
                square45white = true;
            }
        }
        if (actionEvent.getSource() == square46)
        {
            if (square46white)
            {
                square46.setStyle("-fx-background-color: black");
                square46white = false;
            }
            else
            {
                square46.setStyle("-fx-background-color: white");
                square46white = true;
            }
        }
        if (actionEvent.getSource() == square47)
        {
            if (square47white)
            {
                square47.setStyle("-fx-background-color: black");
                square47white = false;
            }
            else
            {
                square47.setStyle("-fx-background-color: white");
                square47white = true;
            }
        }
        if (actionEvent.getSource() == square48)
        {
            if (square48white)
            {
                square48.setStyle("-fx-background-color: black");
                square48white = false;
            }
            else
            {
                square48.setStyle("-fx-background-color: white");
                square48white = true;
            }
        }
        if (actionEvent.getSource() == square49)
        {
            if (square49white)
            {
                square49.setStyle("-fx-background-color: black");
                square49white = false;
            }
            else
            {
                square49.setStyle("-fx-background-color: white");
                square49white = true;
            }
        }
        if (actionEvent.getSource() == square50)
        {
            if (square50white)
            {
                square50.setStyle("-fx-background-color: black");
                square50white = false;
            }
            else
            {
                square50.setStyle("-fx-background-color: white");
                square50white = true;
            }
        }
        if (actionEvent.getSource() == square51)
        {
            if (square51white)
            {
                square51.setStyle("-fx-background-color: black");
                square51white = false;
            }
            else
            {
                square51.setStyle("-fx-background-color: white");
                square51white = true;
            }
        }
        if (actionEvent.getSource() == square52)
        {
            if (square52white)
            {
                square52.setStyle("-fx-background-color: black");
                square52white = false;
            }
            else
            {
                square52.setStyle("-fx-background-color: white");
                square52white = true;
            }
        }
        if (actionEvent.getSource() == square53)
        {
            if (square53white)
            {
                square53.setStyle("-fx-background-color: black");
                square53white = false;
            }
            else
            {
                square53.setStyle("-fx-background-color: white");
                square53white = true;
            }
        }
        if (actionEvent.getSource() == square54)
        {
            if (square54white)
            {
                square54.setStyle("-fx-background-color: black");
                square54white = false;
            }
            else
            {
                square54.setStyle("-fx-background-color: white");
                square54white = true;
            }
        }
        if (actionEvent.getSource() == square55)
        {
            if (square55white)
            {
                square55.setStyle("-fx-background-color: black");
                square55white = false;
            }
            else
            {
                square55.setStyle("-fx-background-color: white");
                square55white = true;
            }
        }
        if (actionEvent.getSource() == square56)
        {
            if (square56white)
            {
                square56.setStyle("-fx-background-color: black");
                square56white = false;
            }
            else
            {
                square56.setStyle("-fx-background-color: white");
                square56white = true;
            }
        }
        if (actionEvent.getSource() == square57)
        {
            if (square57white)
            {
                square57.setStyle("-fx-background-color: black");
                square57white = false;
            }
            else
            {
                square57.setStyle("-fx-background-color: white");
                square57white = true;
            }
        }
        if (actionEvent.getSource() == square58)
        {
            if (square58white)
            {
                square58.setStyle("-fx-background-color: black");
                square58white = false;
            }
            else
            {
                square58.setStyle("-fx-background-color: white");
                square58white = true;
            }
        }
        if (actionEvent.getSource() == square59)
        {
            if (square59white)
            {
                square59.setStyle("-fx-background-color: black");
                square59white = false;
            }
            else
            {
                square59.setStyle("-fx-background-color: white");
                square59white = true;
            }
        }
        if (actionEvent.getSource() == square60)
        {
            if (square60white)
            {
                square60.setStyle("-fx-background-color: black");
                square60white = false;
            }
            else
            {
                square60.setStyle("-fx-background-color: white");
                square60white = true;
            }
        }
        if (actionEvent.getSource() == square61)
        {
            if (square61white)
            {
                square61.setStyle("-fx-background-color: black");
                square61white = false;
            }
            else
            {
                square61.setStyle("-fx-background-color: white");
                square61white = true;
            }
        }
        if (actionEvent.getSource() == square62)
        {
            if (square62white)
            {
                square62.setStyle("-fx-background-color: black");
                square62white = false;
            }
            else
            {
                square62.setStyle("-fx-background-color: white");
                square62white = true;
            }
        }
        if (actionEvent.getSource() == square63)
        {
            if (square63white)
            {
                square63.setStyle("-fx-background-color: black");
                square63white = false;
            }
            else
            {
                square63.setStyle("-fx-background-color: white");
                square63white = true;
            }
        }
        if (actionEvent.getSource() == square64)
        {
            if (square64white)
            {
                square64.setStyle("-fx-background-color: black");
                square64white = false;
            }
            else
            {
                square64.setStyle("-fx-background-color: white");
                square64white = true;
            }
        }



    }
}



