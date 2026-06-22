package semana3_cursos_ead;

import java.util.Scanner;

public class TestaCurso {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		Curso curso1 = new Curso("Física", 100, 20, "Marcelo", 2);
		Curso curso2= new Curso("Culinária", 500, 1000, "Jaqin", 6);
		
		curso1.visualizar();
		curso2.visualizar();
		
		Curso novoCurso = new Curso();
		
		System.out.println("Criação de curso");
		System.out.print("\nDigite o nome do curso: ");
		novoCurso.setNomeCurso(leia.nextLine());
		
		System.out.println("Digite o nome do professor:");
		novoCurso.setNomeProfessor(leia.nextLine());
		
		System.out.println("Digite o valor da mensalidade:");
		novoCurso.setMensalidade(leia.nextFloat());
		
		System.out.println("Digite a quantidade de módulos:");
		novoCurso.setModulos(leia.nextInt());
		
		System.out.println("Digite a quantidade total de horas:");
		leia.skip("\n");
		novoCurso.setTotalHoras(leia.nextInt());
		
		novoCurso.visualizar();
		
		System.out.printf("\nMensalidade do curso 2: %.2f", curso2.getMensalidade());
		
	}

}
