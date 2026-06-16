package semana2_lacos_repeticao;

import java.util.Scanner;

public class Exercicio1_MultiplosTresCinco {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] intervalo = new int[2];
		System.out.println("Digite um intervalo e saiba os múltiplos de 3 e 5 dentro dele");
		
		System.out.println("Digite o primeiro número do intervalo (inteiro):");
		intervalo[0] = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo (inteiro):");
		intervalo[1] = leia.nextInt();
		
		if(intervalo[1] < intervalo[0]) {
			System.out.println("Intervalo inválido.");
			return;
		}
		
		for(int contador = intervalo[0]; contador < intervalo[1]+1; contador++) {
			if(contador % 3 == 0 && contador % 5 == 0) {
				System.out.printf("\n%d é múltiplo de 3 e 5.",contador);
			}
		}
		
		leia.close();
		
	}

}
