package exercicios_semana2_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2_BuscaArrayList {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> dezInteiros = new ArrayList<>(List.of(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		Integer numeroBuscado = 0;
		boolean tentarNovamente = true;
		
		while(tentarNovamente) {
			System.out.println("\nBusca em Array de Inteiros");
			System.out.println("\nDigite um número inteiro:");
			
			numeroBuscado = leia.nextInt();
			
			if(dezInteiros.contains(numeroBuscado)) {
				System.out.printf("\nO número %d está localizado na posição: %d\n", numeroBuscado, dezInteiros.indexOf(numeroBuscado));
			}else {
				System.out.printf("\nO número %d não foi encontrado!\n", numeroBuscado);
			}
			

			System.out.println("\nDigite 0 para sair ou outro número para tentar outra vez:");
			numeroBuscado = leia.nextInt();
			if(numeroBuscado == 0) {
				tentarNovamente = false;
				System.out.println("Fim do programa!");
			}
		}
		
		leia.close();
	}

}
