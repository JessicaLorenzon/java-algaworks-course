package ex02_reporestoque;

public class Produto2 {

	static final Integer QUANTIDADE_MINIMA = 10;

	String nome;
	Integer quantidadeEstoque;

	Boolean reposicaoNecessaria() {
		return quantidadeEstoque < QUANTIDADE_MINIMA;
	}
}
