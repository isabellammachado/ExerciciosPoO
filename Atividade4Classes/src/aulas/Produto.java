package aulas;
//2) Criar uma classe com nome Produto com os atributos abaixo: 

public class Produto {
	
	private String descricao;
	private double valor;
	private int quantidade;

	public Produto(String descricao, double valor, int quantidade) {
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double calcularTotal() {
	return valor * quantidade;
}
	
	public double  CalcularICMS() {
		return calcularTotal()* 0.12;
	}		
	
	public String imprimirDados() {
        return "Descrição: " + descricao +
               "\nValor: " + String.format("%.2f", valor) +
               "\nTotal: " + String.format("%.2f", calcularTotal()) +
               "\nICMS: " + String.format("%.2f", CalcularICMS());
    }

}
