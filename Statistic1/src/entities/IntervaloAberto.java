package entities;

public class IntervaloAberto {
	/*Para achar o intervalo aberto, precisamos de: 
	 * 
	 * (Maior valor - Menor valor)/2
	 * 
	 * sendo os valores referentes ao conjunto de dados
	 * */
	
	
	public int definirIntervalo(double dados[][]) {
		double start = dados[0][0];
		double finish = dados[dados.length - 1][dados.length - 1];
		
		double calcInterval = (finish - start) / 2;
		
		int interval = (int) Math.round(calcInterval);
		
		System.out.println(interval);
		
		return interval;
	}
	
	/*Aplicando a fórmula de ESTURGES, temos que:
	 * 
	 * K = 1 + 3.3 log n
	 * 
	 * Onde n é o numero de dados.
	 * */
	
	public int definirClasse(int i) {
		double calcClass = 1 + 3.3 * Math.log10((double)i) ;
		int k = (int) Math.round(calcClass);
		
		if (k % 2 != 0)
		{
			k++;
		}
		
		System.out.println(k);
		
		return k;
	}
}
