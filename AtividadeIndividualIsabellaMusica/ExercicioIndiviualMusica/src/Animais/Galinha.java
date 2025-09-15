package Animais;

public  class Galinha extends Animais{

	public Galinha() {
        super("Galinha", "Feminino", "Có");
	}
	public void emitirSom() {
        System.out.println(" có");
	}
	public String getSexo() {
		return "Feminino";
	}
	public String getEspecie() {
		return "Galinha";
	}
}
