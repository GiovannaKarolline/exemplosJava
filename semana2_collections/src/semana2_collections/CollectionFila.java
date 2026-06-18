package semana2_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionFila {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Débora");
		fila.add("Miguel");
		fila.add("Isabela");
		fila.add("Eduardo");
		fila.add("Julia");
		fila.add("Karol");
		System.out.println("Digite o nome do próximo participante:");
		fila.add(leia.next());
		
		for(var participante : fila) {
			System.out.println(participante);
		}
		
		fila.remove();
		System.out.printf("\nTopo da lista: %s\n",fila.peek());
		System.out.printf("\nTem a Karol?: %b\n",fila.contains("Karol"));
		
		for(var participante : fila) {
			System.out.println(participante);
		}
	}

}
