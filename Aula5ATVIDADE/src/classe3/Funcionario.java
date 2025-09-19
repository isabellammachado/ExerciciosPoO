package classe3;

public class Funcionario {
 protected String nome;
 protected String cpf;
 protected double salario;
 protected String turno;

	public Funcionario(String nome, double salario) {
	        this.nome = nome;
	        this.salario = salario;
	    }
	public String getTurno() {
			return turno;
		}
		public void setTurno(String turno) {
			this.turno = turno;
		}
	public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}

	@Override
	public String toString() {
		return "Funcionario nome: " + nome + ", salario: R$" + salario ;
	}
	public void aumentarSalario() {
		this.salario += salario*0.02;
	}
	}


