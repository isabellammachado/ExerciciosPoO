package aulas;

public class TestaMedico {
    public static void main(String[] args) {
       
        Medico medico1 = new Medico("12345", "Ana Maria", 0, 250);
        Medico medico2 = new Medico("456789", "Antônio", 0, 300);

        medico1.pagamentoDinheiro(medico1.valorConsulta);
        medico2.pagamentoPlano(medico2.valorConsulta);

        medico1.imprimirDados();
        System.out.println(); 
        System.out.println();
        medico2.imprimirDados();
        Medico.getTotalMedicos();
        
        
    }
}
