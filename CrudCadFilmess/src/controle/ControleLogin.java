package controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import application.MainMenu;
public class ControleLogin implements Initializable {
	@FXML
	private Button BtnLogin;
	
	@FXML
	private TextField TxtFieldLogin;
	
	@FXML
	private PasswordField PassFieldSenha;
	
	@FXML
	void BtnLoginOnAction(ActionEvent event) {
		MainMenu menu = new MainMenu();
		Stage stage1 = (Stage) BtnLogin.getScene().getWindow();
		stage1.close();
		Stage stage = new Stage();
		menu.start(stage);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}