package exercicios_semana2_pilha_e_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exericicio1_Fila {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean adicionarCliente = true;
		
		Queue<String> filaClientes = new LinkedList<>();
		
		do {
			System.out.println("\n˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜Registro de fila de clientes˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜\n");
			System.out.println("1 - Adicionar cliente na fila\n2 - Listar todos os clientes\n3 - Retirar cliente da fila\n0 - Sair\n");
			System.out.println("Digite a opção desejada: ");
			switch (leia.nextInt()) {
				case 1:
					System.out.println("\nDigite o nome do cliente:");
					leia.skip("\n");
					filaClientes.add(leia.nextLine());
					System.out.println("\nFila:\n");
					for(String cliente : filaClientes) {
							System.out.println(cliente);
						}
					System.out.println("\nCliente adicionado!\n");
					break;
				case 2:
					if(filaClientes.isEmpty()){
						System.out.println("A fila está vazia!");
					}else {
						System.out.println("\nLista de clientes na fila:\n");
						for(String cliente : filaClientes) {
							System.out.println(cliente);
						}	
					}
						break;
				case 3:
					if(filaClientes.isEmpty()){
						System.out.println("A fila está vazia!");
					}else {
						filaClientes.remove();
						
						System.out.println("\nO cliente foi chamado!");
						
						if(filaClientes.isEmpty()){
							System.out.println("\nA fila está vazia!");
						}else {
							System.out.println("\nFila atual:\n");
							
							for(String cliente : filaClientes) {
								System.out.println(cliente);
							}
						}
					}
					break;
				case 0:
					adicionarCliente = false;
					System.out.println("Programa finalizado!");
					break;
				default:
					break;
			}
			
		}while(adicionarCliente);
		
		leia.close();
	}

}
