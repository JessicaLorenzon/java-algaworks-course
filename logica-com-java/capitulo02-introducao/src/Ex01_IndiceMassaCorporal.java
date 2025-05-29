import java.util.Scanner;

public class Ex01_IndiceMassaCorporal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o peso(kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a altura(m): ");
		Double altura = scanner.nextDouble();
	
		Double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", imc);
		
		scanner.close();
	}
}
