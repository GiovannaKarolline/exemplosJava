package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade > 0) {
			if(idade < 11) {
				System.out.println("A Mensalidade do Plano é R$100,00");
			}else if(idade < 30) {
				System.out.println("A Mensalidade do Plano é R$200,00");
			}else if(idade < 46) {
				System.out.println("A Mensalidade do Plano é R$300,00");
			}else if(idade < 60) {
				System.out.println("A Mensalidade do Plano é R$500,00");
			}else if(idade < 66) {
				System.out.println("A Mensalidade do Plano é R$600,00");
			}else{
				System.out.println("A Mensalidade do Plano é R$1000,00");
			}
		}
		leia.close();
	}

}
