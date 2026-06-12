package exercicios_semana_1;

import java.util.Scanner;

public class MediaQuatroNotas {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Média de quatro notas");
		
		System.out.print("\nDigite o valor da primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.print("\nDigite o valor da segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.print("\nDigite o valor da terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.print("\nDigite o valor da quarta nota: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nA média final é de %.1f.", mediaFinal);
	}
}