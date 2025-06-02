import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex01_ListaAlunosArquivo {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\Jessi\\Documents\\dev\\nomes.txt");

		List<String> nomes = Files.readAllLines(arquivo);

		ListaAlunos listaAlunos = new ListaAlunos();

		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);

			Aluno aluno = new Aluno();
			aluno.nome = nome;

			listaAlunos.adicionar(aluno);
		}

		listaAlunos.ordenar();

		List<String> nomesOrdenados = new ArrayList<String>();
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno aluno = listaAlunos.obter(i);
			nomesOrdenados.add(aluno.nome);
		}

		Path novoArquivo = Paths.get("C:\\Users\\Jessi\\Documents\\dev\\nomes-ordenados.txt");
		Files.write(novoArquivo, nomesOrdenados);
	}
}
