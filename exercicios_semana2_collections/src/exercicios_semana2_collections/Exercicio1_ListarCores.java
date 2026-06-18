package exercicios_semana2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1_ListarCores {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList<String>();
		
		System.out.println("Lista de 5 cores");
		for(int i = 0; i < 5; i++) {
			System.out.printf("\nDigite a %dª cor: ", i+1);
			cores.add(leia.next());
		}
		
		System.out.println("\nListar todas as cores:\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		System.out.println("\nOrdenar as cores:\n");
		Collections.sort(cores);
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		leia.close();
	}
}
