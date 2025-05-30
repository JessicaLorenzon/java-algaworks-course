package ex01_reporestoque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.print("Digite o nome do produto: ");
		produto.nome = scanner.nextLine();

		System.out.print("Digite a quantidade de produto no estoque: ");
		produto.quantidadeEstoque = scanner.nextInt();

		if (reposicaoNecessaria(produto)) {
			System.out.println("Estoque do produto " + produto.nome + " precisa de reposição!");
		} else {
			System.out.println("Estoque do produto " + produto.nome + " não precisa de reposição!");
		}

		scanner.close();
	}

	static Boolean reposicaoNecessaria(Produto produto) {
		return produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA;
	}
}
