package aula_10_optional;

import java.util.Optional;

public class Exemplo01 {
	public static void main(String[] args) {
		String[] palavras = new String[10];
		
		//o vetor não foi preenchido, todas as suas posições são null
		for(var palavra : palavras) {
			System.out.println(palavra);
		}
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		/*
		 * se a sexta palavra do vetor estivesse preenchida, ela seria posta em
		 * minúsculas e mostrada logo após
		 */
		if(checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
		}else {
			System.out.println("A palavra é nula!");
		}
	}
}
