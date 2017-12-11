package controle;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

import application.*;
import dao.FilmeDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControleFilme implements Initializable {
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
	private Label LblGenero;
	@FXML
	private Label LblTitulo;
	@FXML
	private Label LblArtista;
	@FXML
	private Label LblTituloP;
	@FXML
	private TextField TxtFieldTitulo;
	@FXML
	private TextField TxtFieldTituloP;
	@FXML
	private ComboBox<String> CboxGenero;
	@FXML
	private ComboBox<String> CboxArtista;
	@FXML
	private Button BtnIncluirArtista;
	@FXML
	private Button BtnExcluirArtista;
	@FXML
	private Button BtnAtualizarArtista;
	@FXML
	private Button BtnAtualizarGenero;
	@FXML
	private Button BtnExcluirGenero;
	@FXML
	private Button BtnIncluirGenero;
	@FXML
	private Button BtnCadastrar;
	@FXML
	private Button BtnExcluir;
	@FXML
	private Button BtnAlterar;
	@FXML
	private Button BtnAlterarP;
	@FXML
	private Button BtnPT;
	@FXML
	private Button BtnEN;
	@FXML
	private Button BtnPesquisar;
	@FXML
	private Menu MenuCadPes;
	@FXML
	private Menu MenuRelatorios;
	@FXML
	private Menu MenuUsuario;
	@FXML
	private TabPane TabPaneFilme;
	@FXML
	private Tab TabCadastro;
	@FXML
	private Tab TabPesquisa;
	
	Locale ptBR = new Locale("pt","BR");
	Locale enUS = new Locale("en","US");
	ResourceBundle bundlept = ResourceBundle.getBundle("internacionalization",ptBR);
	ResourceBundle bundleen = ResourceBundle.getBundle("internacionalization",enUS);
	@FXML
	private void BtnIncluirArtistaOnAction(ActionEvent event) {

	}

	@FXML
	private void BtnExcluirArtistaOnAction(ActionEvent event) {

	}
	
	@FXML
	private void BtnAlterarPOnAction(ActionEvent event) {

	}

	@FXML
	private void BtnAtualizarArtistaOnAction(ActionEvent event) throws SQLException {
		this.alimentaComboArtista();
	}

	@FXML
	private void BtnAtualizarGeneroOnAction(ActionEvent event) throws SQLException {
		this.alimentaComboGenero();
	}

	@FXML
	private void BtnExcluirGeneroOnAction(ActionEvent event) {

	}

	@FXML
	private void BtnIncluirGeneroOnAction(ActionEvent event) {

	}

	@FXML
	private void BtnCadastrarOnAction(ActionEvent event) {

	}

	@FXML
	private void BtnExcluirOnAction(ActionEvent event) {
		TabPaneFilme.getSelectionModel().select(1);
		util.Util.mensagemInformacao("Pesquise antes de deletar algo");
	}

	@FXML
	private void BtnAlterarOnAction(ActionEvent event) {
		TabPaneFilme.getSelectionModel().select(1);
		util.Util.mensagemInformacao("Pesquise antes de alterar algo");
	}

	@FXML
	private void BtnPTOnAction(ActionEvent event) {
		this.BtnAlterar.setText(bundlept.getString("Atualizar"));
		this.BtnAlterarP.setText(bundleen.getString("Atualizar"));
		
		this.TabCadastro.setText(bundlept.getString("Cadastrar"));
		this.TabPesquisa.setText(bundlept.getString("Pesquisa"));
		
		this.MenuCadPes.setText(bundlept.getString("Cadastrar/Pesquisar"));
		this.MenuRelatorios.setText(bundlept.getString("Relatorio"));
		this.MenuUsuario.setText(bundlept.getString("Usuario"));
		
		this.BtnAtualizarArtista.setText(bundlept.getString("Atualizar"));
		this.BtnAtualizarGenero.setText(bundlept.getString("Atualizar"));
		
		this.BtnCadastrar.setText(bundlept.getString("Cadastrar"));
		
		this.BtnExcluir.setText(bundlept.getString("Excluir"));
		
		this.BtnExcluirArtista.setText(bundlept.getString("Excluir"));
		this.BtnExcluirGenero.setText(bundlept.getString("Excluir"));
		
		this.BtnIncluirArtista.setText(bundlept.getString("Incluir"));
		this.BtnIncluirGenero.setText(bundlept.getString("Incluir"));
		
		this.BtnPesquisar.setText(bundlept.getString("Pesquisa"));
		
		this.LblArtista.setText(bundlept.getString("Artistas"));
		this.LblGenero.setText(bundlept.getString("Genero"));
		this.LblTitulo.setText(bundlept.getString("Titulo"));
		this.LblTituloP.setText(bundlept.getString("Titulo"));
		
		this.MenuItemArtista.setText(bundlept.getString("Artistas"));
		this.MenuItemGenero.setText(bundlept.getString("Genero"));
		this.MenuItemFilme.setText(bundlept.getString("Filme"));
	}

	@FXML
	private void BtnENOnAction(ActionEvent event) {
		this.BtnAlterar.setText(bundleen.getString("Atualizar"));
		this.BtnAlterarP.setText(bundleen.getString("Atualizar"));
		
		this.TabCadastro.setText(bundleen.getString("Cadastrar"));
		this.TabPesquisa.setText(bundleen.getString("Pesquisa"));
		
		this.MenuCadPes.setText(bundleen.getString("Cadastrar/Pesquisar"));
		this.MenuRelatorios.setText(bundleen.getString("Relatorio"));
		this.MenuUsuario.setText(bundleen.getString("Usuario"));
		
		this.BtnAtualizarArtista.setText(bundleen.getString("Atualizar"));
		this.BtnAtualizarGenero.setText(bundleen.getString("Atualizar"));
		
		this.BtnCadastrar.setText(bundleen.getString("Cadastrar"));
		
		this.BtnExcluir.setText(bundleen.getString("Excluir"));
		this.BtnExcluirArtista.setText(bundleen.getString("Excluir"));
		this.BtnExcluirGenero.setText(bundleen.getString("Excluir"));
		
		this.BtnIncluirArtista.setText(bundleen.getString("Incluir"));
		this.BtnIncluirGenero.setText(bundleen.getString("Incluir"));
		
		this.BtnPesquisar.setText(bundleen.getString("Pesquisa"));
		
		this.LblArtista.setText(bundleen.getString("Artistas"));
		this.LblGenero.setText(bundleen.getString("Genero"));
		this.LblTitulo.setText(bundleen.getString("Titulo"));
		this.LblTituloP.setText(bundleen.getString("Titulo"));
		
		this.MenuItemArtista.setText(bundleen.getString("Artistas"));
		this.MenuItemGenero.setText(bundleen.getString("Genero"));
		this.MenuItemFilme.setText(bundleen.getString("Filme"));
	}

	@FXML
	private void BtnPesquisarOnAction(ActionEvent event) {

	}

	@FXML
	private TableView<String> TVGeneros;
	@FXML
	private TableView<String> TVArtistas;

	@FXML
	void MenuItemFilmeOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblGenero.getScene().getWindow();
		stage1.close();
		MainFilme m1 = new MainFilme();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@FXML
	void MenuItemGeneroOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblGenero.getScene().getWindow();
		stage1.close();
		MainGenero m1 = new MainGenero();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@FXML
	void MenuItemArtistaOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblGenero.getScene().getWindow();
		stage1.close();
		MainArtista m1 = new MainArtista();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@FXML
	void MenuItemGerarRelatorioOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblGenero.getScene().getWindow();
		stage1.close();
		MainRelatorio m1 = new MainRelatorio();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@FXML
	void MenuItemUsuarioOnAction(ActionEvent event) {
		Stage stage1 = (Stage) LblGenero.getScene().getWindow();
		stage1.close();
		MainUsuario m1 = new MainUsuario();
		Stage stage = new Stage();
		m1.start(stage);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		try {
			this.alimentaComboArtista();
			this.alimentaComboGenero();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void alimentaComboGenero() throws SQLException {
		FilmeDao fmd = new FilmeDao();
		ArrayList<String> combobox = new ArrayList<String>();
		combobox = fmd.AL_pb_AtualizaComboBoxGenero();
		CboxGenero.getItems().clear();// limpando a combobox
		for (String genero : combobox) {
			CboxGenero.getItems().add(genero);
		}
	}

	public void alimentaComboArtista() throws SQLException {
		FilmeDao fmd = new FilmeDao();
		ArrayList<String> combobox = new ArrayList<String>();
		combobox = fmd.AL_pb_AtualizaComboBoxArtista();
		CboxArtista.getItems().clear();// limpando a combobox
		for (String artista : combobox) {
			CboxArtista.getItems().add(artista);
		}
	}
}
