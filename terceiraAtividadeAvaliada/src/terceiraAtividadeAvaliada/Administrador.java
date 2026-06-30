package terceiraAtividadeAvaliada;

public class Administrador extends Usuario{
	private int nivelDeAcesso;
	
	
	public Administrador(String nome, String email) {
		super(nome, email);
		
	}


	public int getNivelDeAcesso() {
		return nivelDeAcesso;
	}


	public void setNivelDeAcesso(int nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de acesso: " + nivelDeAcesso);
	}
	
}
