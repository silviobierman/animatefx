package animatefx;

import javafx.animation.RotateTransition; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Polygon; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
         
public class AnimateFX extends Application {
	@Override 
	public void start(Stage stage) {
		//Creating a hexagon 
		Polygon hexagon = new Polygon();        

		//Adding coordinates to the hexagon 
		hexagon.getPoints().addAll(new Double[]{        
		200.0, 50.0, 
		400.0, 50.0, 
		450.0, 150.0,          
		400.0, 250.0, 
		200.0, 250.0,                   
		150.0, 150.0, 
		}); 
		//Setting the fill color for the hexagon 
		hexagon.setFill(Color.GREEN); 

		//Creating a rotate transition    
		RotateTransition rotateTransition = new RotateTransition(); 

		//Setting the duration for the transition 
		rotateTransition.setDuration(Duration.millis(2000)); 

		//Setting the node for the transition 
		rotateTransition.setNode(hexagon);       

		//Setting the angle of the rotation 
		rotateTransition.setByAngle(360); 

		//Setting the cycle count for the transition 
		rotateTransition.setCycleCount(10); 

		//Setting auto reverse value to false 
		rotateTransition.setAutoReverse(true); 

		//Playing the animation 
		rotateTransition.play(); 

		Polygon triangle = new Polygon();        

		//Adding coordinates to the hexagon 
		triangle.getPoints().addAll(new Double[]{        
		100.0, 100.0, 
		250.0, 250.0, 
		100.0, 300.0 
		}); 

		//Creating a Group object   
		Group root = new Group(hexagon,triangle); 

		//Creating a scene object 
		Scene scene = new Scene(root, 600, 300);   

		//Setting title to the Stage 
		stage.setTitle("Rotate transition example "); 

		//Adding scene to the stage 
		stage.setScene(scene); 

		//Displaying the contents of the stage 
		stage.show(); 
	} 

	public static void main(String args[]) {
		launch(args); 
	} 
} 