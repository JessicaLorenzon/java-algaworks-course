import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o valor entregue pelo cliente: ");
		Double valorCliente = scanner.nextDouble();
		
		Double resultado = valorCliente - valorProduto;
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
	}
}
