package aula_02_operadores;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int contador = 1000;
		System.out.printf("Valor inicial do contador: %d", contador);
		
		System.out.printf("\nValor pré incrementado do contador: %d", ++contador);
		
		System.out.printf("\nValor pós incrementado do contador: %d", contador++);
		
		System.out.printf("\nValor final do contador: %d", contador);
	}
}
