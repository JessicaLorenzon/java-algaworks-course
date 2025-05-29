import java.util.Scanner;

public class Ex02_ValorFinal {

	static final Double VALOR_FRETE = 15.00;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: R$");
		Double valorProduto = scanner.nextDouble();

		Boolean freteGratis = valorProduto >= 100.00;

		Double valorFinal = valorProduto;

		if (!freteGratis) {
			valorFinal += VALOR_FRETE;
		}

		System.out.println("Valor final da compra: R$" + valorFinal);

		scanner.close();
	}
}
