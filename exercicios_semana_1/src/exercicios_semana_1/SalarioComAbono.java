package exercicios_semana_1;

import java.util.Scanner;

public class SalarioComAbono {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Salário com Abono");
		System.out.print("\nDigite o valor do salário: R$ ");
		salario = leia.nextFloat();
		System.out.print("\nDigite o valor do abono: R$ ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("\nO valor do novo salário é R$ %.2f.",novoSalario);
	}

}
