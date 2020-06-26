package entities;

public class Rol extends Dados{
	
	private Double[] rol = new Double[super.getQuantidade()];
	
	public Rol(Double[] data, Integer quantidade) {
		super(data, quantidade);
	}

	public void organizaDados() {
		Double dados[] = new Double[ super.getQuantidade() ];
		dados = super.getData();
		
		//Aplicando Algoritmo de Bubblesort 
		//https://github.com/YvesCesar/Algoritmo-Bubblesort/blob/master/algoritmoBubblesort.c
		for ( int i = 1; i < super.getQuantidade(); i ++ ) {
			for ( int j = 0; j < super.getQuantidade() - 1; j++ ) {
				
				if ( dados[j] > dados[j + 1] ) 
				{
					Double aux = dados[j];
					dados[j] = dados[j + 1];
					dados[j + 1] = aux;
				}
			}
		}
		
		//Montando o rol:
		for ( int i = 0; i < super.getQuantidade(); i ++ ) {
			rol[i] = dados[i];
		}
		
	}
	
	public void mostrarRol() {
		for ( int i = 0; i < super.getQuantidade(); i++ ) {
			System.out.print(rol[i] + " ");
		}
	}
	
	
}
