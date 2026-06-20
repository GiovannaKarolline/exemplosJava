package segundaAtividadeAvaliada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3_ControleEstoque {

	public static Scanner leia = new Scanner(System.in);

	public static class Produto {
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
		if (produtos.size() > 0) {
			System.out.println("\nProdutos:");
			for (Produto produto : produtos) {
				System.out.printf("\nProduto: %-10s | Quantidade: %d\n", produto.nomeProduto, produto.quantidade);
			}
		} else {
			System.out.println("\nNenhum produto registrado!");
		}

	}

	public static void atualizarProduto(List<Produto> produtos) {
		int resposta = 0;
		Produto produtoAtualizado;
		
		for (Produto produto : produtos) {
			System.out.printf("\nCódigo do produto: %-8d | Nome do produto: %s | Quantidade: %d\n", resposta+1, produto.nomeProduto, produto.quantidade);
			resposta++;
		}
		
		if(produtos.size()>0) {
			System.out.println("\nDigite o código do produto que deseja alterar a quantidade:");
			resposta = leia.nextInt() - 1;
			
			if (resposta >= produtos.size() || resposta < 0) {
				System.out.println("\nEsse código não existe!");
				return;
			}
			
			produtoAtualizado = produtos.get(resposta);
			
			System.out.println("\nDigite a nova quantidade do produto:");
			produtoAtualizado.quantidade = leia.nextInt();
			leia.nextLine();
			
			listarProdutos(produtos);
			
			System.out.println("\nPressione enter para continuar\n");
			leia.nextLine();
		}else {
			System.out.println("\nNenhum produto registrado! Não há o que atualizar.");
		}
	}

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		boolean novoRegistro = true;

		while (novoRegistro) {
			System.out.println("\n˜˜˜˜˜˜˜˜˜Controle de estoque˜˜˜˜˜˜˜˜˜");
			System.out.println("1 - Registrar novo produto");
			System.out.println("2 - Atualizar quantidade de um produto");
			System.out.println("3 - Listar produtos registrados");
			System.out.println("Digite qualquer outro número para sair.\n");

			switch (leia.nextInt()) {
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
