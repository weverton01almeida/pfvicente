package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import modelo.Artista;
import modelo.Msg_banco;

public class ArtistaDao {
	public Conexao conexao = new Conexao();

	public Msg_banco msg_banco_pb_incluiArtista(Artista artist) throws SQLException {
		Msg_banco msg = new Msg_banco();
		if (conexao.abreConexaoBD() == null) {
			msg.setId(0);// banco de dados nao conectado
			return msg;
		} else {
			/**
			 * tipos id msg 0=> Banco de dados nao conectado 1=> Operação efetuada 2=>
			 * Operação nao efetuada 3=> Registro ja cadastrado 4=> Registro nao cadastrado
			 */

			String sql = null;
			Connection conn = conexao.abreConexaoBD();
			ResultSet rs;
			Statement st = conn.createStatement();
			String NomeArtista = artist.st_pb_getNome();
			/*
			 * sql = "select * from banco_de_dados where banco_NomeBancoDados ='" + NomeBD +
			 * "' and banco_TipoBanco = '" + TipoBD + "'";
			 */
			sql = "SELECT * FROM `filmes`.`artista` WHERE" + " (CONVERT(`COD_ARTISTA` USING utf8) LIKE '%" + NomeArtista
					+ "%' OR CONVERT(`NOME` USING utf8) LIKE '%" + NomeArtista + "%')";
			rs = st.executeQuery(sql);
			if (rs.next() == false) {// nao tem cadastro
				/*
				 * sql =
				 * "insert into banco_de_dados (banco_NomeBancoDados,Banco_TipoBanco) values (";
				 */
				sql = "INSERT INTO `artista` (`COD_ARTISTA`, `NOME`) VALUES (NULL, '" + NomeArtista + "');";
				int qRs = st.executeUpdate(sql);
				if (qRs == 0)
					msg.setId(2);
				else
					msg.setId(1);
			} else
				msg.setId(3); // possui cadastro
			return msg;
		}
	}

	public Msg_banco msg_banco_pb_ExcluiArtista(Artista artist) throws SQLException {
		return null;

	}

	public ArrayList<Artista> ALArtista_pb_BuscaArtista(Artista artist) throws SQLException {
		ArrayList<Artista> Artista = new ArrayList<Artista>();
		String sql = null;
		sql = "SELECT * FROM `artista` WHERE `NOME` LIKE '%" + artist.st_pb_getNome() + "%' ORDER BY `NOME` ASC ";
		Connection conn = conexao.abreConexaoBD();
		ResultSet rs = null;
		Statement st = null;
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		while (rs.next()) {
			artist = new Artista();
			artist.vd_pb_setNome(rs.getString("NOME"));
			Artista.add(artist);
		}
		return Artista;
	}

	public Msg_banco msg_banco_pb_AlteraArtista(Artista artist) throws SQLException {
		return null;

	}

	public ArrayList<String> msg_banco_pb_AtualizaTableViewArtista(Artista artist) throws SQLException {
		return null;

	}
}
