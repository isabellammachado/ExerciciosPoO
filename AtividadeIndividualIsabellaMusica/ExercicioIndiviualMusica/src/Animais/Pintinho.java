package Animais;

public class Pintinho extends Animais{
	
		
	public Pintinho() {
	    super("Pintinho", "Masculino", "Piu");
	}

	public void emitirSom() {
        System.out.println(" piu");
	}
	
	
	public String getEspecie() {
		return "Pintinho";
	}

}
