package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int idade = 0, esporte = 0, totalRespostas = 0, somaIdades = 0, futebol=0, voleiM18 = 0;
		float mediaIdades = 0.0f;
		char continua = 'S';
		
		while(continua == 'S') {
			System.out.println("\n˜˜˜˜˜˜˜˜˜˜Pesquisa sobre esportes favoritos˜˜˜˜˜˜˜˜˜˜\n");
			System.out.println("Digite a sua idade:");
			idade = leia.nextInt();
			
			do {
				System.out.println("Escolha o seu esporte favorito: ");
				System.out.println("1 - Futebol");
				System.out.println("2 - Voleibol");
				System.out.println("3 - Basquetebol");
				System.out.println("4 - Outros");
				esporte = leia.nextInt();
			}while(esporte < 1 || esporte  > 4);
			
			if(esporte == 1) {
				futebol++;
			}
			
			if(idade > 18 && esporte ==2) {
				voleiM18++;
			}
			
			do {
				System.out.println("Deseja continuar?");
				continua = leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N'));
			
			totalRespostas++;
			somaIdades += idade;
		}
		
		mediaIdades = somaIdades/totalRespostas; 
		
		System.out.printf("\nTotal de pessoas que gostam de futebol: %d\n", futebol);
		System.out.printf("Total de pessoas maiores de 18 anos e que gostam de voleibol: %d\n", voleiM18);
		System.out.printf("\nMédia das idades: %.2f\n", mediaIdades);
		
		leia.close();
	}

}
