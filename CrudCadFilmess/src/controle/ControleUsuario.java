package controle;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import application.*;
public class ControleUsuario implements Initializable {
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
	private Label LblNome;
	@FXML
	private Label LblLogin;
	@FXML
	private Label LblSenha;
	@FXML
	private Label LblTipo;
	@FXML
	private TextField TxtFieldNome;
	@FXML
	private TextField TxtFieldLogin;
	@FXML
	private TextField TxtFieldUsuario;
	@FXML
	private Button BtnAlterar;
	@FXML
	private Button BtnInserir;
	@FXML
	private Button BtnDeletar;
	@FXML
	private Button BtnAlterarP;
	@FXML
	private Button BtnPesquisarP;
	@FXML
	private Button BtnExcluirP;
	@FXML
	private ComboBox<String> ComboBoxTipo;
	@FXML
	private ComboBox<String> ComboBoxUsuario;
	@FXML
	private TableView<String> TVUsuario;
	@FXML
	private TableColumn<?, ?> TCNome;
	@FXML
	private TableColumn<?, ?> TCLogin;
	@FXML
	private TableColumn<?, ?> TCSenha;
	@FXML
	private TableColumn<?, ?> TCTipo;
	
	@FXML
	private PasswordField PassFieldSenha;
	
	
	@FXML
	void BtnAlterarOnAction(ActionEvent event) {

	}
	@FXML
	void BtnInserirOnAction(ActionEvent event) {

	}
	@FXML
	void BtnDeletarOnAction(ActionEvent event) {

	}
	@FXML
	void BtnAlterarPOnAction(ActionEvent event) {

	}
	@FXML
	void BtnPesquisarPOnAction(ActionEvent event) {

	}
	@FXML
	void BtnExcluirPOnAction(ActionEvent event) {

	}
	
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
