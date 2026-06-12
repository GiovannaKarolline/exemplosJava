package aula_01_variaveis;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 5;
		float numero3, numero4;
		float preenchida = 1.5f;
		String nome;
		char sexo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Variável numero1 = "+ numero1);
		System.out.println("Variável numero2 = "+ numero2);
		System.out.printf("%d + %d = %d\n", numero1, numero2, numero1+numero2);
		System.out.println("Digite o seu nome a seguir:");
		nome = leia.next();
		System.out.printf("O seu nome é %s.\n", nome);
		System.out.println("Digite o primeiro valor real:");
		numero3 = leia.nextFloat();
		System.out.println("Digite o segundo valor real:");
		numero4 = leia.nextFloat();
		System.out.printf("%.2f * %.2f = %.2f", numero3, numero4, numero3*numero4);
		System.out.println("\nDigite o sexo do bebê:");
		sexo = leia.next().charAt(0);
		sexo = Character.toLowerCase(sexo);
		switch (sexo) {
			case 'f':
				System.out.println("Seu bebê é do sexo feminino!");
				break;
			case 'm':
				System.out.println("Seu bebê é do sexo masculino!");
				break;
			default:
				System.out.println("Não sabemos o sexo do seu bebê.");
				break;
		}
	}
}