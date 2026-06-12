package aula_02_operadores;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		double numero1, numero2;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n~~~ Calculadora Básica ~~~");
		
		System.out.print("\nDigite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("\nDigite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
		System.out.printf("\n%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
		System.out.printf("\n%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
		System.out.printf("\n%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
		System.out.printf("\n%.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("\nraiz quadrada de %.2f = %.2f", numero1, Math.sqrt(numero1));
		System.out.printf("\nraiz quadrada de %.2f = %.2f", numero2, Math.sqrt(numero2));
		
		leia.close();	
		
	}

}
