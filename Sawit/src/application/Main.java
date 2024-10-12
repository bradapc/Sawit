package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		HBox mainViewBox = new HBox();
		VBox listingsVBox = new VBox();
		VBox controlsVBox = new VBox();
		
		TextField filterListingsText = new TextField();
		filterListingsText.setPromptText("filter film listings");
		ListView<String> listingsDisplay = new ListView<String>();
		listingsVBox.getChildren().addAll(filterListingsText, listingsDisplay);
		
		
		Button viewListingButton = new Button("View");
		Button addListingButton = new Button("Add");
		Button removeListingButton = new Button("Remove");
		Button editListingButton = new Button("Edit");
		viewListingButton.setMinWidth(80);
		addListingButton.setMinWidth(80);
		removeListingButton.setMinWidth(80);
		editListingButton.setMinWidth(80);
		controlsVBox.getChildren().addAll(viewListingButton, addListingButton, removeListingButton, editListingButton);
		
		mainViewBox.getChildren().addAll(listingsVBox, controlsVBox);
		Scene mainScene = new Scene(mainViewBox, 350, 350);
		
		
		
		primaryStage.setTitle("Sawit - Film Tracker");
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
