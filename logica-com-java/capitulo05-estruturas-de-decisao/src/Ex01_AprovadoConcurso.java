import java.util.Scanner;

public class Ex01_AprovadoConcurso {

	static final Double NOTA_MINIMA_INDIVIDUAL = 60.0;
	static final Double NOTA_MINIMA_TOTAL = 150.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua nota de português: ");
		Double notaPortugues = scanner.nextDouble();

		System.out.print("Digite sua nota de matemática: ");
		Double notaMatematica = scanner.nextDouble();

		Double notaTotal = notaPortugues + notaMatematica;

		Boolean acimaDoMinimoIndivual = notaPortugues >= NOTA_MINIMA_INDIVIDUAL
				&& notaMatematica >= NOTA_MINIMA_INDIVIDUAL;
		Boolean acimaDoMinimoTotal = notaTotal >= NOTA_MINIMA_TOTAL;
		Boolean aprovado = acimaDoMinimoIndivual && acimaDoMinimoTotal;

		if (aprovado) {
			System.out.println("Parabéns! Você foi aprovado no concurso.");
		} else {
			System.out.println("Que pena! Você não foi aprovado no concurso.");
		}

		scanner.close();
	}
}
