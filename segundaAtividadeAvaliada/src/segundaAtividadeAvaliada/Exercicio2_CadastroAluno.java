package segundaAtividadeAvaliada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2_CadastroAluno {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static class Aluno{
		String nome = "";
		int idade = 0;
		float notaFinal = 0.0f;
		
		public void mostrarInformacoes(){
			System.out.println(this.nome);
			System.out.println(this.idade);
			System.out.println(this.notaFinal);
		};
	}
	
	public static void adicionarAluno(List<Aluno> alunos) {
		Aluno novoAluno = new Aluno();
		
		System.out.println("\nDigite o nome do aluno:");
		leia.skip("\n");
		novoAluno.nome = leia.nextLine();
		
		System.out.println("\nDigite a idade do aluno:");
		novoAluno.idade = leia.nextInt();
		
		System.out.println("\nDigite a nota final do aluno:");
		novoAluno.notaFinal = leia.nextFloat();
		
		alunos.add(novoAluno);
		
		System.out.println("\nAluno adicionado!");
	}
	
	public static void listarAlunos(List<Aluno> alunos) {
		if(alunos.size() > 0) {
			int contador = 0;
			System.out.println("\nAlunos:\n");
			for(Aluno aluno : alunos) {
				System.out.printf("\n\n%dº aluno\n", ++contador);
				System.out.printf("\nNome do aluno: %s", aluno.nome);
				System.out.printf("\nIdade do aluno: %d", aluno.idade);
				System.out.printf("\nNota final do aluno: %.1f\n", aluno.notaFinal);
			}
		}else {
			System.out.println("\nNenhum aluno registrado!");
		}
		
	}
	
	public static float calcularMediaGeral(List<Aluno> alunos) {
		float media = 0.0f;
		
		for(Aluno aluno : alunos) {
			media += aluno.notaFinal;
		}
		
		if(alunos.size()>0) {
			return media/alunos.size();
		}
		
		return 0.0f;
	}
	
	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<>();
		boolean novoCadastro = true;
		
		while(novoCadastro) {
			System.out.println("\n˜˜˜˜˜˜˜˜˜Cadastro de alunos˜˜˜˜˜˜˜˜˜");
			System.out.println("1 - Cadastrar novo aluno");
			System.out.println("2 - Listar alunos cadastrados");
			System.out.println("3 - Saber a média geral das notas");
			System.out.println("Digite qualquer outro número para sair.\n");
			
			switch(leia.nextInt()) {
				case 1:
					adicionarAluno(alunos);
					break;
				case 2:
					listarAlunos(alunos);
					break;
				case 3:
					System.out.printf("\nMédia geral dos alunos: %.1f", calcularMediaGeral(alunos));
					break;
				default:
					novoCadastro = false;
					System.out.println("\nFim do programa!");
					break;
			}
		}
	}
}