package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeSwitchCase {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int faixaEtaria;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Selecione sua faixa etária:\nDigite 1 para 0 a 10 anos\nDigite 2 para 11 a 29 anos\nDigite 3 para 30 a 45 anos\nDigite 4 para 46 a 59\nDigite 5 para 60 a 65 anos\nDigite 6 para acima de 65 anos\n");
		faixaEtaria = leia.nextInt();
		
		switch(faixaEtaria) {
			case 1:
				System.out.println("A Mensalidade do Plano é R$100,00");
				break;
			case 2:
				System.out.println("A Mensalidade do Plano é R$200,00");
				break;
			case 3:
				System.out.println("A Mensalidade do Plano é R$300,00");
				break;
			case 4:
				System.out.println("A Mensalidade do Plano é R$500,00");
				break;
			case 5:
				System.out.println("A Mensalidade do Plano é R$600,00");
				break;
			case 6:
				System.out.println("A Mensalidade do Plano é R$1000,00");
				break;
			default:
				System.out.println("Faixa inválida.");
				break;
		}
		
		leia.close();
	}

}
