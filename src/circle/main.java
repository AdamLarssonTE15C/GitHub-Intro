package circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		
		
		Scene scene = new Scene(root, 500, 500);
		
		stage.setScene(scene);
		stage.show();
		
		Circle cir = new Circle(60);
		cir.setTranslateX(250);
		cir.setTranslateY(250);
		cir.setFill(Color.BLACK);
		
		root.getChildren().addAll(cir);
		
		
		scene.setOnKeyPressed(event->{
			
		
		if(event.getCode() == KeyCode.RIGHT){
			
		}
		
		if(event.getCode() == KeyCode.LEFT){
			
		}
		
			if(event.getCode() == KeyCode.S){
				
					
			}	
				
				if(event.getCode() == KeyCode.D){
					
					
				}		
				
				if(event.getCode() == KeyCode.R){
					
				}
		
		
	});	
}
		
		


public static void main(String[] args) {
	launch(args);
	
	
	}
}