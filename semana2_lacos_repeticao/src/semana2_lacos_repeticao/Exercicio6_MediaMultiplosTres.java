package semana2_lacos_repeticao;

import java.util.Scanner;

public class Exercicio6_MediaMultiplosTres {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numeroAtualSomaQuantidade = new int[3];
		float mediaMultiplos3 = 0.0f;
		
		System.out.println("Média dos números múltiplos de 3\n(digite 0 para finalizar a conta)");
		
		do {
			System.out.println("\nDigite um número inteiro:");
			numeroAtualSomaQuantidade[0] = leia.nextInt();
			numeroAtualSomaQuantidade[2]++;
			
			if(numeroAtualSomaQuantidade[0] > 0) {
				numeroAtualSomaQuantidade[1] += numeroAtualSomaQuantidade[0];
			}
		}while(numeroAtualSomaQuantidade[0] != 0);
		
		mediaMultiplos3 = numeroAtualSomaQuantidade[1]/numeroAtualSomaQuantidade[2];
		System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", mediaMultiplos3);
		
		leia.close();
	}

}
