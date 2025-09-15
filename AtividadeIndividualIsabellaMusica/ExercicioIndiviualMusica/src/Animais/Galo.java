package Animais;

public  class Galo extends Animais {

	 public Galo() {
	        super("Galo", "Masculino", "Cocoricó");
	}
	public void emitirSom() {
        System.out.println(" cocoricó");
	}
	public String setEspecie() {
		return "Galo";
	}

	
}
