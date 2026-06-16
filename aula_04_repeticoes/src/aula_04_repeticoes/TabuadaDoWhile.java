package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero = 0, contador = 90;
		
		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt();
		
		//bom para menus
		do {
			System.out.printf("\n%d x %d = %d", numero, contador, numero*contador);
			contador++;
		}while(contador < 11);
		
		leia.close();

	}
}