package entities;

public class Rol {
	public double data[][];
	
	
	public void organizaDados( int i, int j, double data[][] ) {
		this.data = new double[i][j];
		double aux;
		int x, y;
		
		//Aplicando Algoritmo de Bubblesort
		
		for(x = 0; x < i; x++) {
			for (y = 0; y < j; y++) {
				
			}
		}
		
		
		
		for(int cont = 0; cont < i; cont++) {
			for(int cont2 = 1; cont2 <= j; cont2++) {				
				this.data[cont][cont2 - 1] = data[cont][cont2 - 1];
			}
		}
		
		for(int cont = 0; cont < i; cont++) {
			for(int cont2 = 1; cont2 <= j; cont2++) {				
				System.out.println(data[cont][cont2 - 1]);
			}
		}
	}
	
	public double[][] newData() {
		return this.data;
	}
	
}
