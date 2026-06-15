package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio1_ABC {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int A=0, B=0, C=0;
		
		System.out.println("Digite o valor de A (inteiro):");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B (inteiro):");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C (inteiro):");
		C = leia.nextInt();
		
		if((A+B)>C) {
			System.out.printf("%d + %d = %d > %d", A, B, A+B, C);
			System.out.println("\nA soma de A + B é maior do que C");
		}else if((A+B)<C) {
			System.out.printf("%d + %d = %d < %d", A, B, A+B, C);
			System.out.println("\nA soma de A + B é menor do que C");
		}else {
			System.out.printf("%d + %d = %d = %d", A, B, A+B, C);
			System.out.println("\nA soma de A + B é igual a C");
		}
		leia.close();
	}
}
