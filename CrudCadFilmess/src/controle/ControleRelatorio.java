package controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import application.*;
public class ControleRelatorio implements Initializable {
	@FXML
	private MenuItem MenuItemFilme;
	@FXML
	private MenuItem MenuItemGenero;
	@FXML
	private MenuItem MenuItemArtista;
	@FXML
	private Label LblMsg;
	@FXML
	private MenuItem MenuItemGerarRelatorio;
	@FXML
	private MenuItem MenuItemUsuario;
	
	@FXML
	void MenuItemFilmeOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblMsg.getScene().getWindow();
		stage1.close();
		MainFilme m1 = new MainFilme();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@FXML
	void MenuItemGeneroOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblMsg.getScene().getWindow();
		stage1.close();
		MainGenero m1 = new MainGenero();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@FXML
	void MenuItemArtistaOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblMsg.getScene().getWindow();
		stage1.close();
		MainArtista m1 = new MainArtista();
		Stage stage = new Stage();
		m1.start(stage);
	}
	
	@FXML
	void MenuItemGerarRelatorioOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblMsg.getScene().getWindow();
		stage1.close();
		MainRelatorio m1 = new MainRelatorio();
		Stage stage = new Stage();
		m1.start(stage);
	}
	
	@FXML
	void MenuItemUsuarioOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblMsg.getScene().getWindow();
		stage1.close();
		MainUsuario m1 = new MainUsuario();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
