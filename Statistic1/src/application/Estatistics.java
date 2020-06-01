package application;

import java.util.Locale;

import entities.Dados;
import entities.IntervaloAberto;
import entities.Rol;

public class Estatistics {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Dados d1 = new Dados();
		Rol r1 = new Rol();
		IntervaloAberto i1 = new IntervaloAberto();
		
		d1.lines(2);
		d1.columns(2);
		d1.Data();
		r1.organizaDados(d1.i, d1.j, d1.Data);
		r1.newData();
		
		i1.definirIntervalo(r1.data);
		i1.definirClasse(d1.i);
		
		
	}

}
