package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	//declaring fields
	TextField val1enter = new TextField();
	TextField val2enter = new TextField();
	TextField sumenter = new TextField();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//creating node root
			GridPane root = new GridPane();
			
			//defining scene
			Scene scene = new Scene(root,400,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//creating labels 
			Label val1 = new Label("First Value:");
			Label val2 = new Label("Second Value:");
			Label sumlbl = new Label("Sum is:");
			
			
			
			val1enter = new TextField();
			val2enter = new TextField();
			sumenter = new TextField();
			
			//making sure sum can't be edited
			sumenter.setEditable(false);
			
			//creating button
			Button calc = new Button("Calculate");
			
			//formatting
			root.setAlignment(Pos.CENTER);
			root.setVgap(10);
			root.setHgap(10);
			
			//adding things to node root so they will be added to scene, so they will be viewed on staged
			root.add(val1, 0, 0);
			root.add(val2, 0, 1);
			root.add(sumlbl, 0, 2);
			root.add(val1enter, 1, 0);
			root.add(val2enter, 1, 1);
			root.add(sumenter, 1, 2);
			root.add(calc, 1, 3);
			
			//alligning calc
			root.setHalignment(calc, HPos.LEFT);
			
			//handling event on calc
			calc.setOnAction(new HandleCalc());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	class HandleCalc implements EventHandler<ActionEvent>{
		
		public void handle(ActionEvent arge) {
			// TODO Auto-generated method stub
			
			//getting strings from textfields and converting to ints
			int number1 = Integer.parseInt(val1enter.getText());
			int number2 = Integer.parseInt(val2enter.getText());
			
			//converting sum to string and assinging it to the textfield
			sumenter.setText(Integer.toString((number1+number2)));
			
		}
	}
}
