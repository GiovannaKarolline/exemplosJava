package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio3_aptoDoarSangue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		boolean primeiraDoacao;
		int idade;
		
		System.out.print("\nDigite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.print("\nDigite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.print("\nÉ a primeira doação de sangue? (true ou false): ");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade>18 && idade <70) {
			if(idade<60 || primeiraDoacao == false) {
				System.out.printf("\n%s está apto(a) para doar sangue!", nome);
			}else if(primeiraDoacao == true) {
				System.out.printf("\n%s não está apto(a) para doar sangue!",nome);
			}
		}
		leia.close();
	}

}
