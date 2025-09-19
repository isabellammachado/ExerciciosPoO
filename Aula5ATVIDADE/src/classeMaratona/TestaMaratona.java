package classeMaratona;

public class TestaMaratona {
	public static void main(String[] args) {
		
	AtletaAmador Aa1 = new AtletaAmador ("Davi", "Masculino" , 17 , 1.95, true);
	AtletaProfissional Ap1 = new AtletaProfissional ("Rodrigo", "Masculino", 36, 1.93, 97.5);
	AtletaProfissional Ap2 = new AtletaProfissional ("Maria", "Feminino", 17, 1.68, 67.5);
	
	System.out.println("Dados dos Atleta Amador");
	System.out.println(Aa1.toString());
	System.out.println(Aa1.verificaSituacao());
	System.out.println("---------------------------");
	System.out.println("Dados dos Atleta Profissional");
	System.out.println(Ap1.toString());
	System.out.println(Ap1.verificaSituacao());
	System.out.println("---------------------------");
	System.out.println("Dados dos Atleta Profissional");
	System.out.println(Ap2.toString());
	System.out.println(Ap2.verificaSituacao());
	}

}
