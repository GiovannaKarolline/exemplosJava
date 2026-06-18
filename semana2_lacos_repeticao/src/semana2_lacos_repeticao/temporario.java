/*
Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
Todos os elementos da Diagonal Principal
Todos os elementos da Diagonal Secundária
A Soma de todos os elementos da Diagonal Principal
A Soma de todos os elementos da Diagonal Secundária
*/

package exercicios_semana2_vetores_e_matrizes;

import java.util.Scanner;

public class MyClass {
    public static Scanner leia = new Scanner(System.in);
  public static void main(String args[]) {
    int[][] matriz9Inteiros = new int[3][3];
    int[] diagonalPrincipal = new int[3];
    int[] diagonalSecundaria = new int[3];
    int[] soma = new 
    
    for(int i = 0; i < matriz9Inteiros.length; i++){
        System.out.printf("\nDigite um valor para a %d° linha da matriz:\n", i+1);
        matriz9Inteiros[i] = leia.nextInt();
        for(int j = 0; i < matriz9Inteiros[i].length; j++){
            System.out.printf("\nDigite um valor para a %d° coluna matriz:\n", j+1);
            matriz9Inteiros[i][j] = leia.nextInt();
        }
    }
    
    for(int i = 0; i < diagonalPrincipal.length; i++){
        diagonalPrincipal[i] = matriz9Inteiros[i];
        for(int j = 0; i < diagonalPrincipal[i].length; j++){
            diagonalPrincipal[i][j] = matriz9Inteiros[i][j];
        }
    }
    
    for(int i = diagonalSecundaria.length; i > 0; i--){
        diagonalSecundaria[i] = matriz9Inteiros[i];
        for(int j = 0; i < diagonalSecundaria[i].length; j++){
            diagonalSecundaria[i][j] = matriz9Inteiros[i][j];
        }
    }
    
    

    
  }
}
