package exercicios_ifElse_switchCase;

import java.util.Scanner;

public class Exercicio4_qualOAnimal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] caracteristicas = new String[3];
		
		System.out.println("Descobre o animal pelas características\n");
		
		System.out.println("Digite \"vertebrado\" se o animal é vertebrado, ou \"invertebrado\" se o animal é invertebrado:");
		caracteristicas[0] = leia.next();
		
		if(caracteristicas[0].equalsIgnoreCase("invertebrado")) {
			System.out.println("Digite \"inseto\" se o animal é um inseto, ou \"anelídeo\" se o animal é um anelídeo:");
			caracteristicas[1] = leia.next();
			
			if(caracteristicas[1].equalsIgnoreCase("inseto")) {
				System.out.println("Digite \"hematófago\" se o animal é hematófago, ou \"herbívoro\" se o animal é herbívoro:");
				caracteristicas[2] = leia.next();
				
				if(caracteristicas[2].equalsIgnoreCase("hematófago")) {
					System.out.println("O animal é uma pulga.");
				}else if(caracteristicas[2].equalsIgnoreCase("herbívoro")) {
					System.out.println("O animal é uma lagarta.");
				}
				
			}else if(caracteristicas[1].equalsIgnoreCase("anelídeo")) {
				System.out.println("Digite \"hematófago\" se o animal é hematófago, ou \"Onívoro\" se o animal é Onívoro:");
				caracteristicas[2] = leia.next();
				
				if(caracteristicas[2].equalsIgnoreCase("hematófago")) {
					System.out.println("O animal é uma sanguessuga.");
				}else if(caracteristicas[2].equalsIgnoreCase("Onívoro")) {
					System.out.println("O animal é uma minhoca.");
				}
			}
		}else if(caracteristicas[0].equalsIgnoreCase("vertebrado")) {
			System.out.println("Digite \"ave\" se o animal é uma ave, ou \"mamífero\" se o animal é um mamífero:");
			caracteristicas[1] = leia.next();
			
			if(caracteristicas[1].equalsIgnoreCase("ave")) {
				System.out.println("Digite \"carnívoro\" se o animal é carnívoro, ou \"onívoro\" se o animal é onívoro:");
				caracteristicas[2] = leia.next();
				
				if(caracteristicas[2].equalsIgnoreCase("carnívoro")) {
					System.out.println("O animal é uma águia.");
				}else if(caracteristicas[2].equalsIgnoreCase("onívoro")) {
					System.out.println("O animal é uma pomba.");
				}
				
			}else if(caracteristicas[1].equalsIgnoreCase("mamífero")) {
				System.out.println("Digite \"onívoro\" se o animal é onívoro, ou \"herbívoro\" se o animal é herbívoro:");
				caracteristicas[2] = leia.next();
				
				if(caracteristicas[2].equalsIgnoreCase("onívoro")) {
					System.out.println("O animal é um homem.");
				}else if(caracteristicas[2].equalsIgnoreCase("herbívoro")) {
					System.out.println("O animal é uma vaca.");
				}
			}
		}
		leia.close();
	}
}
