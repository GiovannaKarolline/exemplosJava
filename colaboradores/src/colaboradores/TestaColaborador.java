package colaboradores;

public class TestaColaborador {

	public static void main(String[] args) {
		testarEmailInvalido();
	}
	
	public static void testarEmailInvalido() {
		try {
			Gerente gerente = new Gerente("Carla", "carla@gmail.com",1500.00f, 1000.00f);
			gerente.visualizar();
		}catch(IllegalArgumentException erro) {
			System.err.println("Erro: " + erro.getMessage());
		}
	}

}
