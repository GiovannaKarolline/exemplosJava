package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaWhile {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0, contador = 1;
		
		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt();
		
		while(contador < 11) {
			System.out.printf("\n%d x %d = %d", numero, contador, numero*contador);
			contador++;
		}
		
		leia.close();

	}

}
