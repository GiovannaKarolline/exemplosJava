package primeiraAtividadeAvaliada;

//biblioteca do scanner, objeto usado para receber informacões do usuário durante a execução do programa.
import java.util.Scanner;

public class Exercicio_ClassificacaoNota {
	
	/* criei o scanner de maneira global porque, caso essa funcão fosse usada em meio a um sistema, 
	 * se ela tivesse a criação de um scanner dentro dela e já existisse um scanner dentro da main(), 
	 * poderia ocorrer algum problema.
	*/
	public static Scanner leia = new Scanner(System.in);
	
	public static String situacaoAluno(float nota) {
		if(nota < 5) {
			return "Reprovado";
		}else if(nota < 7){
			return "Recuperação";
		}
		return "Aprovado";
	}
	
	public static void main(String[] args) {
		
		String nomeAluno = "";
		float notaAluno = 0.0f;
		
		System.out.println("Classificação por nota do aluno");
		System.out.println("Digite o nome do aluno:");
		nomeAluno = leia.nextLine();
		System.out.println("Digite a nota do aluno:");
		notaAluno = leia.nextFloat();
		
		System.out.printf("\nAluno: %s\nSituação: %s", nomeAluno, situacaoAluno(notaAluno));
	
		//fechamento do scanner para limpar o buffer e evitar erros
		leia.close();
	}
}
