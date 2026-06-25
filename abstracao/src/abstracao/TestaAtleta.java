package abstracao;

public class TestaAtleta {

	public static void main(String[] args) {

		Triatleta atleta = new Triatleta("Rafaela");

		atleta.aquecer();
		atleta.correr();
		atleta.nadar();
		atleta.pedalar();
		atleta.cansou();
	}

}
