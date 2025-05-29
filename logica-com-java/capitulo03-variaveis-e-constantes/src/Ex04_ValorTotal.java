import java.util.Scanner;

public class Ex04_ValorTotal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o preço do produto: ");
		Double preco = scanner.nextDouble();

		System.out.print("Digite a quantidade do produto: ");
		Integer quantidade = scanner.nextInt();

		Double subtotal = preco * quantidade;

		Boolean quantidadeMaiorOuIgualDez = quantidade >= 10;

		Double percentualDesconto = 0.0;

		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}

		Double desconto = subtotal * percentualDesconto / 100;

		Double valorTotalComDesconto = subtotal - desconto;

		System.out.println("Valor total: " + valorTotalComDesconto);

		scanner.close();
	}
}
