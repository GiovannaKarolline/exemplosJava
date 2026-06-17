package semana2_vetores_e_matrizes;

import java.util.Scanner;

public class Vetor {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int vetorInteiros[] = {10, 20, 70, 45, 78, 100};
		float vetorVazio[] = new float[5];
		
		for(int item = 0; item < vetorInteiros.length; item++) {
			System.out.printf("Posição %d do vetor de inteiros: %d\n",item, vetorInteiros[item]);
		}
		
		System.out.println("Tamanho do vetor de inteiros: " + vetorInteiros.length);
		
		for(int item = 0; item < vetorInteiros.length; item++) {
			System.out.printf("Digite o valor inteiro da posição %d do vetor de inteiros:\n",item);
			vetorInteiros[item] = leia.nextInt();
		}
		
		for(int item = 0; item < vetorInteiros.length; item++) {
			System.out.printf("Posição %d do vetor de inteiros: %d\n",item, vetorInteiros[item]);
		}
		
		//arrays.binarysearch(), array.sort(), 
		
		leia.close();
	}
}