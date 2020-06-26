package entities;

abstract class Dados {
	private Double[] data;
	private Integer quantidade;
	
	public Dados( Double[] data, Integer quantidade) {
		this.data = data;
		this.quantidade = quantidade;
	}
	
	public void mostrarDados() {
		for ( int i = 0; i < quantidade; i++ ) {
			System.out.printf("%.2f  ", data[i]);
		}
	}
	
	public void setData( Double[] data ) {
		this.data = data;
	}
	public Double[] getData() {
		return this.data;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade( Integer quantidade ) {
		this.quantidade = quantidade;
	}
}
