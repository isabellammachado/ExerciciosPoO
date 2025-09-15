package Animais;

public  class Animais {
	protected String especie;
	protected String sexo;
	protected String som;
	
	public Animais(String especie, String sexo, String som) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.som = som;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
		
	}
	 public void emitirSom() {
	        System.out.println(som);
		}

	public String LaEmCasaTinha() {
		String quem = sexo.equalsIgnoreCase("feminino") ? "uma" : "um";
		return String.format("La em casa tinha %s %s\n", quem , getEspecie());
	}
	
	public String ELaOuEle() {
        String artigo = sexo.equalsIgnoreCase("Feminino") ? "a" : "o";
        return String.format("E %s %s ", artigo, especie.toLowerCase());
	}	
	}
