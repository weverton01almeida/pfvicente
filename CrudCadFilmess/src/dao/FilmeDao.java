package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Filme;
import modelo.Msg_banco;

public class FilmeDao {
	Conexao conexao = new Conexao();

	public Msg_banco msg_banco_pb_incluiFilme(Filme filme) throws SQLException {
		return null;

	}

	public Msg_banco msg_banco_pb_AlteraFilme(Filme filme) throws SQLException {
		return null;

	}

	public Msg_banco msg_banco_pb_BuscaFilme(Filme filme) throws SQLException {
		return null;

	}

	public Msg_banco msg_banco_pb_DeletaFilme(Filme filme) throws SQLException {
		return null;

	}

	public ArrayList<String> AL_pb_AtualizaComboBoxGenero() throws SQLException {
		ArrayList<String> Genero = new ArrayList<String>();
		String sql = null;
		sql = "SELECT `TIPOGENERO` FROM `genero`";
		Connection conn = conexao.abreConexaoBD();
		ResultSet rs = null;
		Statement st = null;
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		while (rs.next()) {
			Genero.add((String.valueOf(rs.getString("TIPOGENERO"))));
		}
		return Genero;
	}

	public ArrayList<String> AL_pb_AtualizaComboBoxArtista() throws SQLException {
		ArrayList<String> Artista = new ArrayList<String>();
		String sql = null;
		sql = "SELECT `NOME` FROM `artista`";
		Connection conn = conexao.abreConexaoBD();
		ResultSet rs = null;
		Statement st = null;
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		while (rs.next()) {
			Artista.add((String.valueOf(rs.getString("NOME"))));
		}
		return Artista;
	}

	public ArrayList<String> AL_pb_AtualizaTableViewArtista() throws SQLException {
		return null;

	}

	public ArrayList<String> AtualizaTableViewGenero() throws SQLException {
		return null;

	}

	public String InsereTableViewArtista() throws SQLException {
		return null;

	}

	public String InsereTableViewGenero() throws SQLException {
		return null;

	}

	public String AlteraTableViewArtista() throws SQLException {
		return null;

	}

	public String AlteraTableViewGenero() throws SQLException {
		return null;

	}

	public String DeletaTableViewArtista() throws SQLException {
		return null;

	}

	public String DeletaTableViewGenero() throws SQLException {
		return null;

	}
}
