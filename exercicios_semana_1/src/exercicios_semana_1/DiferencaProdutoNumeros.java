package exercicios_semana_1;

import java.util.Scanner;

public class DiferencaProdutoNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float numero1, numero2, numero3, numero4, diferencaProdutos;
		
		System.out.print("Diferença entre o produto dos dois primeiros números e dos dois últimos");
		System.out.print("\nDigite o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.print("\nDigite o segundo número: ");
		numero2 = leia.nextFloat();
		System.out.print("\nDigite o terceiro número: ");
		numero3 = leia.nextFloat();
		System.out.print("\nDigite o quarto número: ");
		numero4 = leia.nextFloat();
		
		diferencaProdutos = numero1*numero2 - numero3*numero4;
		
		System.out.printf("A diferença é de %.1f.", diferencaProdutos);
		
	}

}
