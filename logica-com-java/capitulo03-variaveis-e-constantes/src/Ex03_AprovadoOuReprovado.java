import java.util.Scanner;

public class Ex03_AprovadoOuReprovado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua nota: ");
		Integer nota = scanner.nextInt();

		Boolean aprovado = nota >= 70;

		if (aprovado) {
			System.out.println("Parabéns! Você esta aprovado :)");
		} else {
			System.out.println("Que pena! Você esta reprovado :(");
		}

		scanner.close();
	}
}
