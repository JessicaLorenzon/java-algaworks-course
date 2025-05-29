import java.util.Scanner;

public class Ex05_AprovadoOuReprovado2 {

	static final Integer NOTA_MINIMA_APROVACAO = 70;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua nota: ");
		Integer nota = scanner.nextInt();

		Boolean aprovado = nota >= NOTA_MINIMA_APROVACAO;

		if (aprovado) {
			System.out.println("Parabéns! Você esta aprovado :)");
		} else {
			System.out.println("Que pena! Você esta reprovado :(");
		}

		scanner.close();
	}
}
