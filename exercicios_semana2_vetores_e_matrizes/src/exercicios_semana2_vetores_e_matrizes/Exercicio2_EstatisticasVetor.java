package exercicios_semana2_vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio2_EstatisticasVetor {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int[] dezInteiros = new int[10];
		int[] elementosIndicesImpares = new int[5];
		int[] elementosParesEIndice = new int[11];
		int soma = 0;
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
		
		for(int item : elementosIndicesImpares) {
			for(int j = 1; j < dezInteiros.length; j+=2) {
				item = dezInteiros[j];
				System.out.printf("\n%d ", item);
			}
		}
		
		
		media = soma/dezInteiros.length;
		
		System.out.println("\nElementos nos índices ímpares:\n");
		for(int item : elementosIndicesImpares) {
			System.out.printf("%d ", item);
		}
		
		System.out.printf("\nCrie um vetor e veja algumas estatísticas sobre ele");
		System.out.printf("\nCrie um vetor e veja algumas estatísticas sobre ele");
		

	}

}
