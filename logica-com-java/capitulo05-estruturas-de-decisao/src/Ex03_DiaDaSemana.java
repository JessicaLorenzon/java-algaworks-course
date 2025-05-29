import java.util.Scanner;

public class Ex03_DiaDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número para saber qual é o dia da semana (de 1 até 7): ");
		Integer diaDaSemana = scanner.nextInt();

		String dia;
		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Quinta-feira";
			break;
		case 6:
			dia = "Sexta-feira";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			dia = "Inválido!";
		}

		System.out.print(dia);

		scanner.close();
	}
}
