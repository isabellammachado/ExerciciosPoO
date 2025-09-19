package classeMaratona;

public class Maratona {
	private String nome;
	private String sexo;
	private int idade;
	private double altura;
	
	public Maratona(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	

	public double getAltura() {
		return altura;
	}

	public String getSexo() {
		return sexo;
	}
	public String verificaSituacao() {
	    if (idade > 18 && altura >= 1.80) {
	        return "Poderá participar da maratona";
	    } else {
	        return "Não poderá participar da maratona. Idade ou altura insuficientes!";
	    }
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura;
					
	}
	
}
