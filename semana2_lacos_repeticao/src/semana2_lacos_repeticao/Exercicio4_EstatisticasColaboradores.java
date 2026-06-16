package semana2_lacos_repeticao;

import java.util.Scanner;

public class Exercicio4_EstatisticasColaboradores {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] caracteristicas = new int[3];
		char adicionarNovoColaborador = 'S';
		int devsBackend = 0;
		int mulheresFrontend = 0;
		int homensMobileMais40 = 0;
		int naoBinariosFullStackMenos30 = 0;
		int totalColaboradores = 0;
		int somaIdades = 0;
		float mediaIdades = 0;
		
		while(adicionarNovoColaborador == 'S') {
			do {
				System.out.println("\n˜˜˜˜˜˜˜˜˜˜Pesquisa sobre colaboradores da área de desenvolvimento˜˜˜˜˜˜˜˜˜˜\n");
				System.out.println("Digite a idade do colaborador:");
				caracteristicas[0] = leia.nextInt();
			}while(caracteristicas[0] < 0 || caracteristicas[0] > 110);
			
			somaIdades += caracteristicas[0];
			totalColaboradores++;
			
			do {
				System.out.println("\nSelecione a identidade de gênero do colaborador: ");
				System.out.println("1 - Mulher Cis");
				System.out.println("2 - Homem Cis");
				System.out.println("3 - Não Binário");
				System.out.println("4 - Mulher Trans");
				System.out.println("5 - Homem Trans");
				System.out.println("6 - Outros");
				caracteristicas[1] = leia.nextInt();
			}while(caracteristicas[1] < 1 || caracteristicas[1]  > 6);
			
			do {
				System.out.println("Selecione o setor de desenvolvimento do colaborador: ");
				System.out.println("1 - Backend");
				System.out.println("2 - Frontend");
				System.out.println("3 - Mobile");
				System.out.println("4 - FullStack");
				caracteristicas[2] = leia.nextInt();
			}while(caracteristicas[2] < 1 || caracteristicas[2]  > 4);
			
			if(caracteristicas[2] == 1) {
				devsBackend++;
			}
			
			if((caracteristicas[1] == 1 || caracteristicas[1] == 4) && caracteristicas[2] == 2) {
				mulheresFrontend++;
			}
			
			if(caracteristicas[0] > 40 && (caracteristicas[1] == 2 || caracteristicas[1] == 5) && caracteristicas[2] == 3) {
				homensMobileMais40++;
			}
			
			if(caracteristicas[0] < 30 && caracteristicas[1] == 3 && caracteristicas[2] == 4) {
				naoBinariosFullStackMenos30++;
			}
			
			do {
				System.out.println("Deseja registrar outro colaborador? (S/N)");
				adicionarNovoColaborador = leia.next().toUpperCase().charAt(0);
			}while(!(adicionarNovoColaborador == 'S') && !(adicionarNovoColaborador == 'N'));
		}
		
		System.out.println("\nResultados da pesquisa:");
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d", devsBackend);
		System.out.printf("\nTotal de mulheres cis e trans desenvolvedoras Frontend: %d", mulheresFrontend);
		System.out.printf("\nTotal de homens cis e trans desenvolvedores Mobile maiores de 40 anos: %d", homensMobileMais40);
		System.out.printf("\nTotal de pessoas náo binárias desenvolvedoras FullStack menores de 30 anos: %d", naoBinariosFullStackMenos30);
		System.out.printf("\nNúmero total de pessoas que responderam à pesquisa: %d", totalColaboradores);
		
		if(totalColaboradores > 0) {
			mediaIdades = somaIdades/totalColaboradores;
			System.out.printf("\nMédia de idade das pessoas que responderam à pesquisa: %.2f", mediaIdades);
		}
		
		leia.close();
	}

}
