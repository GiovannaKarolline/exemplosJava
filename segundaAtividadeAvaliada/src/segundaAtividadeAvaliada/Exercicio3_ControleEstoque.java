package segundaAtividadeAvaliada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3_ControleEstoque {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static class Produto{
		String nomeProduto = "";
		int quantidade = 0;
	}
	
	public static void adicionarProduto(List<Produto> alunos) {
		Produto novoProduto = new Produto();
		
		System.out.println("\nDigite o nome do produto:");
		leia.skip("\n");
		novoProduto.nomeProduto = leia.nextLine();
		
		System.out.println("\nDigite a quantidade do produto:");
		novoProduto.quantidade = leia.nextInt();
		
		alunos.add(novoProduto);
		
		System.out.println("\nProduto registrado!");
	}
	
	public static void listarProdutos(List<Produto> produtos) {
		if(produtos.size() > 0) {
			System.out.println("\nProdutos:\n");
			for(Produto produto : produtos) {
				System.out.printf("\nProduto: %-15s | Quantidade: %d\n", produto.nomeProduto, produto.quantidade);
			}
		}else {
			System.out.println("\nNenhum produto registrado!");
		}
		
	}
	
        public static void atualizarProduto2(List<Produto> produtos, Scanner leia) {
                int resposta = 0;
                Produto produtoAtualizado;
                for(Produto produto: produtos) {
                        System.out.printf("Código do produto %d | Nome do produto: %s | Quantidade do produto %d\n" ,resposta++,produto.nomeProduto,produto.quantidade);
                }
                System.out.println("Me informe o código do produto que deseja alterar");
                resposta = leia.nextInt();
                if(resposta > produtos.size() || resposta < 0) {
                        System.out.println("Código não existe!");
                        return;
                }
                produtoAtualizado = produtos.get(resposta); // pega pelo indice
                System.out.println("Digite a nova quantidade do produto");
                produtoAtualizado.quantidade = leia.nextInt();
                leia.nextLine();
                listarProdutos(produtos);
                System.out.println("Pressione enter para continuar");
                leia.nextLine();

        }
	
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		boolean novoRegistro = true;
		
		while(novoRegistro) {
			System.out.println("\n˜˜˜˜˜˜˜˜˜Controle de estoque˜˜˜˜˜˜˜˜˜");
			System.out.println("1 - Registrar novo produto");
			System.out.println("2 - Atualizar quantidade de um produto");
			System.out.println("3 - Listar produtos registrados");
			System.out.println("Digite qualquer outro número para sair.\n");
			
			switch(leia.nextInt()) {
				case 1:
					adicionarProduto(produtos);
					break;
				case 2:
					atualizarProduto(produtos);
					break;
				case 3:
					listarProdutos(produtos);
					break;
				default:
					novoRegistro = false;
					System.out.println("\nFim do programa!");
					break;
			}
		}
	}
}

