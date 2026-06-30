package terceiraAtividadeAvaliada;

public class Usuario {
	private String nome;
	private String email;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public void visualizar() {
		System.out.println("Nome do usuário: " + this.nome);
		System.out.println("E-mail: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
