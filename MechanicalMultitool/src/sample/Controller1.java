package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.util.prefs.Preferences;

import java.io.*;


public class Controller1
{
    public Button notepadButton;
    public Button todoButton;
    public Button timerButton;
    public Button sketchButton;

    public TextArea notepadContent;

    public String dataLocation;
    public int notepadIndex;

    private Preferences directoryPrefs = Preferences.userRoot().node(this.getClass().getName());
    String pref1 = "Pref1";

    public Timeline saver = new Timeline(new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {
            try {
                dataLocation = directoryPrefs.get(pref1, "directory");
                File[] txtFiles = fileFinder(dataLocation);
                for (int i = 0; i < txtFiles.length; i++) {
                    String search = "a.txt";
                    String sentence = txtFiles[i].toString();
                    if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
                        notepadIndex = i;
                    }
                }
                try {
                    File notepadFile = txtFiles[notepadIndex];
                    String content = notepadContent.getText();
                    File textFile = notepadFile;
                    FileWriter fw = new FileWriter(textFile.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    // Write in file
                    bw.write(content);
                    // Close connection
                    bw.close();
                } catch (Exception e)
                {
                    final File parentDir = new File(dataLocation);
                    parentDir.mkdir();
                    final String hash = "a";
                    final String fileName = hash + ".txt";
                    final File file = new File(parentDir, fileName);
                    file.createNewFile();
                    String content = notepadContent.getText();
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    // Write in file
                    bw.write(content);
                    // Close connection
                    bw.close();
                }

            }
            catch (Exception e)
            {

            }
        }
    }));



    public void initialize() throws IOException
    {
        try
        {
            saver.setCycleCount(Animation.INDEFINITE);
            saver.play();

            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            File[] txtFiles = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles.length; i++) {
                String search = "a.txt";
                String sentence = txtFiles[i].toString();
                if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
                    notepadIndex = i;
                }
                System.out.println(txtFiles[i]);
            }
            try {
                File notepadFile = txtFiles[notepadIndex];
                BufferedReader reader = new BufferedReader(new FileReader(notepadFile));

                StringBuilder savedData = new StringBuilder();

                int i;
                while ((i = reader.read()) != -1) {
                    savedData.append((char) i);
                }

                String converted = savedData.toString();

                notepadContent.setText(converted);
            }
            catch(Exception e)
            {
                final File parentDir = new File(dataLocation);
                parentDir.mkdir();
                final String hash = "a";
                final String fileName = hash + ".txt";
                final File file = new File(parentDir, fileName);
                file.createNewFile();
            }
        }
        catch (Exception e)
        {

        }


    }


    public void whenNotepadPressed(ActionEvent actionEvent) throws Exception
    {
        Stage stage;
        Parent root;
        stage = (Stage) notepadButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("/sample/file1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



    public void whenTodoPressed(ActionEvent actionEvent) throws Exception
    {
        try {
            dataLocation = directoryPrefs.get(pref1, "directory");
            File[] txtFiles = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles.length; i++) {
                String search = "a.txt";
                String sentence = txtFiles[i].toString();
                if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
                    notepadIndex = i;
                }
                System.out.println(txtFiles[i]);
            }
            try {
                File notepadFile = txtFiles[notepadIndex];
                String content = notepadContent.getText();
                File textFile = notepadFile;
                FileWriter fw = new FileWriter(textFile.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                bw.write(content);
                // Close connection
                bw.close();
            } catch (Exception e)
            {
                final File parentDir = new File(dataLocation);
                parentDir.mkdir();
                final String hash = "a";
                final String fileName = hash + ".txt";
                final File file = new File(parentDir, fileName);
                file.createNewFile();
                String content = notepadContent.getText();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                bw.write(content);
                // Close connection
                bw.close();
            }

        }
        catch (Exception e)
        {

        }

        saver.stop();


        Stage stage;
        Parent root;
        stage = (Stage) timerButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file3.fxml"));
        Controller3 todoController = loader.getController();
        root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }

    public void whenTimerPressed(ActionEvent actionEvent) throws Exception
    {
        try {
            dataLocation = directoryPrefs.get(pref1, "directory");
            File[] txtFiles = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles.length; i++) {
                String search = "a.txt";
                String sentence = txtFiles[i].toString();
                if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
                    notepadIndex = i;
                }
                System.out.println(txtFiles[i]);
            }
            try {
                File notepadFile = txtFiles[notepadIndex];
                String content = notepadContent.getText();
                File textFile = notepadFile;
                FileWriter fw = new FileWriter(textFile.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                bw.write(content);
                // Close connection
                bw.close();
            } catch (Exception e)
            {
                final File parentDir = new File(dataLocation);
                parentDir.mkdir();
                final String hash = "a";
                final String fileName = hash + ".txt";
                final File file = new File(parentDir, fileName);
                file.createNewFile();
                String content = notepadContent.getText();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                bw.write(content);
                // Close connection
                bw.close();
            }
        }
        catch (Exception e)
        {

        }
        saver.stop();

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
        try {
            dataLocation = directoryPrefs.get(pref1, "directory");
            File[] txtFiles = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles.length; i++) {
                String search = "a.txt";
                String sentence = txtFiles[i].toString();
                if (sentence.toLowerCase().indexOf(search.toLowerCase()) != -1) {
                    notepadIndex = i;
                }
                System.out.println(txtFiles[i]);
            }
            try {
                File notepadFile = txtFiles[notepadIndex];
                String content = notepadContent.getText();
                File textFile = notepadFile;
                FileWriter fw = new FileWriter(textFile.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                bw.write(content);
                // Close connection
                bw.close();
            } catch (Exception e)
            {
                final File parentDir = new File(dataLocation);
                parentDir.mkdir();
                final String hash = "a";
                final String fileName = hash + ".txt";
                final File file = new File(parentDir, fileName);
                file.createNewFile();
                String content = notepadContent.getText();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                bw.write(content);
                // Close connection
                bw.close();
            }
        }
        catch (Exception e)
        {

        }
        saver.stop();

        Stage stage;
        Parent root;
        stage = (Stage) timerButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/file4.fxml"));
        root = loader.load();
        Controller4 sketchController = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }


    public void whenSavedDataButtonPressed(ActionEvent actionEvent)
    {
        Controller1 test1 = new Controller1();

        Stage stage = (Stage) timerButton.getScene().getWindow();
        final DirectoryChooser directoryChooser =
                new DirectoryChooser();
        final File selectedDirectory =
                directoryChooser.showDialog(stage);
        if (selectedDirectory != null) {
            dataLocation = selectedDirectory.getAbsolutePath();
            System.out.println(dataLocation);
        }
        test1.directoryPreference(dataLocation);



    }

    public File[] fileFinder( String dirName)
    {
        File dir = new File(dirName);

        return dir.listFiles(new FilenameFilter()
        {
            public boolean accept(File dir, String filename)
            {
                return filename.endsWith(".txt");
            }
        } );

    }

    public void directoryPreference(String path)
    {
        System.out.println(directoryPrefs.get(pref1, "directory"));
        directoryPrefs.put(pref1, path);
    }



}



