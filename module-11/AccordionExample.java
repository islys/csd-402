
/*  Ryan Monnier
 *  CSD 402
 *  11 May 2025
 *  Module 11
 *  Accordion Example
 *  Code Source:    https://jenkov.com/tutorials/javafx/accordion.html
 *  **Note, also sourced in my paper
 */

/*  Importing the javafx components that are required for this functionality
*
*   This was a little annoying to make work, in order to get this to compile correctly, I 
*   needed to point the compiler at the library. Apparently this can be avoided if you make a
*   project folder, but I didn't want to do that for this.
*
*   syntax used:
*   javac --module-path %PATH_TO_FX% --add-modules javafx.controls JavafxAccordion.java
*   java --module-path %PATH_TO_FX% --add-modules javafx.controls JavafxAccordion
*   where %PATH_TO_FX% is just an environment variable that I set to the path of my extracted JavaFX
*/ 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// main class to extend the JavaFX Applicaiton class
public class AccordionExample extends Application {

    // main method which launches the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }
    // the start() method is the entry point for JavaFX applications
    public void start(Stage primaryStage) {

        // creates our new accordion
        Accordion accordion = new Accordion();

        // make our TitledPanes which would be used as the label for our collapsible fields
        TitledPane pane1 = new TitledPane("Boats" , new Label("Show all boats available"));
        TitledPane pane2 = new TitledPane("Cars"  , new Label("Show all cars available"));
        TitledPane pane3 = new TitledPane("Planes", new Label("Show all planes available"));

        // adding the TitledPanes to the accordion
        accordion.getPanes().add(pane1);
        accordion.getPanes().add(pane2);
        accordion.getPanes().add(pane3);
        
        // this places the accordion inside of a VBox layout for alignment purposes
        VBox vBox = new VBox(accordion);
        
        // a Scene that has VBox as the root node
        Scene scene = new Scene(vBox);

        // set the scene to the primary stage (window)
        primaryStage.setScene(scene);

        // displays the actual window
        primaryStage.show();
    }
}