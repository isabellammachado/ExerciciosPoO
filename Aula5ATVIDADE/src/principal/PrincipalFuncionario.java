package principal;
import classe3.Gerente;
import classe3.Assistente;

public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionarios(); 
    
    }
    public static void Funcionarios() {
 
        Gerente g = new Gerente(" Maria", 2000.0, "TI");
        Assistente a = new Assistente(" Pedro", 1500.0, 300.0);

        g.setSetor("Gerente");
        g.setSetor("Assistente");
        g.aumentarSalario();
        a.aumentarSalario();
        
       System.out.println(g.toString());
       System.out.println("------------");
       System.out.println(a.toString());
     
    }
    
}

