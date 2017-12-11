package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class MainRelatorio extends Application {
@Override
public void start(Stage primaryStage) {
	try {
		AnchorPane root = new AnchorPane();
		root = FXMLLoader.load(getClass().getResource("/view/Relatorio.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Relatorio");
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
}

public static void main(String[] args) {
	launch(args);
}
}
