package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio_CalculadoraSwitch {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float[] numeros = new float[2];
		int operacao = 0;
		
		System.out.print("Digite o 1˚ número: ");
		numeros[0] = leia.nextFloat();
		
		System.out.print("\nDigite o 2˚ número: ");
		numeros[1] = leia.nextFloat();
		
		System.out.println("Operações:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
		System.out.println("Digite o número da operação escolhida:");
		operacao = leia.nextInt();
		
		if(operacao < 1 || operacao > 4) {
			System.out.println("Operação inválida!");
		}
		
		switch(operacao) {
		case 1:
			System.out.printf("\n%.1f + %.1f = %.1f",numeros[0],numeros[1],numeros[0] + numeros[1]);
		case 2:
			System.out.printf("\n%.1f - %.1f = %.1f",numeros[0],numeros[1],numeros[0] - numeros[1]);
		case 3:
			System.out.printf("\n%.1f x %.1f = %.1f",numeros[0],numeros[1],numeros[0] * numeros[1]);
		case 4:
			if(numeros[1] != 0.0) {
				System.out.printf("\n%.1f ÷ %.1f = %.1f",numeros[0],numeros[1],numeros[0] / numeros[1]);
			}
		default:
			break;
		}
	}

}
