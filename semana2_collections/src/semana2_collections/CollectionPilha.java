package semana2_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Azul");
		pilha.push("Amarelo");
		pilha.push("Vermelho");
		
		for(var cor : pilha) {
			System.out.printf("\n",cor);
		}
		
		pilha.pop();
		
		for(var cor : pilha) {
			System.out.printf("\n",cor);
		}
		
	}

}
