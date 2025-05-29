import java.util.Scanner;

public class Ex04_Aposentadoria {

	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;

	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		Integer idade = scanner.nextInt();

		System.out.print("Digite seu tempo de contribuição com a previdência: ");
		Integer tempoContribuicao = scanner.nextInt();

		if (idade >= IDADE_MINIMA_PARA_APOSENTAR && tempoContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO) {
			System.out.println("Você ja pode se aposentar!");
		} else {
			System.out.println("Você ainda não pode se aposentar!");
		}

		scanner.close();
	}
}
