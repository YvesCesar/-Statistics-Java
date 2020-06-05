package entities;

abstract class Dados {
	private double[] data;
	private int quantidade;
	
	public Dados( double[] data, int quantidade) {
		this.data = data;
		this.quantidade = quantidade;
	}
	
	public void mostrarDados() {
		for ( int i = 0; i < quantidade; i++ ) {
			System.out.printf("%.2f  ", data[i]);
		}
	}
	
	public void setData( double[] data ) {
		this.data = data;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade( int quantidade ) {
		this.quantidade = quantidade;
	}
}
