package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio6_reajusteSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigoCargo = 0;
		float salario = 0.0f;
		String nomeColaborador = "";
		
		System.out.println("Código do cargo, nome do cargo e percentual de reajuste:");
		System.out.println("1 - Gerente\n");
		System.out.println("2 - Vendedor\n");
		System.out.println("3 - Supervisor\n");
		System.out.println("4 - Motorista\n");
		System.out.println("5 - Estoquista\n");
		System.out.println("6 - Técnico de TI\n");
		System.out.println("Digite o nome do colaborador: ");
		nomeColaborador = leia.next();
		System.out.println("Digite o código do cargo: ");
		codigoCargo = leia.nextInt();
		System.out.println("Digite o valor do salário atual: ");
		salario = leia.nextFloat();
		
		switch (codigoCargo) {
			case 1:
				System.out.printf("\nNome do colaborador: %s\nCargo: Gerente\nSalário: R$ %.2f",nomeColaborador,salario+(salario*0.10));
				break;
			case 2:
				System.out.printf("\nNome do colaborador: %s\nCargo: Vendedor\nSalário: R$ %.2f",nomeColaborador,salario+(salario*0.07));
				break;
			case 3:
				System.out.printf("\nNome do colaborador: %s\nCargo: Supervisor\nSalário: R$ %.2f",nomeColaborador,salario+(salario*0.09));
				break;
			case 4:
				System.out.printf("\nNome do colaborador: %s\nCargo: Motorista\nSalário: R$ %.2f",nomeColaborador,salario+(salario*0.06));
				break;
			case 5:
				System.out.printf("\nNome do colaborador: %s\nCargo: Estoquista\nSalário: R$ %.2f",nomeColaborador,salario+(salario*0.05));
				break;
			case 6:
				System.out.printf("\nNome do colaborador: %s\nCargo: Técnico de TI\nSalário: R$ %.2f",nomeColaborador,salario+(salario*0.08));
				break;
			default:
				break;
		}
		
		leia.close();

	}

}
