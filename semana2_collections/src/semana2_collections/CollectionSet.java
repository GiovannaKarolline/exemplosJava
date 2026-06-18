package semana2_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		Set<String> frutas = new HashSet<String>();
		
		ArrayList<String> listaFrutas = new ArrayList(Arrays.asList("Banana", "Uva"));
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maçã");
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.addAll(listaFrutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
		System.out.printf("\nA fruta Laranja está presente? %b\n", frutas.contains("Laranja"));
		
		frutas.remove("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
	}
}
