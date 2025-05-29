import java.util.Scanner;

public class Ex01_CalculadoraSimples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();

		System.out.print("Qual será a operaçao? [1: adição | 2: subtração | 3: multiplicação | 4: divisão] ");
		Integer operacao = scanner.nextInt();

		Double resultado = null;
		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		} else if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		} else if (operacao.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		} else if (operacao.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}

		System.out.println("Resultado da operação: " + resultado);

		scanner.close();
	}
}
