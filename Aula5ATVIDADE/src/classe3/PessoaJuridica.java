package classe3;
/*
 * 3) Criar uma nova classe com o nome PessoaJuridica herdando de ImpostoDeRenda com os seguintes
atributos privados: 
String (cnpj e inscEstadual). 
 */
public class PessoaJuridica extends ImpostoDeRenda{
	
	private String cnpj;
	private String inscEstadual;
	
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public double CalculoIR(double rendimento) {
		return rendimento *0.15;
	}
	public String toString() {
	    return "Dados Pessoa Jurídica: " +
	            "\nNome: " + nome  +
	            "\nInscrição Estadual: " + inscEstadual  +
	            "\nCNPJ: " + cnpj  +
	            "\nRendimentos: R$" + rendimentos +
	            "\nValor a pagar de IR: R$" + CalculoIR(rendimentos);
	            }
	}


