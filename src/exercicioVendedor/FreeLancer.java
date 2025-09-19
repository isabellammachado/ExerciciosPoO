package exercicioVendedor;

public class FreeLancer extends Vendedor{
	private int diasTrabalhados;
	private int valorDia;
	
	public FreeLancer(String nome, String cpf, int diasTrabalhados, int valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public int getValorDia() {
		return valorDia;
	}

	public void setValorDia(int valorDia) {
		this.valorDia = valorDia;
	}
	
	
	
	
}
