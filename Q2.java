package Lista;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do(a) professor(a): ");
		String nomeProfessor = sc.nextLine();

		System.out.print("Digite o número de estudantes: ");
		int numeroEstudantes = sc.nextInt();
		sc.nextLine(); 

		for (int i = 1; i <= numeroEstudantes; i++) {
			System.out.println("Estudante " + i + ":");

			System.out.print("Nome do estudante: ");
			String nomeEstudante = sc.nextLine();

			System.out.print("Digite a nota 1: ");
			double nota1 = sc.nextDouble();

			System.out.print("Digite a nota 2: ");
			double nota2 = sc.nextDouble();

			sc.nextLine(); 

			double media = (nota1 + nota2) / 2;

			System.out.println("Dados do Estudante " + i + ":");
			System.out.println("Nome: " + nomeEstudante);
			System.out.println("Nota 1: " + nota1);
			System.out.println("Nota 2: " + nota2);
			System.out.println("Média: " + media);
			System.out.println();
		}

		sc.close();
	}
}
