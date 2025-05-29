import java.util.Scanner;

public class Ex03_CalculadoraSubAd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();

		System.out.print("Qual operaçao deseja fazer? [1: adição | 2: subtração] ");
		Integer operacao = scanner.nextInt();

		if (operacao.equals(1)) {
			imprimir(adicao(primeiroNumero, segundoNumero));
		} else if (operacao.equals(2)) {
			imprimir(subtracao(primeiroNumero, segundoNumero));
		} else {
			System.err.println("Operação inválida!");
			System.exit(1);
		}

		scanner.close();
	}

	static Double adicao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}

	static Double subtracao(Double primeiroNumero, Double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

	static void imprimir(Double resultadoOperaçao) {
		System.out.println("Resultado da operação: " + resultadoOperaçao);
	}
}
