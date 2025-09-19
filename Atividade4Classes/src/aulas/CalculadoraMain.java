package aulas;

import javax.swing.JOptionPane;

public class CalculadoraMain {
	public static void main(String[] args) {
		int opcao;

		do {
			opcao = menu();

			if (opcao >= 1 && opcao <= 4) {
				double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
				double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

				Calculadora calc = new Calculadora(num1, num2);

				double resultado = 0;
				String operacao = "";

				switch (opcao) {
				case 1:
					resultado = calc.soma();
					operacao = "Soma";
					break;
				case 2:
					resultado = calc.subtracao();
					operacao = "Subtração";
					break;
				case 3:
					resultado = calc.multiplicacao();
					operacao = "Multiplicação";
					break;
				case 4:
					if (num2 == 0) {
						JOptionPane.showMessageDialog(null, "Divisão por zero não existe!");
						continue;
					}
					resultado = calc.divisao();
					operacao = "Divisão";
					break;
				}

				JOptionPane.showMessageDialog(null, "Resultado da " + operacao + ": " + resultado);
			} else if (opcao == 5) {
				JOptionPane.showMessageDialog(null, "Gostou não? Tchau");
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}

		} while (opcao != 5);
	}

	public static int menu() {
		String menu = """
				----- Calculadora -----
				1 – Soma
				2 – Subtração
				3 – Multiplicação
				4 – Divisão
				5 – Sair
				Escolha uma opção:
				""";

		String input = JOptionPane.showInputDialog(menu);
		if (input == null)
			return 5; 

		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return -1; 
		}
	}
}
