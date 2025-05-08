package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) { // palco primarystage
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/gui/Tela.fxml")); // parent classe generica
			Scene scene = new Scene(parent); // cena
			primaryStage.setScene(scene); // palco terá essa cena
			primaryStage.show(); // mostrar palco
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
