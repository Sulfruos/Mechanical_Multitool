# Mechanical_Multitool

***INTRO***

Mechanical Multitool is a JavaFX/FXML project built from the ground up by Arvind Pillai using the IntelliJ Java IDE. 
Designed to improve your productivity through packaging a Notepad, Todo-list, Timer, and a stress-relief Sketchpad that uses blocks into one smooth interface.

***FEATURES***

The notepad is an autosaving text area that uses a .txt file to store your data. 
To use this feature, you MUST choose a folder to save the .txt file in, or your data will not save. 
I recommend you create a new folder for the data with nothing else in it.

The todo-list is very similar. It has 10 text areas you can use to put your items in, and also uses .txt files to store data.
Once again, you MUST choose a folder to save the .txt files in, or your data will not save.
You should use the same folder you use for the notepad data for the todolist data. 

The timer is a simple timer with pause and reset features. 

The sketchpad has 64 squares that can be filled with black or white color by clicking on them. It is a great stress relief tool.

***INSTRUCTIONS FOR USAGE***

1)Download JavaFX version 11 for your computer at the following link: https://gluonhq.com/products/javafx/. Place it somewhere convenient. 

2)Download the Mechanical Multitool .jar file, and place it in your Desktop.

3)Open Terminal, then type "cd Desktop". 

4)To run the app, run the following command in Terminal: 

java -jar --module-path /***PATHTO***/javafx-sdk-11.0.2/lib --add-modules=javafx.controls,javafx.fxml MechanicalMultitool.jar

Mac users can get the path to the javafx sdk through right clicking the folder, clicking "Get Info", then copying the "Where" section. 

From here, you can use Mechanical Multitool!

***BUGS***

Issues with file loading occassionally happen when you have not chosen a directory, but this should almost never occur. 
However, you should make sure not to delete the directory you are saving your data in.
