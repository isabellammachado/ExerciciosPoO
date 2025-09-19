package classe3;
/*
 * 1) Criar uma classe com o nome ImpostoDeRenda com os seguintes atributos com visibilidade protected. 
String (nome, telefone e email)  
double (rendimentos) 
 */
public class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;
	

	public ImpostoDeRenda(String nome, double rendimentos){
	    this.rendimentos = rendimentos;
	    this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	
		
	}



	

	

