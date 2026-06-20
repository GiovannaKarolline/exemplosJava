package exercicios_semana2_collections;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4_BuscaSet {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		Set<Integer> dezInteiros = new HashSet<Integer>(List.of(2,5,1,3,4,9,7,8,10,6));
		Integer numeroBuscado = 0;
		
		System.out.println("Busca de número inteiro em Set");
		System.out.println("\nDigite o número a ser buscado: ");
		numeroBuscado = leia.nextInt();
		
		if(dezInteiros.contains(numeroBuscado)){
			System.out.printf("\nO número %d foi encontrado!", numeroBuscado);
		}else {
			System.out.printf("\nO número %d não foi encontrado!", numeroBuscado);
		}
		
		leia.close();
	}

}