package it.salvoemme;
	
import it.salvoemme.model.IndovinaModel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Indovina.fxml"));
			BorderPane root = (BorderPane)loader.load();
//			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Indovina.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			IndovinaController controller = loader.getController();
			IndovinaModel model = new IndovinaModel();
			controller.setModel(model);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
