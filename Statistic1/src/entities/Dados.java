package entities;
import java.util.Scanner;

public class Dados {
	Scanner sc =  new Scanner(System.in);
	
	public int i;
	public int j;
	public double Data[][];
	
	
	public int lines(int i) {
		this.i = i;
		return this.i;
	}
	
	public int columns(int j) {
		this.j = j;
		return j;
	}
	
	public double Data() {
		this.Data = new double[this.i][this.j];
		
		for (int cont = 0; cont < this.i; cont++) {
			
			for (int cont2 = 1; cont2 <= this.j; cont2++) {
				
				System.out.printf("Insira o %dº valor: ", cont2);
				this.Data[cont][cont2 -1] = sc.nextDouble();
				
			}
		}
		
		sc.close();
		
		return this.Data[this.i - 1][this.j - 1];
	}
	

}
