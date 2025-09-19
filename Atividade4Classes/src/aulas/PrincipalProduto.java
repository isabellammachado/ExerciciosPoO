package aulas;
import javax.swing.JOptionPane;

public class PrincipalProduto {
	public static void main(String[] args) {
		String encerrar = "N";

		while (encerrar != "S" || encerrar != "s"){
			
			String descricao = JOptionPane.showInputDialog("Produto:");
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));

		
			Produto produto = new Produto(descricao, valor, quantidade);

	
			JOptionPane.showMessageDialog(null, produto.imprimirDados(), "Resumo Total",
					JOptionPane.INFORMATION_MESSAGE);


			encerrar = JOptionPane.showInputDialog("Deseja encerrar o programa? (S/N)");
		}

		JOptionPane.showMessageDialog(null, "Programa finalizado.");
	}
}
