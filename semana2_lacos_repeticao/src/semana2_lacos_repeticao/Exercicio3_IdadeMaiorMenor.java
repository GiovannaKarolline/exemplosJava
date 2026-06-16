package semana2_lacos_repeticao;

import java.util.Scanner;

public class Exercicio3_IdadeMaiorMenor {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int idade = 0, menores21 = 0, maiores50 = 0;
		boolean continuar = true;
		
		System.out.println("Estatísticas por idade\n(digite uma idade negativa para parar)");
		
		while(continuar) {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			if(idade > 0 && idade < 21) {
				menores21++;
			}else if(idade > 50) {
				maiores50++;
			}else if(idade < 0) {
				continuar = false;
			}
		}
		
		System.out.println("\nEstatísticas:");
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menores21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maiores50);
		
		leia.close();
	}

}
