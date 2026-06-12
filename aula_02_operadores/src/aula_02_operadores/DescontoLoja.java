package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {
	public static void main(String[] args) {
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\n Digite o valor total da compra: R$ ");
		double valorCompra = leia.nextDouble();
		
		System.out.print("O Cliente é Prime? ");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
		
		System.out.print("\n--- Status do Pedido ---");
		System.out.printf("\n Valor da Compra: R$ %.2f", valorCompra);
		System.out.printf("\n Cliente Prime? %b", isPrime);
		System.out.printf("\n Frete Grátis? %b", ganhouFrete);
		
		
		leia.close();
	}
                                                                         
}
