import java.util.Scanner;

public class Ex02_NomeCompleto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();

		System.out.println("Nome Completo: " + nome + " " + sobrenome);

		scanner.close();

	}

}
