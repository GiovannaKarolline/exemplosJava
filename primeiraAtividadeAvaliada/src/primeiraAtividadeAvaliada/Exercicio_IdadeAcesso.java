package primeiraAtividadeAvaliada;

//biblioteca do scanner, objeto usado para receber informacões do usuário durante a execução do programa.
import java.util.Scanner;

public class Exercicio_IdadeAcesso {
	
	/* criei o scanner de maneira global porque, caso essa funcão fosse usada em meio a um sistema, 
	 * se ela tivesse a criação de um scanner dentro dela e já existisse um scanner dentro da main(), 
	 * poderia ocorrer algum problema.
	*/
	
	public static Scanner leia = new Scanner(System.in);
	
	
	/*função que solicita nome, idade e, em alguns casos, autorizacão dos responsáveis e diz se o 
	 * respondente possui acesso liberado ou negado.
	 */
	public static void acessoPorIdade() {
		int idade = 0;
		String nome = "";
		boolean possuiAutorizacao = false;
		
		System.out.println("\nDigite o nome:");
		nome = leia.nextLine();
		
		System.out.println("\nDigite a idade:");
		idade = leia.nextInt();
		
		/* apenas menores de idade precisam de autorização dos responsáveis, por isso somente eles recebem essa
		pergunta: */
		if(idade < 18) {
			System.out.println("\nPossui autorização dos responsáveis?");
			possuiAutorizacao = leia.nextBoolean();
		}
		
		//menores de idade só podem acessar se possuírem autorização dos responsáveis.
		if(idade > 18) {
			System.out.printf("\nAcesso liberado para %s.",nome);
		}else if(possuiAutorizacao) {
			System.out.printf("\nAcesso liberado com autorização para %s.",nome);
		}else {
			System.out.printf("\nAcesso negado para %s.",nome);
		}
	}

	public static void main(String[] args) {
		
		//chamada da função (pela função ser static, pode ser chamada sem estar ligada a um objeto)
		acessoPorIdade();
		
		//fechamento do scanner para limpar o buffer e evitar erros
		leia.close();
	}
}
