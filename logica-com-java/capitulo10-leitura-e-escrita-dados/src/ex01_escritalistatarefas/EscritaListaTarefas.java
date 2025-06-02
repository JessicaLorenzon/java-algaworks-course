package ex01_escritalistatarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaListaTarefas {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> tarefas = new ArrayList<String>();

		String tarefa;
		int i = 0;
		while (true) {
			System.out.print("Tarefa " + (i + 1) + ": ");
			tarefa = scanner.nextLine();

			if ("x".equals(tarefa)) {
				break;
			}

			tarefas.add(tarefa);
			i++;
		}
		escreverNoArquivo("C:\\Users\\Jessi\\Documents\\dev\\tarefas.txt", tarefas);

		scanner.close();

		System.out.println("Fim...");
	}

	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}
}
