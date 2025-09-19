package aulas;


public class Funcionario {
	
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Funcionario(String nome, double salario) {
		this.nome= nome;
		this.salario = salario;
	
	}
	public double calcularInss() {
		return salario* 0.11;
	}
	public double calcularValeTransporte() {
		return salario*0.06;
	}
	public double salarioLiquido() {
		return this.salario - calcularInss() - calcularValeTransporte();
	}
	public String imprimirDados() {
		return "Nome: " + nome + "\nSalário R$" + String.format("%.2f", salario) + "\nINSS R$"
				+ String.format("%.2f", calcularInss()) + "\nVale Transporte R$"
				+ String.format("%.2f", calcularValeTransporte()) + "\nSalário líquido R$"
				+ String.format("%.2f", salarioLiquido());
	}
	
}