package semana2_lacos_repeticao;

import java.util.Scanner;

public class Exercicio5_SomaNumerosPositivos {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numeroAtualESoma = new int[2];
		
		System.out.println("Soma de números positivos\n(digite 0 para finalizar a conta)");
		
		do {
			System.out.println("\nDigite um número inteiro:");
			numeroAtualESoma[0] = leia.nextInt();
			if(numeroAtualESoma[0] > 0) {
				numeroAtualESoma[1] += numeroAtualESoma[0];
			}
		}while(numeroAtualESoma[0] != 0);
		
		System.out.printf("\nA soma dos números positivos é: %d", numeroAtualESoma[1]);
		
		leia.close();
	}
}