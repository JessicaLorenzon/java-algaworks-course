package ex02_usandobibliotecapropria;

import console.Interacao;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Interacao interacao = new Interacao();

		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");

		Double valorCliente = interacao.lerDecimal("Digite o valor entregue pelo cliente: ");

		interacao.imprimir("Troco: " + (valorCliente - valorProduto));

		interacao.fechar();
	}
}