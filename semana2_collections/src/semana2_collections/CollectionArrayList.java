package semana2_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.printf("\nO objeto está presente no índice 1: %d",numeros.get(1));
		
		System.out.printf("\nO índice do objeto de valor 1: %d",numeros.indexOf(1));
		
		numeros.set(1, 28);
		
		System.out.printf("\nO objeto está presente no índice 1: %d\n",numeros.get(1));
		
		numeros.remove(4);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		numeros.sort(null);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		numeros.sort(Comparator.reverseOrder());
		
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
	}

}
