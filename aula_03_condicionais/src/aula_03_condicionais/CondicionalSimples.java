package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int numero = leia.nextInt();
		
		if(numero>10 && numero < 100) {
			System.out.println("O número é maior que dez e menor que 100!");
		}
		
		System.out.println("Fim ;)");
		leia.close();
	}

}
