
/*  Ryan Monnier
 *  CSD 402
 *  11 May 2025
 *  Module 11
 *  GridPane Example
 *  Code Source:    https://www.tutorialspoint.com/javafx/layout_gridpane.htm
 *  **Note, also sourced in my paper
 */

/*  Importing the javafx components that are required for this functionality
*
*   This was a little annoying to make work, in order to get this to compile correctly, I 
*   needed to point the compiler at the library. Apparently this can be avoided if you make a
*   project folder, but I didn't want to do that for this.
*
*   syntax used:
*   javac --module-path %PATH_TO_FX% --add-modules javafx.controls GridPaneExample.java
*   java --module-path %PATH_TO_FX% --add-modules javafx.controls GridPaneExample
*   where %PATH_TO_FX% is just an environment variable that I set to the path of my extracted JavaFX
*/ 

import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage; 

// main class
public class GridPaneExample extends Application { 
   @Override 
   public void start(Stage stage) {      
      //creating label email 
      Text text1 = new Text("Email");       
      
      //creating label password 
      Text text2 = new Text("Password"); 
	  
      //Creating Text Filed for email        
      TextField textField1 = new TextField();       
      
      //Creating Text Filed for password        
      TextField textField2 = new TextField();  
       
      //Creating Buttons 
      Button button1 = new Button("Submit"); 
      Button button2 = new Button("Clear");  
      
      //Creating a Grid Pane 
      GridPane gridPane = new GridPane();    
      
      //Setting size for the pane  
      gridPane.setMinSize(400, 200); 
       
      //Setting the padding  
      gridPane.setPadding(new Insets(10, 10, 10, 10)); 
      
      //Setting the vertical and horizontal gaps between the columns 
      gridPane.setVgap(5); 
      gridPane.setHgap(5);       
      
      //Setting the Grid alignment 
      gridPane.setAlignment(Pos.CENTER); 
       
      //Arranging all the nodes in the grid 
      gridPane.add(text1, 0, 0); 
      gridPane.add(textField1, 1, 0); 
      gridPane.add(text2, 0, 1);       
      gridPane.add(textField2, 1, 1); 
      gridPane.add(button1, 0, 2); 
      gridPane.add(button2, 1, 2);  
      
      //Creating a scene object 
      Scene scene = new Scene(gridPane);  
      
      //Setting title to the Stage 
      stage.setTitle("Grid Pane Example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
} 

/*  I thought this was a really cool example because I hadn't really considered 
*   how valuable the grid would be for things outside of data sets. JavaFX really seems
*   to come alive when you start stacking these different containers to maximize their overall
*   funcitonality. 
*/