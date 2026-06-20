package segundaAtividadeAvaliada;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1_SomaMediaColecao {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void somaMediaMaior(ArrayList<Integer> lista) {
		int[] somaMaior = new int[2];
		float media = 0.0f;
		
		Integer maior = lista.get(0);
		
		for(Integer numero : lista) {
			somaMaior[0] += numero;
			
			if(maior < numero) {
				maior = numero;
			}
		}
		
		media = somaMaior[0]/lista.size();
		
		somaMaior[1] = maior;
		
		System.out.printf("\nSoma: %d", somaMaior[0]);
		System.out.printf("\nMédia: %.1f", media);
		System.out.printf("\nMaior valor: %d", somaMaior[1]);
		
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listaInteiros = new ArrayList<>();
		boolean continuar = true;
		
		while(continuar) {
		
			System.out.println("\n˜˜˜˜˜˜˜˜˜˜˜˜˜˜Informações sobre a lista de 5 inteiros˜˜˜˜˜˜˜˜˜˜˜˜˜\n");
			
			for(int i = 0; i < 5; i++) {
				System.out.println("Digite um valor inteiro para a lista:");
				listaInteiros.add(leia.nextInt());
			}
			
			System.out.println("\nInformações:");
			somaMediaMaior(listaInteiros);
			
			System.out.println("\n\nDigite 1 para sair ou outra tecla para continuar:");
			switch(leia.next()){
				case "1":
					System.out.println("\nFim do programa!");
					continuar = false;
				default:
					break;
			}
		
		}
		leia.close();
	}
}
