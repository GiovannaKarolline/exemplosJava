package aula_02_operadores;

public class OperadoresAtribuicao {
	public static void main(String[] args) {
		int numero1 = 4;
		int numero2 = 4;
		int numero3 = 4;
		int numero4 = 4;
		int numero5 = 4;
		
		System.out.printf("Atribuição com soma: %d", numero1 += 2);
		System.out.printf("\nAtribuição com subtração: %d", numero2 -= 2);
		System.out.printf("\nAtribuição com multiplicação: %d", numero3 *= 2);
		System.out.printf("\nAtribuição com divisão: %d", numero4 /= 2);
		System.out.printf("\nAtribuição com módulo: %d", numero5 %= 2);
	}
}
