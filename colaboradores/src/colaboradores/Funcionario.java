package colaboradores;

public abstract class Funcionario {
	private String nome;
	private String email;
	private double salario;
	
	public Funcionario(String nome, String email, double salario) {
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		Validacao.validarSalario(salario);
		
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Validacao.validarNome(nome);
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Validacao.validarEmail(email);
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		Validacao.validarSalario(salario);
		this.salario = salario;
	}
	
	public void visualizar() {
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.printf("\nSalário: %.2f", this.salario);
	}
	
	public abstract double calcularSalario();
}
