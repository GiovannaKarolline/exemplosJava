package exercicios_semana2_vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio2_EstatisticasVetor {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] dezInteiros = new int[10];
		int[] elementosIndicesImpares = new int[5];
		int[] elementosParesEIndice = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0};
		int soma = 0;
		int contador = 0;
		float media = 0.0f;
		
		System.out.println("Crie um vetor e veja algumas estatísticas sobre ele");
		
		for(int i = 0; i < dezInteiros.length; i++) {
			System.out.println("Digite um número para o vetor: ");
			dezInteiros[i] = leia.nextInt();
			
			if(dezInteiros[i] % 2 == 0) {
				elementosParesEIndice[elementosParesEIndice[10]] = dezInteiros[i];
				elementosParesEIndice[10]++;
			}
			soma += dezInteiros[i];
		}
		
		for(int i = 0; i < dezInteiros.length; i++) {
			if(!(i % 2 == 0)) {
				elementosIndicesImpares[contador] = dezInteiros[i];
				contador++;
			}
		}
		
		media = soma/dezInteiros.length;
		
		System.out.println("\nElementos nos índices ímpares:");
		for(int item : elementosIndicesImpares) {
			System.out.printf("%d ", item);
		}
		
		System.out.printf("\nElementos pares do vetor:\n");
		for(int i = 0; i < elementosParesEIndice.length - 1; i++) {
			if(elementosParesEIndice[i] != -1) {
				System.out.printf("%d ", elementosParesEIndice[i]);
			}
		}
		System.out.printf("\nSoma:\n%d", soma);
		System.out.printf("\nMédia:\n%.1f", media);
		
		leia.close();
	}
}
