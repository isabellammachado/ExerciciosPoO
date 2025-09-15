package Animais;

public  class Cachorro extends Animais {


    public Cachorro() {
        super("Cachorro", "Masculino", "Au au");
	}
    public void emitirSom() {
        System.out.println(" auau");
	}
	public String getEspecie() {
		return "Cachorro";
	
	}
}
