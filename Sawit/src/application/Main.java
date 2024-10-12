package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox mainViewBox = new HBox();
		Scene mainScene = new Scene(mainViewBox, 350, 350);
		
		primaryStage.setTitle("Sawit - Film Tracker");
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
