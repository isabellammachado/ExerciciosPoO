package aulas;
/*
 * 1) Criar um novo projeto com o nome.
 *  Criar um pacote com o nome aulas.
Criar uma classe com o nome Medico
 */
public class Medico {

	String crm;
	String nome;
	double salario;
	double valorConsulta;
	
	private static int totalMedicos = 0;
	
	public Medico(String crm, String nome, double salario, double valorConsulta) {
		this.crm= crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;	
		totalMedicos++;
	}
	public void pagamentoDinheiro(double valor) {
		this.salario +=valor;
	}
	public void pagamentoPlano(double valor) {
		this.salario +=(valor *0.7);	
		
	 }

    public static int getTotalMedicos() {
        return totalMedicos;
    }	 

	public void imprimirDados(){
		System.out.println("Dados do médico");
		System.out.println("------------------");
		System.out.printf("CRM: %s - %s\n " ,crm, nome);
		System.out.printf("Salário: R$%.2f" ,salario);
		System.out.println("\n------------------");
	    System.out.println("\nMédicos cadastrados: " + Medico.getTotalMedicos());
	}
	
}