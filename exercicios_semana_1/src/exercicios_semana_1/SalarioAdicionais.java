package exercicios_semana_1;

import java.util.Scanner;

public class SalarioAdicionais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		System.out.print("Cálculo do salário líquido");
		System.out.print("\nDigite o valor do salário bruto: R$ ");
		salarioBruto = leia.nextFloat();
		System.out.print("\nDigite o valor do adicional noturno: R$ ");
		adicionalNoturno = leia.nextFloat();
		System.out.print("\nDigite a quantidade de horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.print("\nDigite o valor em descontos: R$ ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.printf("\nO salário líquido é de R$ %.2f.", salarioLiquido);
	}
}
