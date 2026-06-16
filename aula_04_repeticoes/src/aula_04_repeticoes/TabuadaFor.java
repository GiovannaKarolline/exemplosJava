package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaFor {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = 0;
		
		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt();
		
		for(int i = 1; i < 11; i++) {
			System.out.printf("%d x %d = %d\n", numero, i, numero*i);
		}
		
		leia.close();

	}

}
