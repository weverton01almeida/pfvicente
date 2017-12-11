package dao;

import java.sql.SQLException;
import modelo.Genero;
import modelo.Msg_banco;

public class GeneroDao {
	public Conexao conexao = new Conexao();
	public Msg_banco incluiGenero(Genero genero) throws SQLException {
		/*Msg_banco msg = new Msg_banco();
		if (conexao.abreConexaoBD() == null) {
			msg.setId(0);// banco de dados nao conectado
			return msg;
		} else {
			*//** tipos id msg
			 0=> Banco de dados nao conectado
			 1=> Operação efetuada
			 2=> Operação nao efetuada
			 3=> Registro ja cadastrado
			 4=> Registro nao cadastrado*//*

			String sql = null;
			Connection conn = conexao.abreConexaoBD();
			ResultSet rs;
			Statement st = conn.createStatement();
			String NomeArtista = genero.st_pb_getNome();
			sql = "select * from banco_de_dados where banco_NomeBancoDados ='" + NomeBD + "' and banco_TipoBanco = '"
					+ TipoBD + "'";
			sql = "SELECT * FROM `filmes`.`artista` WHERE"
					+ " (CONVERT(`COD_ARTISTA` USING utf8) LIKE '%"+NomeArtista+"%' OR CONVERT(`NOME` USING utf8) LIKE '%"+NomeArtista+"%')";
			rs = st.executeQuery(sql);
			if (rs.next() == false) {// nao tem cadastro
				sql = "insert into banco_de_dados (banco_NomeBancoDados,Banco_TipoBanco) values (";
				sql = "INSERT INTO `artista` (`COD_ARTISTA`, `NOME`) VALUES (NULL, '"+NomeArtista+"');";
				int qRs = st.executeUpdate(sql);
				if (qRs == 0)
					msg.setId(2);
				else
					msg.setId(1);
			} else
				msg.setId(3); // possui cadastro*/
			return null;
		}

	public Msg_banco ExcluiGenero(Genero genero) throws SQLException {
		return null;

	}

	public Msg_banco BuscaGenero(Genero genero) throws SQLException {
		return null;

	}
	public Msg_banco AlteraGenero(Genero genero) throws SQLException {
		return null;

	}
	public Msg_banco AtualizaTableViewGenero(Genero genero) throws SQLException {
		return null;

	}
	
}
