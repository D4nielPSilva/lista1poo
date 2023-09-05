package Lista;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome completo do Cliente: ");
		String nomeCompleto = sc.nextLine();

		System.out.println("Digite o primeiro valor inteiro: ");
		int primeiroValor = sc.nextInt();

		System.out.println("Digite o segundo valor inteiro: ");
		int segundoValor = sc.nextInt();

		double resultadoDivisao = (double) primeiroValor / segundoValor;

		System.out.println("Nome completo do Cliente: " + nomeCompleto);
		System.out.println("Primeiro valor: " + primeiroValor);
		System.out.println("Segundo valor: " + segundoValor);
		System.out.println("Resultado da divisão: " + resultadoDivisao);

		sc.close();
	}
}
