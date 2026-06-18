package exercicios_semana2_pilha_e_fila;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio2_PilhaLivros {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean adicionarLivro = true;
		
		Deque<String> pilhaLivros = new LinkedList<>();
		
		do {
			System.out.println("\n˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜Pilha de livros˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜\n");
			System.out.println("1 - Adicionar livro à pilha\n2 - Listar todos os livros\n3 - Retirar livro da pilha\n0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			switch (leia.nextInt()) {
				case 1:
					System.out.println("\nDigite o título do livro:");
					leia.skip("\n");
					pilhaLivros.push(leia.nextLine());
					System.out.println("\nPilha:\n");
					for(String livro : pilhaLivros) {
							System.out.println(livro);
						}
					System.out.println("\nLivro adicionado!\n");
					break;
				case 2:
					if(pilhaLivros.isEmpty()){
						System.out.println("\nA pilha está vazia!");
					}else {
						System.out.println("\nLista de livros na pilha:\n");
						for(String livro : pilhaLivros) {
							System.out.println(livro);
						}	
					}
						break;
				case 3:
					if(pilhaLivros.isEmpty()){
						System.out.println("\nA pilha está vazia!");
					}else {
						pilhaLivros.remove();
						
						System.out.println("\nO livro foi retirado da pilha!");
						
						if(pilhaLivros.isEmpty()){
							System.out.println("\nA pilha está vazia!");
						}else {
							System.out.println("\nPilha atual:\n");
							
							for(String livro : pilhaLivros) {
								System.out.println(livro);
							}
						}
					}
					break;
				case 0:
					adicionarLivro = false;
					System.out.println("Programa finalizado!");
					break;
				default:
					break;
			}
			
		}while(adicionarLivro);
		
		leia.close();
	}

}
