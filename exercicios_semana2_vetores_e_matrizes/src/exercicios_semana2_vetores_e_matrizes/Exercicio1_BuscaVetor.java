package exercicios_semana2_vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio1_BuscaVetor {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] dezInteiros = new int[10];
		int[] inteiroEIndice = {0, -1};
		
		System.out.println("Busca de número inteiro em vetor");
		
		for(int i = 0; i < dezInteiros.length; i++) {
			System.out.println("Digite um número para o vetor: ");
			dezInteiros[i] = leia.nextInt();
		}
		
		System.out.println("\nDigite o número que você deseja encontrar:");
		inteiroEIndice[0] = leia.nextInt();
		
		for(int i = 0; i < dezInteiros.length; i++) {
			if(dezInteiros[i] == inteiroEIndice[0]) {
				inteiroEIndice[1] = i;
			}
		}
		
		if(inteiroEIndice[1] > -1) {
			System.out.printf("\nO número %d foi encontrado no índice: %d", inteiroEIndice[0], inteiroEIndice[1]);
		}else {
			System.out.printf("\nO número %d não foi encontrado!", inteiroEIndice[0]);
		}
		
		leia.close();
	}

}