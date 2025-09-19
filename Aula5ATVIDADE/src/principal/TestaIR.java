package principal;

import classe3.PessoaFisica;
import classe3.PessoaJuridica;

public class TestaIR {
	
	public static void main(String[] args) {
		TestarIr();
	}
		
		public static void TestarIr() {
        PessoaFisica pf = new PessoaFisica("Isabella Machado", 5220.00, "265.256.589-94", "526.848.595-98");
        PessoaJuridica pj = new PessoaJuridica("Loja Três Marias", 150000.00, "41.033.484/0001-52", "13.946.930");

        System.out.println(pf.toString());
        System.out.println("------------------");
        System.out.println(pj.toString());
        

    }
}

