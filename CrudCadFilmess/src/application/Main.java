package application;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.ArtistaDao;
import modelo.Artista;

public class Main {
	public static void main(String[] args) throws SQLException {

		Artista Artista = new Artista();
		Artista.vd_pb_setNome("a");
		/*
		 * if (Conexao.abreConexaoBD() == null) {
		 * System.out.println("Banco de dados nao conectado");// banco de dados nao
		 * conectado }else { System.out.println("Conectado"); }
		 
		ArtistaDao artistDao = new ArtistaDao();
		
		 * TipoBanco tbd = new TipoBanco(); TipoBancoDAO tbdDAO = new TipoBancoDAO();
		 
		Msg_banco retorno = artistDao.msg_banco_pb_incluiArtista(Artista);
		if (retorno.getId() == 1)
			System.out.println(retorno.getInclusao());
		else
			System.out.println(retorno.getInclusao());*/
		ArtistaDao ad = new ArtistaDao();
		ArrayList<Artista> ar = new ArrayList<Artista>();
		ar = ad.ALArtista_pb_BuscaArtista(Artista);
		for(Artista s : ar) {
			System.out.println(s.st_pb_getNome());
		}
		
	}
}
