package exercicios_semana2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3_SetDezInteiros {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		Set<Integer> dezInteiros = new HashSet<Integer>();
		
		System.out.println("Set de até 10 números inteiros:");
		for(int i = 0; i < 10; i++) {
			System.out.printf("\nDigite o %dº número: ", i+1);
			dezInteiros.add(leia.nextInt());
		}
		
		ArrayList<Integer> listaDezInteiros = new ArrayList<>(dezInteiros);
		
		Collections.sort(listaDezInteiros);
		
		System.out.println("\nListar dados do Set:");
		
		for(Integer numero : listaDezInteiros) {
			System.out.printf("%d\n",numero);
		}
		
		leia.close();
	}

}
