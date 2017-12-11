package modelo;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Artista {
	/**
	 * Atritubos
	 */
	private SimpleIntegerProperty in_pv_Cod_Artista;
	private SimpleStringProperty st_pv_Nome;

	public String st_pb_getNome() {
		return st_pv_Nome.get();
	}

	public void vd_pb_setNome(String st_pv_Nome) {
		this.st_pv_Nome = new SimpleStringProperty(st_pv_Nome);
	}

	public int in_pb_getCod_Artista() {
		return in_pv_Cod_Artista.get();
	}

	public void vd_pb_setCod_Artista(int in_pv_Cod_Artista) {
		this.in_pv_Cod_Artista = new SimpleIntegerProperty(in_pv_Cod_Artista);
	}

}
