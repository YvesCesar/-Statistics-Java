package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rol;

public class Estatistics {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Insira a quantidade de dados a serem armazenadas: ");
		int quantidade = sc.nextInt();
		
		double[] dados = new double[quantidade];
		
		for ( int i = 0; i < quantidade; i++) {
			System.out.printf("Insira o %dº valor: ", i + 1);
			dados[i] = sc.nextDouble();
		}
		
		Rol data = new Rol( dados, quantidade );
		data.mostrarDados();

		
		sc.close();
	}

}
