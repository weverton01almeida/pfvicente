package controle;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelo.Artista;
import modelo.Msg_banco;
import application.*;
import dao.ArtistaDao;

public class ControleArtista implements Initializable {
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
	private Label LblNomeP;
	@FXML
	private TextField TxtFieldNomeP;
	@FXML
	private TextField TxtFieldNome;
	@FXML
	private Button BtnInserir;
	@FXML
	private Button BtnAlterar;
	@FXML
	private Button BtnExcluir;
	@FXML
	private Button BtnAlterarP;
	@FXML
	private Button BtnPesquisarP;
	@FXML
	private Button BtnDeletarP;
	@FXML
	private TableView<Artista> TVArtista;
	@FXML
	private TableColumn<Artista, String> TCArtista;

	@FXML
	void BtnInserirOnAction(ActionEvent event) throws SQLException {
		if (util.Util.stringVaziaOuNula(this.TxtFieldNome.getText())) {
			util.Util.mensagemErro("Informe o nome do Artista");
		} else {
			Artista artist = new Artista();
			ArtistaDao artistDao = new ArtistaDao();
			/*
			 * TipoBanco tbd = new TipoBanco(); TipoBancoDAO tbdDAO = new TipoBancoDAO();
			 */

			artist.vd_pb_setNome(this.TxtFieldNome.getText());
			Msg_banco retorno = artistDao.msg_banco_pb_incluiArtista(artist);
			if (retorno.getId() == 1)
				util.Util.mensagemInformacao(retorno.getInclusao());
			else
				util.Util.mensagemErro(retorno.getInclusao());
		}
	}

	@FXML
	void BtnAlterarOnAction(ActionEvent event) {
		util.Util.mensagemInformacao("Voce selecionou o botao alterar");

	}

	@FXML
	void BtnExcluirOnAction(ActionEvent event) {
		util.Util.mensagemInformacao("Voce selecionou o botao excluir");
	}

	@FXML
	void BtnAlterarPOnAction(ActionEvent event) throws SQLException {

	}

	@FXML
	void BtnPesquisarPOnAction(ActionEvent event) throws SQLException {
		/*
		 * util.Util.
		 * mensagemInformacao("Voce selecionou o botao pesquisar na aba pesquisar");
		 */

		if (util.Util.stringVaziaOuNula(this.TxtFieldNomeP.getText())) {
			util.Util.mensagemErro("Informe o nome do Artista");
		} else {
			Artista artist = new Artista();
			ArtistaDao artistDao = new ArtistaDao();
			artist.vd_pb_setNome(this.TxtFieldNome.getText());

			ArrayList<Artista> ALartista = new ArrayList<Artista>();
			ALartista=artistDao.ALArtista_pb_BuscaArtista(artist);
			ObservableList<Artista> OBartista = FXCollections.observableArrayList(ALartista);
			this.TVArtista.setItems(OBartista);
/*			TCArtista.setCellValueFactory(new PropertyValueFactory<Artista, String>("st_pv_Nome"));*/

			if (ALartista.isEmpty())
				util.Util.mensagemInformacao("Nao há artistas a serem exibidos");
			else
				util.Util.mensagemErro("Busca Concluida");
		}

	}

	@FXML
	void BtnDeletarPOnAction(ActionEvent event) {
		util.Util.mensagemInformacao("Voce selecionou o botao excluir na aba pesquisar");

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
