package exercicios_semana2_vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio3_DiagonaisMatriz {
    public static Scanner leia = new Scanner(System.in);
  public static void main(String args[]) {
    int[][] matriz9Inteiros = new int[3][3];
    int[] diagonalPrincipal = new int[3];
    int[] diagonalSecundaria = new int[3];
    int[] somaDiagonais = new int[2];
    
    for(int i = 0; i < matriz9Inteiros.length; i++){
        for(int j = 0; j < matriz9Inteiros[i].length; j++){
            System.out.printf("\nDigite um valor para a %d° linha e %d° coluna da matriz:\n", i+1,j+1);
            matriz9Inteiros[i][j] = leia.nextInt();
        }
    }
    
    for(int i = 0; i < diagonalPrincipal.length; i++){
    	diagonalPrincipal[i] = matriz9Inteiros[i][i];
    	somaDiagonais[0] += diagonalPrincipal[i];
    }
    
    int contador = 0;
    
    for(int i = diagonalSecundaria.length - 1; i > -1; i--){
    	diagonalSecundaria[i] = matriz9Inteiros[i][contador];
    	somaDiagonais[1] += diagonalSecundaria[i];
    	contador++;
    }
    
    System.out.println("\nElementos da diagonal principal:");
    
    for(int i = 0; i < diagonalPrincipal.length; i++) {
    	System.out.printf("%d ", diagonalPrincipal[i]);
    }
    
	System.out.println("\nElementos da diagonal secundária:");
	    
	for(int i = 0; i < diagonalSecundaria.length; i++) {
	    System.out.printf("%d ", diagonalSecundaria[i]);
	}
    
    System.out.printf("\nSoma dos elementos da diagonal principal:\n%d", somaDiagonais[0]);
    System.out.printf("\nSoma dos elementos da diagonal secundária:\n%d", somaDiagonais[1]);
    
    leia.close();
  }
}