package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio2_ParImpar_PositivoNegativo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		
		System.out.println("Digite um número inteiro:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			if(numero > 0) {
				System.out.printf("O número %d é par e positivo!", numero);
			}else if(numero == 0){
				System.out.printf("O número %d é par e neutro!", numero);
			}else {
				System.out.printf("O número %d é par e negativo!", numero);
			}
		}else {
			if(numero > 0) {
				System.out.printf("O número %d é ímpar e positivo!", numero);
			}else {
				System.out.printf("O número %d é ímpar e negativo!", numero);
			}
		}
		leia.close();
	}
}
