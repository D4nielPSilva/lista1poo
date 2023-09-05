package Lista;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroMesa;
		String[] produtos = new String[3];
		double[] valores = new double[3];
		int[] quantidades = new int[3];
		double total = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o número da mesa do bar: ");
			numeroMesa = sc.nextInt();
			sc.nextLine(); 

			System.out.print("Digite o nome da bebida ou refeição solicitada: ");
			produtos[i] = sc.nextLine();

			System.out.print("Digite o valor da bebida ou refeição solicitada: ");
			valores[i] = sc.nextDouble();

			System.out.print("Digite a quantidade de bebidas ou refeições: ");
			quantidades[i] = sc.nextInt();

			double subtotal = valores[i] * quantidades[i];
			total += subtotal;

			sc.nextLine();

			System.out.println("Pedido registrado para a mesa " + numeroMesa + ":");
			System.out.println("Produto: " + produtos[i]);
			System.out.println("Valor unitário: R$" + valores[i]);
			System.out.println("Quantidade: " + quantidades[i]);
			System.out.println("Subtotal: R$" + subtotal);
			System.out.println();
		}

		System.out.println("Valor total dos pedidos: R$" + total);

		sc.close();
	}
}
