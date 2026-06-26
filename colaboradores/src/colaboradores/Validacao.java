package colaboradores;

public class Validacao {
	public static void validarNome(String nome) {
		if(nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome não pode ser vazio.");
		}
	}
	
	public static void validarEmail(String email) {
		if(!email.matches("ˆ[a-zA-Z0-9._%+\\]")) {
			throw new IllegalArgumentException("Digite um e-mail válido.");
		}
	}
	
	public static void validarSalario(double salario) {
		if(salario <= 0) {
			throw new IllegalArgumentException("O salário precisa ser maior que zero.");
		}
	}
	
	public static void validarBonus(double bonus) {
		if(bonus < 0) {
			throw new IllegalArgumentException("O salário precisa ser maior ou igual a zero.");
		}
	}
}
