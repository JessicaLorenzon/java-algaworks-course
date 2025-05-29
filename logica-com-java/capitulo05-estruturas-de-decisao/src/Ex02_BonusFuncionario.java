import java.util.Scanner;

public class Ex02_BonusFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a meta de faturamento anual da empresa no ultimo ano: ");
		Double metaFaturamentoAnual = scanner.nextDouble();

		System.out.print("Digite o faturamento real da empresa no ultimo ano: ");
		Double faturamentoAnualReal = scanner.nextDouble();

		System.out.print("Digite a média salarial do funcionário(a) no ultimo ano: ");
		Double mediaSalarial = scanner.nextDouble();

		Boolean bateuMeta = faturamentoAnualReal >= metaFaturamentoAnual;
		Boolean bateuOitentaPorCento = faturamentoAnualReal >= (metaFaturamentoAnual * 0.8);

		if (bateuMeta) {
			System.out.println("O bônus será de: R$" + mediaSalarial);
		} else if (bateuOitentaPorCento) {
			Double bonus = mediaSalarial * 0.8;
			System.out.println("O bônus será de: R$" + bonus);
		} else {
			System.out.println("Esse ano não terá bônus :(");
		}

		scanner.close();
	}
}
