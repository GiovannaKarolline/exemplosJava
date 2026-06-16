package semana2_lacos_repeticao;

import java.util.Scanner;

public class Exercicio2_DezNumerosParImpar {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] dezNumeros = new int[10];
		int pares = 0, impares = 0;
		
		System.out.println("Contagem de números pares e ímpares entre dez números");
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.printf("\nDigite o %d˚ número (inteiro): ",contador+1);
			dezNumeros[contador] = leia.nextInt();
			
			if(dezNumeros[contador] % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.printf("\nTotal de números pares: %d",pares);
		System.out.printf("\nTotal de números ímpares: %d",impares);
		
		leia.close();
	}

}
