package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.*;
import javafx.event.*;

import java.awt.*;
import java.io.*;
import java.util.prefs.Preferences;

import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.util.Duration;



public class Controller3
{
    public Button notepadButton;
    public Button todoButton;
    public Button timerButton;
    public Button sketchButton;
    public CheckBox item1;
    public CheckBox item2;
    public CheckBox item3;
    public CheckBox item4;
    public CheckBox item5;
    public CheckBox item6;
    public CheckBox item7;
    public CheckBox item8;
    public CheckBox item9;
    public CheckBox item10;
    public TextField item1text;
    public TextField item2text;
    public TextField item3text;
    public TextField item4text;
    public TextField item5text;
    public TextField item6text;
    public TextField item7text;
    public TextField item8text;
    public TextField item9text;
    public TextField item10text;

    public Button savedDataButton;

    private Desktop desktop = Desktop.getDesktop();
    public String dataLocation;
    public int todoIndex1;
    public int todoIndex2;
    public int todoIndex3;
    public int todoIndex4;
    public int todoIndex5;
    public int todoIndex6;
    public int todoIndex7;
    public int todoIndex8;
    public int todoIndex9;
    public int todoIndex10;

    private Preferences directoryPrefs = Preferences.userRoot().node(this.getClass().getName());
    String pref1 = "Pref1";

    public Timeline saver = new Timeline(new KeyFrame(Duration.seconds(0.1), new EventHandler<ActionEvent>()
    {
        @Override
        public void handle(ActionEvent event)
        {

                try
                {
                    System.out.println(directoryPrefs.get(pref1, "directory"));
                    dataLocation = directoryPrefs.get(pref1, "directory");
                    System.out.println(dataLocation);

                    File [] txtFiles1 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles1.length; i++)
                    {
                        System.out.println(txtFiles1[i]);
                        String search1 = "todo1.txt";
                        String sentence1 = txtFiles1[i].toString();
                        if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                        {
                            todoIndex1 = i;
                        }
                        System.out.println(txtFiles1[i]);
                    }
                    try
                    {
                        File todo1File = txtFiles1[todoIndex1];
                        String content = item1text.getText();
                        FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                        BufferedWriter bw1 = new BufferedWriter(fw1);
                        // Write in file
                        bw1.write(content);
                        // Close connection
                        bw1.close();
                    }
                    catch (Exception e)
                    {

                    }

                    File [] txtFiles2 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles2.length; i++)
                    {
                        String search2 = "todo2.txt";
                        String sentence2 = txtFiles2[i].toString();
                        if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                        {
                            todoIndex2 = i;
                        }
                        System.out.println(txtFiles2[i]);
                    }
                    try {
                        File todo2File = txtFiles2[todoIndex2];
                        String content = item2text.getText();
                        FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                        BufferedWriter bw2 = new BufferedWriter(fw2);
                        // Write in file
                        bw2.write(content);
                        // Close connection
                        bw2.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles3 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles3.length; i++)
                    {
                        String search3 = "todo3.txt";
                        String sentence3 = txtFiles3[i].toString();
                        if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                        {
                            todoIndex3 = i;
                        }
                        System.out.println(txtFiles3[i]);
                    }
                    try {
                        File todo3File = txtFiles3[todoIndex3];
                        String content = item3text.getText();
                        FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                        BufferedWriter bw3 = new BufferedWriter(fw3);
                        // Write in file
                        bw3.write(content);
                        // Close connection
                        bw3.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles4 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles4.length; i++)
                    {
                        String search4 = "todo4.txt";
                        String sentence4 = txtFiles4[i].toString();
                        if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                        {
                            todoIndex4 = i;
                        }
                        System.out.println(txtFiles4[i]);
                    }
                    try {
                        File todo4File = txtFiles4[todoIndex4];
                        String content = item4text.getText();
                        FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                        BufferedWriter bw4 = new BufferedWriter(fw4);
                        // Write in file
                        bw4.write(content);
                        // Close connection
                        bw4.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles5 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles5.length; i++)
                    {
                        String search5 = "todo5.txt";
                        String sentence5 = txtFiles5[i].toString();
                        if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                        {
                            todoIndex5 = i;
                        }
                        System.out.println(txtFiles5[i]);
                    }
                    try {
                        File todo5File = txtFiles5[todoIndex5];
                        String content = item5text.getText();
                        FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                        BufferedWriter bw5 = new BufferedWriter(fw5);
                        // Write in file
                        bw5.write(content);
                        // Close connection
                        bw5.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles6 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles6.length; i++)
                    {
                        String search6 = "todo6.txt";
                        String sentence6 = txtFiles6[i].toString();
                        if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                        {
                            todoIndex6 = i;

                        }
                        System.out.println(txtFiles6[i]);
                    }
                    try {
                        File todo6File = txtFiles6[todoIndex6];
                        String content = item6text.getText();
                        FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                        BufferedWriter bw6 = new BufferedWriter(fw6);
                        // Write in file
                        bw6.write(content);
                        // Close connection
                        bw6.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles7 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles7.length; i++)
                    {
                        String search7 = "todo7.txt";
                        String sentence7 = txtFiles7[i].toString();
                        if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                        {
                            todoIndex7 = i;

                        }
                        System.out.println(txtFiles7[i]);
                    }
                    try {
                        File todo7File = txtFiles7[todoIndex7];
                        String content = item7text.getText();
                        FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                        BufferedWriter bw7 = new BufferedWriter(fw7);
                        // Write in file
                        bw7.write(content);
                        // Close connection
                        bw7.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles8 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles8.length; i++)
                    {
                        String search8 = "todo8.txt";
                        String sentence8 = txtFiles8[i].toString();
                        if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                        {
                            todoIndex8 = i;

                        }
                        System.out.println(txtFiles8[i]);
                    }
                    try {
                        File todo8File = txtFiles8[todoIndex8];
                        String content = item8text.getText();
                        FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                        BufferedWriter bw8 = new BufferedWriter(fw8);
                        // Write in file
                        bw8.write(content);
                        // Close connection
                        bw8.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles9 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles9.length; i++)
                    {
                        String search9 = "todo9.txt";
                        String sentence9 = txtFiles9[i].toString();
                        if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                        {
                            todoIndex9 = i;

                        }
                        System.out.println(txtFiles9[i]);
                    }
                    try {
                        File todo9File = txtFiles9[todoIndex9];
                        String content = item9text.getText();
                        FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                        BufferedWriter bw9 = new BufferedWriter(fw9);
                        // Write in file
                        bw9.write(content);
                        // Close connection
                        bw9.close();
                    }
                    catch(Exception e)
                    {

                    }

                    File [] txtFiles10 = fileFinder(dataLocation);
                    for (int i = 0; i < txtFiles10.length; i++)
                    {
                        String search10 = "todo10.txt";
                        String sentence10 = txtFiles10[i].toString();
                        if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                        {
                            todoIndex10 = i;

                        }
                        System.out.println(txtFiles10[i]);
                    }
                    try {
                        File todo10File = txtFiles10[todoIndex10];
                        String content = item10text.getText();
                        FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                        BufferedWriter bw10 = new BufferedWriter(fw10);
                        // Write in file
                        bw10.write(content);
                        // Close connection
                        bw10.close();
                    }
                    catch(Exception e)
                    {

                    }

                }
                catch(Exception e)
                {

                }
        }
    }));




    public void initialize() throws Exception
    {
        saver.setCycleCount(Animation.INDEFINITE);
        saver.play();

        System.out.println(directoryPrefs.get(pref1, "directory"));
        dataLocation = directoryPrefs.get(pref1, "directory");
        System.out.println(dataLocation);
        System.out.println("yo");
        File [] txtFiles1 = fileFinder(dataLocation);
        boolean found1 = false;
        for (int i = 0; i < txtFiles1.length; i++)
        {
            System.out.println(txtFiles1[i]);
            String search1 = "todo1.txt";
            String sentence1 = txtFiles1[i].toString();
            if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
            {
                todoIndex1 = i;
                found1 = true;
                System.out.println("found!");
            }
            System.out.println(txtFiles1[i]);
        }
        if (found1 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo1";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile1 = txtFiles1[todoIndex1];
            BufferedReader reader1 = new BufferedReader(new FileReader(todoFile1));

            StringBuilder savedData1 = new StringBuilder();

            int i;
            while ((i = reader1.read()) != -1) {
                savedData1.append((char) i);
            }

            String converted1 = savedData1.toString();

            item1text.setText(converted1);
        }
        catch(Exception e)
        {

        }

        boolean found2 = false;
        File [] txtFiles2 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles2.length; i++)
        {
            String search2 = "todo2.txt";
            String sentence2 = txtFiles2[i].toString();
            if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
            {
                todoIndex2 = i;
                found2 = true;
                System.out.println("found2!");
            }
            System.out.println(txtFiles2[i]);
        }
        if (found2 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo2";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile2 = txtFiles2[todoIndex2];
            BufferedReader reader2 = new BufferedReader(new FileReader(todoFile2));

            StringBuilder savedData2 = new StringBuilder();

            int i;
            while ((i = reader2.read()) != -1) {
                savedData2.append((char) i);
            }

            String converted2 = savedData2.toString();

            item2text.setText(converted2);
        }
        catch(Exception e)
        {

        }

        boolean found3 = false;
        File [] txtFiles3 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles3.length; i++)
        {
            String search3 = "todo3.txt";
            String sentence3 = txtFiles3[i].toString();
            if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
            {
                todoIndex3 = i;
                found3 = true;
                System.out.println("found3!");
            }
            System.out.println(txtFiles3[i]);
        }
        if (found3 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo3";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile3 = txtFiles3[todoIndex3];
            BufferedReader reader3 = new BufferedReader(new FileReader(todoFile3));

            StringBuilder savedData3 = new StringBuilder();

            int i;
            while ((i = reader3.read()) != -1) {
                savedData3.append((char) i);
            }

            String converted3 = savedData3.toString();

            item3text.setText(converted3);
        }
        catch(Exception e)
        {

        }

        boolean found4 = false;
        File [] txtFiles4 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles4.length; i++)
        {
            String search4 = "todo4.txt";
            String sentence4 = txtFiles4[i].toString();
            if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
            {
                todoIndex4 = i;
                found4 = true;
                System.out.println("found4!");
            }
            System.out.println(txtFiles4[i]);
        }
        if (found4 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo4";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile4 = txtFiles4[todoIndex4];
            BufferedReader reader4 = new BufferedReader(new FileReader(todoFile4));

            StringBuilder savedData4 = new StringBuilder();

            int i;
            while ((i = reader4.read()) != -1) {
                savedData4.append((char) i);
            }

            String converted4 = savedData4.toString();

            item4text.setText(converted4);
        }
        catch(Exception e)
        {

        }

        boolean found5 = false;
        File [] txtFiles5 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles5.length; i++)
        {
            String search5 = "todo5.txt";
            String sentence5 = txtFiles5[i].toString();
            if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
            {
                todoIndex5 = i;
                found5 = true;
                System.out.println("found5!");
            }
            System.out.println(txtFiles5[i]);
        }
        if (found5 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo5";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile5 = txtFiles5[todoIndex5];
            BufferedReader reader5 = new BufferedReader(new FileReader(todoFile5));

            StringBuilder savedData5 = new StringBuilder();

            int i;
            while ((i = reader5.read()) != -1) {
                savedData5.append((char) i);
            }

            String converted5 = savedData5.toString();

            item5text.setText(converted5);
        }
        catch(Exception e)
        {

        }

        boolean found6 = false;
        File [] txtFiles6 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles6.length; i++)
        {
            String search6 = "todo6.txt";
            String sentence6 = txtFiles6[i].toString();
            if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
            {
                todoIndex6 = i;
                found6 = true;
                System.out.println("found6!");
            }
            System.out.println(txtFiles6[i]);
        }
        if (found6 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo6";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile6 = txtFiles6[todoIndex6];
            BufferedReader reader6 = new BufferedReader(new FileReader(todoFile6));

            StringBuilder savedData6 = new StringBuilder();

            int i;
            while ((i = reader6.read()) != -1) {
                savedData6.append((char) i);
            }

            String converted6 = savedData6.toString();

            item6text.setText(converted6);
        }
        catch(Exception e)
        {

        }

        boolean found7 = false;
        File [] txtFiles7 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles7.length; i++)
        {
            String search7 = "todo7.txt";
            String sentence7 = txtFiles7[i].toString();
            if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
            {
                todoIndex7 = i;
                found7 = true;
            }
            System.out.println(txtFiles7[i]);
        }
        if (found7 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo7";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile7 = txtFiles7[todoIndex7];
            BufferedReader reader7 = new BufferedReader(new FileReader(todoFile7));

            StringBuilder savedData7 = new StringBuilder();

            int i;
            while ((i = reader7.read()) != -1) {
                savedData7.append((char) i);
            }

            String converted7 = savedData7.toString();

            item7text.setText(converted7);
        }
        catch(Exception e)
        {

        }

        boolean found8 = false;
        File [] txtFiles8 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles8.length; i++)
        {
            String search8 = "todo8.txt";
            String sentence8 = txtFiles8[i].toString();
            if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
            {
                todoIndex8 = i;
                found8 = true;
            }
            System.out.println(txtFiles8[i]);
        }
        if (found8 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo8";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile8 = txtFiles8[todoIndex8];
            BufferedReader reader8 = new BufferedReader(new FileReader(todoFile8));

            StringBuilder savedData8 = new StringBuilder();

            int i;
            while ((i = reader8.read()) != -1) {
                savedData8.append((char) i);
            }

            String converted8 = savedData8.toString();

            item8text.setText(converted8);
        }
        catch(Exception e)
        {

        }

        boolean found9 = false;
        File [] txtFiles9 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles9.length; i++)
        {
            String search9 = "todo9.txt";
            String sentence9 = txtFiles9[i].toString();
            if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
            {
                todoIndex9 = i;
                found9 = true;
            }
            System.out.println(txtFiles9[i]);
        }
        if (found9 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo9";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile9 = txtFiles9[todoIndex9];
            BufferedReader reader9 = new BufferedReader(new FileReader(todoFile9));

            StringBuilder savedData9 = new StringBuilder();

            int i;
            while ((i = reader9.read()) != -1) {
                savedData9.append((char) i);
            }

            String converted9 = savedData9.toString();

            item9text.setText(converted9);
        }
        catch(Exception e)
        {

        }

        boolean found10 = false;
        File [] txtFiles10 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles10.length; i++)
        {
            String search10 = "todo10.txt";
            String sentence10 = txtFiles10[i].toString();
            if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
            {
                todoIndex10 = i;
                found10 = true;
            }
            System.out.println(txtFiles10[i]);
        }
        if (found10 == false)
        {
            final File parentDir = new File(dataLocation);
            parentDir.mkdir();
            final String hash = "todo10";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile10 = txtFiles10[todoIndex10];
            BufferedReader reader10 = new BufferedReader(new FileReader(todoFile10));

            StringBuilder savedData10 = new StringBuilder();

            int i;
            while ((i = reader10.read()) != -1) {
                savedData10.append((char) i);
            }

            String converted10 = savedData10.toString();

            item10text.setText(converted10);
        }
        catch(Exception e)
        {

        }

    }

    public void loadData() throws Exception
    {
        System.out.println(directoryPrefs.get(pref1, "directory"));
        dataLocation = directoryPrefs.get(pref1, "directory");
        System.out.println(dataLocation);
        System.out.println("yo");
        File [] txtFiles1 = fileFinder(dataLocation);
        boolean found1 = false;
        for (int i = 0; i < txtFiles1.length; i++)
        {
            System.out.println(txtFiles1[i]);
            String search1 = "todo1.txt";
            String sentence1 = txtFiles1[i].toString();
            if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
            {
                todoIndex1 = i;
                found1 = true;
                System.out.println("found!");
            }
            System.out.println(txtFiles1[i]);
        }
        if (found1 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo1";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile1 = txtFiles1[todoIndex1];
            BufferedReader reader1 = new BufferedReader(new FileReader(todoFile1));

            StringBuilder savedData1 = new StringBuilder();

            int i;
            while ((i = reader1.read()) != -1) {
                savedData1.append((char) i);
            }

            String converted1 = savedData1.toString();

            item1text.setText(converted1);
        }
        catch(Exception e)
        {

        }

        boolean found2 = false;
        File [] txtFiles2 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles2.length; i++)
        {
            String search2 = "todo2.txt";
            String sentence2 = txtFiles2[i].toString();
            if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
            {
                todoIndex2 = i;
                found2 = true;
                System.out.println("found2!");
            }
            System.out.println(txtFiles2[i]);
        }
        if (found2 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo2";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile2 = txtFiles2[todoIndex2];
            BufferedReader reader2 = new BufferedReader(new FileReader(todoFile2));

            StringBuilder savedData2 = new StringBuilder();

            int i;
            while ((i = reader2.read()) != -1) {
                savedData2.append((char) i);
            }

            String converted2 = savedData2.toString();

            item2text.setText(converted2);
        }
        catch(Exception e)
        {

        }

        boolean found3 = false;
        File [] txtFiles3 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles3.length; i++)
        {
            String search3 = "todo3.txt";
            String sentence3 = txtFiles3[i].toString();
            if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
            {
                todoIndex3 = i;
                found3 = true;
                System.out.println("found3!");
            }
            System.out.println(txtFiles3[i]);
        }
        if (found3 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo3";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile3 = txtFiles3[todoIndex3];
            BufferedReader reader3 = new BufferedReader(new FileReader(todoFile3));

            StringBuilder savedData3 = new StringBuilder();

            int i;
            while ((i = reader3.read()) != -1) {
                savedData3.append((char) i);
            }

            String converted3 = savedData3.toString();

            item3text.setText(converted3);
        }
        catch(Exception e)
        {

        }

        boolean found4 = false;
        File [] txtFiles4 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles4.length; i++)
        {
            String search4 = "todo4.txt";
            String sentence4 = txtFiles4[i].toString();
            if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
            {
                todoIndex4 = i;
                found4 = true;
                System.out.println("found4!");
            }
            System.out.println(txtFiles4[i]);
        }
        if (found4 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo4";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile4 = txtFiles4[todoIndex4];
            BufferedReader reader4 = new BufferedReader(new FileReader(todoFile4));

            StringBuilder savedData4 = new StringBuilder();

            int i;
            while ((i = reader4.read()) != -1) {
                savedData4.append((char) i);
            }

            String converted4 = savedData4.toString();

            item4text.setText(converted4);
        }
        catch(Exception e)
        {

        }

        boolean found5 = false;
        File [] txtFiles5 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles5.length; i++)
        {
            String search5 = "todo5.txt";
            String sentence5 = txtFiles5[i].toString();
            if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
            {
                todoIndex5 = i;
                found5 = true;
                System.out.println("found5!");
            }
            System.out.println(txtFiles5[i]);
        }
        if (found5 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo5";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile5 = txtFiles5[todoIndex5];
            BufferedReader reader5 = new BufferedReader(new FileReader(todoFile5));

            StringBuilder savedData5 = new StringBuilder();

            int i;
            while ((i = reader5.read()) != -1) {
                savedData5.append((char) i);
            }

            String converted5 = savedData5.toString();

            item5text.setText(converted5);
        }
        catch(Exception e)
        {

        }

        boolean found6 = false;
        File [] txtFiles6 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles6.length; i++)
        {
            String search6 = "todo6.txt";
            String sentence6 = txtFiles6[i].toString();
            if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
            {
                todoIndex6 = i;
                found6 = true;
                System.out.println("found6!");
            }
            System.out.println(txtFiles6[i]);
        }
        if (found6 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo6";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile6 = txtFiles6[todoIndex6];
            BufferedReader reader6 = new BufferedReader(new FileReader(todoFile6));

            StringBuilder savedData6 = new StringBuilder();

            int i;
            while ((i = reader6.read()) != -1) {
                savedData6.append((char) i);
            }

            String converted6 = savedData6.toString();

            item6text.setText(converted6);
        }
        catch(Exception e)
        {

        }

        boolean found7 = false;
        File [] txtFiles7 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles7.length; i++)
        {
            String search7 = "todo7.txt";
            String sentence7 = txtFiles7[i].toString();
            if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
            {
                todoIndex7 = i;
                found7 = true;
            }
            System.out.println(txtFiles7[i]);
        }
        if (found7 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo7";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile7 = txtFiles7[todoIndex7];
            BufferedReader reader7 = new BufferedReader(new FileReader(todoFile7));

            StringBuilder savedData7 = new StringBuilder();

            int i;
            while ((i = reader7.read()) != -1) {
                savedData7.append((char) i);
            }

            String converted7 = savedData7.toString();

            item7text.setText(converted7);
        }
        catch(Exception e)
        {

        }

        boolean found8 = false;
        File [] txtFiles8 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles8.length; i++)
        {
            String search8 = "todo8.txt";
            String sentence8 = txtFiles8[i].toString();
            if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
            {
                todoIndex8 = i;
                found8 = true;
            }
            System.out.println(txtFiles8[i]);
        }
        if (found8 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo8";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile8 = txtFiles8[todoIndex8];
            BufferedReader reader8 = new BufferedReader(new FileReader(todoFile8));

            StringBuilder savedData8 = new StringBuilder();

            int i;
            while ((i = reader8.read()) != -1) {
                savedData8.append((char) i);
            }

            String converted8 = savedData8.toString();

            item8text.setText(converted8);
        }
        catch(Exception e)
        {

        }

        boolean found9 = false;
        File [] txtFiles9 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles9.length; i++)
        {
            String search9 = "todo9.txt";
            String sentence9 = txtFiles9[i].toString();
            if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
            {
                todoIndex9 = i;
                found9 = true;
            }
            System.out.println(txtFiles9[i]);
        }
        if (found9 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo9";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile9 = txtFiles9[todoIndex9];
            BufferedReader reader9 = new BufferedReader(new FileReader(todoFile9));

            StringBuilder savedData9 = new StringBuilder();

            int i;
            while ((i = reader9.read()) != -1) {
                savedData9.append((char) i);
            }

            String converted9 = savedData9.toString();

            item9text.setText(converted9);
        }
        catch(Exception e)
        {

        }

        boolean found10 = false;
        File [] txtFiles10 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles10.length; i++)
        {
            String search10 = "todo10.txt";
            String sentence10 = txtFiles10[i].toString();
            if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
            {
                todoIndex10 = i;
                found10 = true;
            }
            System.out.println(txtFiles10[i]);
        }
        if (found10 == false)
        {
            final File parentDir = new File(dataLocation); //doesn't work, as the reader gets all the txt files
            parentDir.mkdir();
            final String hash = "todo10";
            final String fileName = hash + ".txt";
            final File file = new File(parentDir, fileName);
            file.createNewFile();
        }
        try {
            File todoFile10 = txtFiles10[todoIndex10];
            BufferedReader reader10 = new BufferedReader(new FileReader(todoFile10));

            StringBuilder savedData10 = new StringBuilder();

            int i;
            while ((i = reader10.read()) != -1) {
                savedData10.append((char) i);
            }

            String converted10 = savedData10.toString();

            item10text.setText(converted10);
        }
        catch(Exception e)
        {

        }



    }

    public void whenNotepadPressed(ActionEvent actionEvent) throws Exception
    {
        System.out.println(directoryPrefs.get(pref1, "directory"));
        dataLocation = directoryPrefs.get(pref1, "directory");
        System.out.println(dataLocation);

        File [] txtFiles1 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles1.length; i++)
        {
            System.out.println(txtFiles1[i]);
            String search1 = "todo1.txt";
            String sentence1 = txtFiles1[i].toString();
            if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
            {
                todoIndex1 = i;
            }
            System.out.println(txtFiles1[i]);
        }
        try
        {
            File todo1File = txtFiles1[todoIndex1];
            String content = item1text.getText();
            FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
            BufferedWriter bw1 = new BufferedWriter(fw1);
            // Write in file
            bw1.write(content);
            // Close connection
            bw1.close();
        }
        catch (Exception e)
        {

        }

        File [] txtFiles2 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles2.length; i++)
        {
            String search2 = "todo2.txt";
            String sentence2 = txtFiles2[i].toString();
            if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
            {
                todoIndex2 = i;
            }
            System.out.println(txtFiles2[i]);
        }
        try {
            File todo2File = txtFiles2[todoIndex2];
            String content = item2text.getText();
            FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
            BufferedWriter bw2 = new BufferedWriter(fw2);
            // Write in file
            bw2.write(content);
            // Close connection
            bw2.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles3 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles3.length; i++)
        {
            String search3 = "todo3.txt";
            String sentence3 = txtFiles3[i].toString();
            if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
            {
                todoIndex3 = i;
            }
            System.out.println(txtFiles3[i]);
        }
        try {
            File todo3File = txtFiles3[todoIndex3];
            String content = item3text.getText();
            FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
            BufferedWriter bw3 = new BufferedWriter(fw3);
            // Write in file
            bw3.write(content);
            // Close connection
            bw3.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles4 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles4.length; i++)
        {
            String search4 = "todo4.txt";
            String sentence4 = txtFiles4[i].toString();
            if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
            {
                todoIndex4 = i;
            }
            System.out.println(txtFiles4[i]);
        }
        try {
            File todo4File = txtFiles4[todoIndex4];
            String content = item4text.getText();
            FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
            BufferedWriter bw4 = new BufferedWriter(fw4);
            // Write in file
            bw4.write(content);
            // Close connection
            bw4.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles5 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles5.length; i++)
        {
            String search5 = "todo5.txt";
            String sentence5 = txtFiles5[i].toString();
            if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
            {
                todoIndex5 = i;
            }
            System.out.println(txtFiles5[i]);
        }
        try {
            File todo5File = txtFiles5[todoIndex5];
            String content = item5text.getText();
            FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
            BufferedWriter bw5 = new BufferedWriter(fw5);
            // Write in file
            bw5.write(content);
            // Close connection
            bw5.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles6 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles6.length; i++)
        {
            String search6 = "todo6.txt";
            String sentence6 = txtFiles6[i].toString();
            if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
            {
                todoIndex6 = i;

            }
            System.out.println(txtFiles6[i]);
        }
        try {
            File todo6File = txtFiles6[todoIndex6];
            String content = item6text.getText();
            FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
            BufferedWriter bw6 = new BufferedWriter(fw6);
            // Write in file
            bw6.write(content);
            // Close connection
            bw6.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles7 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles7.length; i++)
        {
            String search7 = "todo7.txt";
            String sentence7 = txtFiles7[i].toString();
            if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
            {
                todoIndex7 = i;

            }
            System.out.println(txtFiles7[i]);
        }
        try {
            File todo7File = txtFiles7[todoIndex7];
            String content = item7text.getText();
            FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
            BufferedWriter bw7 = new BufferedWriter(fw7);
            // Write in file
            bw7.write(content);
            // Close connection
            bw7.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles8 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles8.length; i++)
        {
            String search8 = "todo8.txt";
            String sentence8 = txtFiles8[i].toString();
            if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
            {
                todoIndex8 = i;

            }
            System.out.println(txtFiles8[i]);
        }
        try {
            File todo8File = txtFiles8[todoIndex8];
            String content = item8text.getText();
            FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
            BufferedWriter bw8 = new BufferedWriter(fw8);
            // Write in file
            bw8.write(content);
            // Close connection
            bw8.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles9 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles9.length; i++)
        {
            String search9 = "todo9.txt";
            String sentence9 = txtFiles9[i].toString();
            if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
            {
                todoIndex9 = i;

            }
            System.out.println(txtFiles9[i]);
        }
        try {
            File todo9File = txtFiles9[todoIndex9];
            String content = item9text.getText();
            FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
            BufferedWriter bw9 = new BufferedWriter(fw9);
            // Write in file
            bw9.write(content);
            // Close connection
            bw9.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles10 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles10.length; i++)
        {
            String search10 = "todo10.txt";
            String sentence10 = txtFiles10[i].toString();
            if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
            {
                todoIndex10 = i;

            }
            System.out.println(txtFiles10[i]);
        }
        try {
            File todo10File = txtFiles10[todoIndex10];
            String content = item10text.getText();
            FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
            BufferedWriter bw10 = new BufferedWriter(fw10);
            // Write in file
            bw10.write(content);
            // Close connection
            bw10.close();
        }
        catch(Exception e)
        {

        }


        saver.stop();

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
        root = FXMLLoader.load(getClass().getResource("/sample/file3.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void whenTimerPressed(ActionEvent actionEvent) throws Exception
    {
        saver.stop();
        System.out.println(directoryPrefs.get(pref1, "directory"));
        dataLocation = directoryPrefs.get(pref1, "directory");
        System.out.println(dataLocation);

        File [] txtFiles1 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles1.length; i++)
        {
            System.out.println(txtFiles1[i]);
            String search1 = "todo1.txt";
            String sentence1 = txtFiles1[i].toString();
            if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
            {
                todoIndex1 = i;
            }
            System.out.println(txtFiles1[i]);
        }
        try
        {
            File todo1File = txtFiles1[todoIndex1];
            String content = item1text.getText();
            FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
            BufferedWriter bw1 = new BufferedWriter(fw1);
            // Write in file
            bw1.write(content);
            // Close connection
            bw1.close();
        }
        catch (Exception e)
        {

        }

        File [] txtFiles2 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles2.length; i++)
        {
            String search2 = "todo2.txt";
            String sentence2 = txtFiles2[i].toString();
            if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
            {
                todoIndex2 = i;
            }
            System.out.println(txtFiles2[i]);
        }
        try {
            File todo2File = txtFiles2[todoIndex2];
            String content = item2text.getText();
            FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
            BufferedWriter bw2 = new BufferedWriter(fw2);
            // Write in file
            bw2.write(content);
            // Close connection
            bw2.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles3 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles3.length; i++)
        {
            String search3 = "todo3.txt";
            String sentence3 = txtFiles3[i].toString();
            if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
            {
                todoIndex3 = i;
            }
            System.out.println(txtFiles3[i]);
        }
        try {
            File todo3File = txtFiles3[todoIndex3];
            String content = item3text.getText();
            FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
            BufferedWriter bw3 = new BufferedWriter(fw3);
            // Write in file
            bw3.write(content);
            // Close connection
            bw3.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles4 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles4.length; i++)
        {
            String search4 = "todo4.txt";
            String sentence4 = txtFiles4[i].toString();
            if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
            {
                todoIndex4 = i;
            }
            System.out.println(txtFiles4[i]);
        }
        try {
            File todo4File = txtFiles4[todoIndex4];
            String content = item4text.getText();
            FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
            BufferedWriter bw4 = new BufferedWriter(fw4);
            // Write in file
            bw4.write(content);
            // Close connection
            bw4.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles5 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles5.length; i++)
        {
            String search5 = "todo5.txt";
            String sentence5 = txtFiles5[i].toString();
            if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
            {
                todoIndex5 = i;
            }
            System.out.println(txtFiles5[i]);
        }
        try {
            File todo5File = txtFiles5[todoIndex5];
            String content = item5text.getText();
            FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
            BufferedWriter bw5 = new BufferedWriter(fw5);
            // Write in file
            bw5.write(content);
            // Close connection
            bw5.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles6 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles6.length; i++)
        {
            String search6 = "todo6.txt";
            String sentence6 = txtFiles6[i].toString();
            if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
            {
                todoIndex6 = i;

            }
            System.out.println(txtFiles6[i]);
        }
        try {
            File todo6File = txtFiles6[todoIndex6];
            String content = item6text.getText();
            FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
            BufferedWriter bw6 = new BufferedWriter(fw6);
            // Write in file
            bw6.write(content);
            // Close connection
            bw6.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles7 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles7.length; i++)
        {
            String search7 = "todo7.txt";
            String sentence7 = txtFiles7[i].toString();
            if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
            {
                todoIndex7 = i;

            }
            System.out.println(txtFiles7[i]);
        }
        try {
            File todo7File = txtFiles7[todoIndex7];
            String content = item7text.getText();
            FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
            BufferedWriter bw7 = new BufferedWriter(fw7);
            // Write in file
            bw7.write(content);
            // Close connection
            bw7.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles8 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles8.length; i++)
        {
            String search8 = "todo8.txt";
            String sentence8 = txtFiles8[i].toString();
            if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
            {
                todoIndex8 = i;

            }
            System.out.println(txtFiles8[i]);
        }
        try {
            File todo8File = txtFiles8[todoIndex8];
            String content = item8text.getText();
            FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
            BufferedWriter bw8 = new BufferedWriter(fw8);
            // Write in file
            bw8.write(content);
            // Close connection
            bw8.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles9 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles9.length; i++)
        {
            String search9 = "todo9.txt";
            String sentence9 = txtFiles9[i].toString();
            if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
            {
                todoIndex9 = i;

            }
            System.out.println(txtFiles9[i]);
        }
        try {
            File todo9File = txtFiles9[todoIndex9];
            String content = item9text.getText();
            FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
            BufferedWriter bw9 = new BufferedWriter(fw9);
            // Write in file
            bw9.write(content);
            // Close connection
            bw9.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles10 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles10.length; i++)
        {
            String search10 = "todo10.txt";
            String sentence10 = txtFiles10[i].toString();
            if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
            {
                todoIndex10 = i;

            }
            System.out.println(txtFiles10[i]);
        }
        try {
            File todo10File = txtFiles10[todoIndex10];
            String content = item10text.getText();
            FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
            BufferedWriter bw10 = new BufferedWriter(fw10);
            // Write in file
            bw10.write(content);
            // Close connection
            bw10.close();
        }
        catch(Exception e)
        {

        }

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
        saver.stop();
        System.out.println(directoryPrefs.get(pref1, "directory"));
        dataLocation = directoryPrefs.get(pref1, "directory");
        System.out.println(dataLocation);

        File [] txtFiles1 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles1.length; i++)
        {
            System.out.println(txtFiles1[i]);
            String search1 = "todo1.txt";
            String sentence1 = txtFiles1[i].toString();
            if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
            {
                todoIndex1 = i;
            }
            System.out.println(txtFiles1[i]);
        }
        try
        {
            File todo1File = txtFiles1[todoIndex1];
            String content = item1text.getText();
            FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
            BufferedWriter bw1 = new BufferedWriter(fw1);
            // Write in file
            bw1.write(content);
            // Close connection
            bw1.close();
        }
        catch (Exception e)
        {

        }

        File [] txtFiles2 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles2.length; i++)
        {
            String search2 = "todo2.txt";
            String sentence2 = txtFiles2[i].toString();
            if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
            {
                todoIndex2 = i;
            }
            System.out.println(txtFiles2[i]);
        }
        try {
            File todo2File = txtFiles2[todoIndex2];
            String content = item2text.getText();
            FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
            BufferedWriter bw2 = new BufferedWriter(fw2);
            // Write in file
            bw2.write(content);
            // Close connection
            bw2.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles3 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles3.length; i++)
        {
            String search3 = "todo3.txt";
            String sentence3 = txtFiles3[i].toString();
            if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
            {
                todoIndex3 = i;
            }
            System.out.println(txtFiles3[i]);
        }
        try {
            File todo3File = txtFiles3[todoIndex3];
            String content = item3text.getText();
            FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
            BufferedWriter bw3 = new BufferedWriter(fw3);
            // Write in file
            bw3.write(content);
            // Close connection
            bw3.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles4 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles4.length; i++)
        {
            String search4 = "todo4.txt";
            String sentence4 = txtFiles4[i].toString();
            if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
            {
                todoIndex4 = i;
            }
            System.out.println(txtFiles4[i]);
        }
        try {
            File todo4File = txtFiles4[todoIndex4];
            String content = item4text.getText();
            FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
            BufferedWriter bw4 = new BufferedWriter(fw4);
            // Write in file
            bw4.write(content);
            // Close connection
            bw4.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles5 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles5.length; i++)
        {
            String search5 = "todo5.txt";
            String sentence5 = txtFiles5[i].toString();
            if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
            {
                todoIndex5 = i;
            }
            System.out.println(txtFiles5[i]);
        }
        try {
            File todo5File = txtFiles5[todoIndex5];
            String content = item5text.getText();
            FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
            BufferedWriter bw5 = new BufferedWriter(fw5);
            // Write in file
            bw5.write(content);
            // Close connection
            bw5.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles6 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles6.length; i++)
        {
            String search6 = "todo6.txt";
            String sentence6 = txtFiles6[i].toString();
            if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
            {
                todoIndex6 = i;

            }
            System.out.println(txtFiles6[i]);
        }
        try {
            File todo6File = txtFiles6[todoIndex6];
            String content = item6text.getText();
            FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
            BufferedWriter bw6 = new BufferedWriter(fw6);
            // Write in file
            bw6.write(content);
            // Close connection
            bw6.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles7 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles7.length; i++)
        {
            String search7 = "todo7.txt";
            String sentence7 = txtFiles7[i].toString();
            if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
            {
                todoIndex7 = i;

            }
            System.out.println(txtFiles7[i]);
        }
        try {
            File todo7File = txtFiles7[todoIndex7];
            String content = item7text.getText();
            FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
            BufferedWriter bw7 = new BufferedWriter(fw7);
            // Write in file
            bw7.write(content);
            // Close connection
            bw7.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles8 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles8.length; i++)
        {
            String search8 = "todo8.txt";
            String sentence8 = txtFiles8[i].toString();
            if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
            {
                todoIndex8 = i;

            }
            System.out.println(txtFiles8[i]);
        }
        try {
            File todo8File = txtFiles8[todoIndex8];
            String content = item8text.getText();
            FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
            BufferedWriter bw8 = new BufferedWriter(fw8);
            // Write in file
            bw8.write(content);
            // Close connection
            bw8.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles9 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles9.length; i++)
        {
            String search9 = "todo9.txt";
            String sentence9 = txtFiles9[i].toString();
            if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
            {
                todoIndex9 = i;

            }
            System.out.println(txtFiles9[i]);
        }
        try {
            File todo9File = txtFiles9[todoIndex9];
            String content = item9text.getText();
            FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
            BufferedWriter bw9 = new BufferedWriter(fw9);
            // Write in file
            bw9.write(content);
            // Close connection
            bw9.close();
        }
        catch(Exception e)
        {

        }

        File [] txtFiles10 = fileFinder(dataLocation);
        for (int i = 0; i < txtFiles10.length; i++)
        {
            String search10 = "todo10.txt";
            String sentence10 = txtFiles10[i].toString();
            if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
            {
                todoIndex10 = i;

            }
            System.out.println(txtFiles10[i]);
        }
        try {
            File todo10File = txtFiles10[todoIndex10];
            String content = item10text.getText();
            FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
            BufferedWriter bw10 = new BufferedWriter(fw10);
            // Write in file
            bw10.write(content);
            // Close connection
            bw10.close();
        }
        catch(Exception e)
        {

        }

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

    public void whenItem1Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item1.isSelected())
        {
            item1text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }

    }

    public void whenItem2Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item2.isSelected())
        {
            item2text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }

    }

    public void whenItem3Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item3.isSelected())
        {
            item3text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }
    }

    public void whenItem4Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item4.isSelected())
        {
            item4text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }
    }

    public void whenItem5Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item5.isSelected())
        {
            item5text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }
    }

    public void whenItem6Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item6.isSelected())
        {
            item6text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }

        }
    }

    public void whenItem7Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item7.isSelected())
        {
            item7text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }
    }

    public void whenItem8Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item8.isSelected())
        {
            item8text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }
    }

    public void whenItem9Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item9.isSelected())
        {
            item9text.setText("");
            System.out.println(directoryPrefs.get(pref1, "directory"));
            dataLocation = directoryPrefs.get(pref1, "directory");
            System.out.println(dataLocation);

            File [] txtFiles1 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles1.length; i++)
            {
                System.out.println(txtFiles1[i]);
                String search1 = "todo1.txt";
                String sentence1 = txtFiles1[i].toString();
                if ( sentence1.toLowerCase().indexOf(search1.toLowerCase()) != -1 )
                {
                    todoIndex1 = i;
                }
                System.out.println(txtFiles1[i]);
            }
            try
            {
                File todo1File = txtFiles1[todoIndex1];
                String content = item1text.getText();
                FileWriter fw1 = new FileWriter(todo1File.getAbsoluteFile());
                BufferedWriter bw1 = new BufferedWriter(fw1);
                // Write in file
                bw1.write(content);
                // Close connection
                bw1.close();
            }
            catch (Exception e)
            {

            }

            File [] txtFiles2 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles2.length; i++)
            {
                String search2 = "todo2.txt";
                String sentence2 = txtFiles2[i].toString();
                if ( sentence2.toLowerCase().indexOf(search2.toLowerCase()) != -1 )
                {
                    todoIndex2 = i;
                }
                System.out.println(txtFiles2[i]);
            }
            try {
                File todo2File = txtFiles2[todoIndex2];
                String content = item2text.getText();
                FileWriter fw2 = new FileWriter(todo2File.getAbsoluteFile());
                BufferedWriter bw2 = new BufferedWriter(fw2);
                // Write in file
                bw2.write(content);
                // Close connection
                bw2.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles3 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles3.length; i++)
            {
                String search3 = "todo3.txt";
                String sentence3 = txtFiles3[i].toString();
                if ( sentence3.toLowerCase().indexOf(search3.toLowerCase()) != -1 )
                {
                    todoIndex3 = i;
                }
                System.out.println(txtFiles3[i]);
            }
            try {
                File todo3File = txtFiles3[todoIndex3];
                String content = item3text.getText();
                FileWriter fw3 = new FileWriter(todo3File.getAbsoluteFile());
                BufferedWriter bw3 = new BufferedWriter(fw3);
                // Write in file
                bw3.write(content);
                // Close connection
                bw3.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles4 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles4.length; i++)
            {
                String search4 = "todo4.txt";
                String sentence4 = txtFiles4[i].toString();
                if ( sentence4.toLowerCase().indexOf(search4.toLowerCase()) != -1 )
                {
                    todoIndex4 = i;
                }
                System.out.println(txtFiles4[i]);
            }
            try {
                File todo4File = txtFiles4[todoIndex4];
                String content = item4text.getText();
                FileWriter fw4 = new FileWriter(todo4File.getAbsoluteFile());
                BufferedWriter bw4 = new BufferedWriter(fw4);
                // Write in file
                bw4.write(content);
                // Close connection
                bw4.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles5 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles5.length; i++)
            {
                String search5 = "todo5.txt";
                String sentence5 = txtFiles5[i].toString();
                if ( sentence5.toLowerCase().indexOf(search5.toLowerCase()) != -1 )
                {
                    todoIndex5 = i;
                }
                System.out.println(txtFiles5[i]);
            }
            try {
                File todo5File = txtFiles5[todoIndex5];
                String content = item5text.getText();
                FileWriter fw5 = new FileWriter(todo5File.getAbsoluteFile());
                BufferedWriter bw5 = new BufferedWriter(fw5);
                // Write in file
                bw5.write(content);
                // Close connection
                bw5.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles6 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles6.length; i++)
            {
                String search6 = "todo6.txt";
                String sentence6 = txtFiles6[i].toString();
                if ( sentence6.toLowerCase().indexOf(search6.toLowerCase()) != -1 )
                {
                    todoIndex6 = i;

                }
                System.out.println(txtFiles6[i]);
            }
            try {
                File todo6File = txtFiles6[todoIndex6];
                String content = item6text.getText();
                FileWriter fw6 = new FileWriter(todo6File.getAbsoluteFile());
                BufferedWriter bw6 = new BufferedWriter(fw6);
                // Write in file
                bw6.write(content);
                // Close connection
                bw6.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles7 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles7.length; i++)
            {
                String search7 = "todo7.txt";
                String sentence7 = txtFiles7[i].toString();
                if ( sentence7.toLowerCase().indexOf(search7.toLowerCase()) != -1 )
                {
                    todoIndex7 = i;

                }
                System.out.println(txtFiles7[i]);
            }
            try {
                File todo7File = txtFiles7[todoIndex7];
                String content = item7text.getText();
                FileWriter fw7 = new FileWriter(todo7File.getAbsoluteFile());
                BufferedWriter bw7 = new BufferedWriter(fw7);
                // Write in file
                bw7.write(content);
                // Close connection
                bw7.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles8 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles8.length; i++)
            {
                String search8 = "todo8.txt";
                String sentence8 = txtFiles8[i].toString();
                if ( sentence8.toLowerCase().indexOf(search8.toLowerCase()) != -1 )
                {
                    todoIndex8 = i;

                }
                System.out.println(txtFiles8[i]);
            }
            try {
                File todo8File = txtFiles8[todoIndex8];
                String content = item8text.getText();
                FileWriter fw8 = new FileWriter(todo8File.getAbsoluteFile());
                BufferedWriter bw8 = new BufferedWriter(fw8);
                // Write in file
                bw8.write(content);
                // Close connection
                bw8.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles9 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles9.length; i++)
            {
                String search9 = "todo9.txt";
                String sentence9 = txtFiles9[i].toString();
                if ( sentence9.toLowerCase().indexOf(search9.toLowerCase()) != -1 )
                {
                    todoIndex9 = i;

                }
                System.out.println(txtFiles9[i]);
            }
            try {
                File todo9File = txtFiles9[todoIndex9];
                String content = item9text.getText();
                FileWriter fw9 = new FileWriter(todo9File.getAbsoluteFile());
                BufferedWriter bw9 = new BufferedWriter(fw9);
                // Write in file
                bw9.write(content);
                // Close connection
                bw9.close();
            }
            catch(Exception e)
            {

            }

            File [] txtFiles10 = fileFinder(dataLocation);
            for (int i = 0; i < txtFiles10.length; i++)
            {
                String search10 = "todo10.txt";
                String sentence10 = txtFiles10[i].toString();
                if ( sentence10.toLowerCase().indexOf(search10.toLowerCase()) != -1 )
                {
                    todoIndex10 = i;

                }
                System.out.println(txtFiles10[i]);
            }
            try {
                File todo10File = txtFiles10[todoIndex10];
                String content = item10text.getText();
                FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
                BufferedWriter bw10 = new BufferedWriter(fw10);
                // Write in file
                bw10.write(content);
                // Close connection
                bw10.close();
            }
            catch(Exception e)
            {

            }
        }
    }

    public void whenItem10Clicked(ActionEvent actionEvent) throws Exception
    {
        if (item10.isSelected())
        {
            item10text.setText("");
            String content10 = item10text.getText();
            File todo10File = new File(this.getClass().getResource("/resources/todo10.txt").getPath());
            FileWriter fw10 = new FileWriter(todo10File.getAbsoluteFile());
            BufferedWriter bw10 = new BufferedWriter(fw10);
            bw10.write(content10);
            bw10.close();
        }
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


    public void whenSavedDataButtonPressed(ActionEvent actionEvent)
    {
        Controller3 test1 = new Controller3();

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
}



