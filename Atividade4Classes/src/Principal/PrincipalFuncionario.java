package Principal;

import javax.swing.JOptionPane;

import aulas.Funcionario;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Adriano", 3000.00);

		JOptionPane.showMessageDialog(null, funcionario.imprimirDados(), "Dados do Funcionário",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
