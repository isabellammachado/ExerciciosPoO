package principal;
import java.util.Scanner;
import exercicioVendedor.Fixo;

public class PrinciplaVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        //(String nome, String cpf, double salarioBase, double comissao, double salarioBruto

        Fixo vendedor1 = new Fixo("Joana", "156.625.965-87", 2000.0, 0, 2000.0);
        Fixo vendedor2 = new Fixo("Maria", "153.965.452-98", 2000.0, 0, 2000.0);

        do {
            System.out.println("------- Sistema de Vendas --------");
            System.out.println("Vendedores:");
            System.out.println("1 - " + vendedor1.getNome());
            System.out.println("2 - " + vendedor2.getNome());
            System.out.println("Escolha o vendedor:");
            System.out.print(" ");
            opcao = scanner.next();
     
            switch (opcao) {
                case "1":
                    System.out.println("Digite o valor da venda: ");
                    double venda1 = scanner.nextDouble();
                    vendedor1.calcularSalario(venda1);
                    break;
                case "2":
                    System.out.println("Digite o valor da venda: ");
                    double venda2 = scanner.nextDouble();
                    vendedor2.calcularSalario(venda2);
                    break;
                	default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println("Deseja encerrar o programa? (S/N)");
            opcao = scanner.next();

        } while (!opcao.equalsIgnoreCase("S"));   
        System.out.println("\n--- Salários dos Vendedores ---");
        System.out.println("Nome: " +vendedor1.getNome() + "\nSalário: Bruto: R$ " + vendedor1.getSalarioBruto());
        System.out.println("Nome: " +vendedor2.getNome() + "\nSalário: Bruto: R$ " + vendedor2.getSalarioBruto());
        System.out.println("----------- Total Vendido -----------");
        
        System.out.println("Total: R$ " + vendedor1.getTotalVendido()+vendedor2.getTotalVendido());
        scanner.close();
    }
}
