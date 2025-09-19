package exercicioVendedor;

public class Fixo extends Vendedor {
	private double salarioBase;
	private double comissao;
	private double salarioBruto;
	private double totalVendido;
	
	public Fixo(String nome, String cpf, double salarioBase, double comissao, double salarioBruto) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBruto;
	}

	public void calcularSalario(double totalVendido) {
        double valorComissao = totalVendido * 0.03;
        this.comissao += valorComissao; 
        this.salarioBruto += valorComissao;
        this.setTotalVendido(this.getTotalVendido() + totalVendido);
	}
    
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}
	
	
}
