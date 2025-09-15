package Animais;

public  class Gato extends Animais{

	public Gato() {
        super("Gato", "Masculino", "Miau");
	}
	public void emitirSom() {
        System.out.println(" miau");
	}
	public String getEspecie() {
		return "Gato";
	}

	
	}

