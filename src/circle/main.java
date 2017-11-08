package circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		
		
		Scene scene = new Scene(root, 500, 500);
		
		stage.setScene(scene);
		stage.show();
		
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