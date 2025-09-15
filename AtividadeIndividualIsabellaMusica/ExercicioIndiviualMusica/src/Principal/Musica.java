package Principal;

import java.util.ArrayList;
import Animais.*;

public class Musica {
	public static void main(String[] args) {

		ArrayList<Animais> animais = new ArrayList<Animais>();
		animais.add(new Pintinho());
		animais.add(new Galo());
		animais.add(new Galinha());
		animais.add(new Cachorro());
		animais.add(new Gato());

		ArrayList<Animais> anteriores = new ArrayList<>(); //guarda os q ja cantaram, pra repetir dps

		int estrofe = 0;

		for (Animais a : animais) {
			System.out.print(a.LaEmCasaTinha());
			System.out.print(a.LaEmCasaTinha());
			System.out.print(a.ELaOuEle());
			a.emitirSom();

			if (a.getEspecie().equals("Pintinho")) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(a.ELaOuEle());
					a.emitirSom();
				}
				System.out.println();
			} else {
				for (int i = anteriores.size() - 1; i >= 0; i--) {
					Animais anterior = anteriores.get(i);

					int repeticoes;

					if (anterior.getEspecie().equals("Pintinho")) {
						if (estrofe == 1) {
							repeticoes = 5;
						} else {
							repeticoes = 4;
						}
					} else {
						repeticoes = 1;
					}

					for (int j = 0; j < repeticoes; j++) {
						System.out.print(anterior.ELaOuEle());
						anterior.emitirSom();
					}
				}
				System.out.println();
			}

			anteriores.add(a);
			estrofe++;
		}
	}
}
