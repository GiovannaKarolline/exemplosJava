package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio5_valorTotalCompra {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigoProduto = 0, quantidade = 0;
		
		System.out.println("Código, nome do produto e preço:");
		System.out.println("1 - Cachorro quente - R$10,00\n");
		System.out.println("2 - X-Salada - R$15,00\n");
		System.out.println("3 - X-Bacon - R$18,00\n");
		System.out.println("4 - Bauru - R$12,00\n");
		System.out.println("5 - Refrigerante - R$8,00\n");
		System.out.println("6 - Suco de laranja - R$13,00\n");
		System.out.println("Digite o código do produto escolhido: ");
		codigoProduto = leia.nextInt();
		System.out.println("Digite a quantidade a ser comprada:");
		quantidade = leia.nextInt();
		
		switch (codigoProduto) {
			case 1:
				System.out.printf("Produto: Cachorro quente\nValor total: R$ %.2f",quantidade*10.0);
				break;
			case 2:
				System.out.printf("Produto: X-Salada\nValor total: R$ %.2f",quantidade*15.0);
				break;
			case 3:
				System.out.printf("Produto: X-Bacon\nValor total: R$ %.2f",quantidade*18.0);
				break;
			case 4:
				System.out.printf("Produto: Bauru\nValor total: R$ %.2f",quantidade*12.0);
				break;
			case 5:
				System.out.printf("Produto: Refrigerante\nValor total: R$ %.2f",quantidade*8.0);
				break;
			case 6:
				System.out.printf("Produto: Suco de laranja\nValor total: R$ %.2f",quantidade*13.0);
				break;
			default:
				System.out.printf("Opção inválida.");
				break;
		}
		
		leia.close();
	}

}
