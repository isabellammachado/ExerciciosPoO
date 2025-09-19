package classe3;
/*
 * 2) Criar uma nova classe com o nome PessoaFisica herdando de ImpostoDeRenda com os seguintes
atributos privados: 
String (cpf e rg) 
 */
public class PessoaFisica extends ImpostoDeRenda {
	
	private String cpf;
    private String rg;
    
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public double CalculoIR(double rendimento) {
		return rendimento *0.12;
				
	}
	
	public String toString() {
	    return "Dados Pessoa Fisica: " +
	            "\nNome: " + nome  +
	            "\nCpf:" + cpf  +
	            "\nRg: " + rg  +
	            "\nRendimentos: R$" + rendimentos +
	            "\nValor a pagar de IR: R$" + CalculoIR(rendimentos);
	            }


}

