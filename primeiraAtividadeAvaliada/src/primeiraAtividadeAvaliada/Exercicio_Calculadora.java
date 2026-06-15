package primeiraAtividadeAvaliada;

//importei as bibliotecas necessárias para poder usar um dicionário chave-valor.
import java.util.HashMap;
import java.util.Map;

//biblioteca do scanner, objeto usado para receber informacões do usuário durante a execução do programa.
import java.util.Scanner;

public class Exercicio_Calculadora {
	
	/* criei o scanner de maneira global porque, caso essa funcão fosse usada em meio a um sistema, 
	 * se ela tivesse a criação de um scanner dentro dela e já existisse um scanner dentro da main(), 
	 * poderia ocorrer algum problema.
	*/
	public static Scanner leia = new Scanner(System.in);
	
	/* função que recebe dois números e uma escolha de operação (float, float, int) e retorna o 
	 *  resultado da operação matemática em ponto flutuante.
	 */
	public static float calculadoraDoisElementos(float numero1, float numero2, int operacao) {
		switch(operacao) {
			case 1:
				return numero1 + numero2;
			case 2:
				return numero1 - numero2;
			case 3:
				return numero1 * numero2;
			case 4:
				if(numero2 != 0.0) {
					return numero1/numero2;
				}
			default:
				System.out.println("Operação inválida.");
				break;
		}
		System.out.println("Cálculo falhou.");
		return 0.0f;
	}
	
	public static void main(String[] args) {
		float[] numeros = new float[2];
		int operacao = 0;
		boolean calcular = true;
		
		//criação do dicionário chave-valor
		Map<Integer, String> dicionarioOperacoes = new HashMap<>();
		
		//preenchendo o dicionário para relacionar a opção numérica com o nome da operação e usar em saídas.
		dicionarioOperacoes.put(1,"Soma");
		dicionarioOperacoes.put(2,"Subtração");
		dicionarioOperacoes.put(3,"Multiplicação");
		dicionarioOperacoes.put(4,"Divisão");
		
		/* nesse loop while o usuário realiza uma operação matemática e, ao fim dela, escolhe se quer realizar outra 
		* operação ou não.
		*/
		while(calcular) {
		
			System.out.println("\nCalculadora de dois elementos");
			
			System.out.println("Digite o primeiro número:");
			numeros[0] = leia.nextFloat();
			
			System.out.println("Digite o segundo número:");
			numeros[1] = leia.nextFloat();
			
			System.out.println("Operações:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");
			
			System.out.println("Digite o número da operação escolhida:");
			operacao = leia.nextInt();
			
			
			System.out.printf("Operação: %s\nResultado: %.1f", dicionarioOperacoes.get(operacao),calculadoraDoisElementos(numeros[0],numeros[1],operacao));
			
			System.out.println("\n\nDeseja calcular novamente? (responda com true ou false)");
			calcular = leia.nextBoolean();
			
		}
		
		//fechamento do scanner para limpar o buffer e evitar erros
		leia.close();
	}

}
