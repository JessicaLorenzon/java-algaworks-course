package ex03_dadospedido;

public class Main {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();

		pedido.codigo = 102030;
		pedido.subtotal = 10.50;
		pedido.desconto = 5.00;
//		pedido.total = 5.5;

		System.out.println("Codigo do pedido: " + pedido.getCodigo() + " | Subtotal: R$" + pedido.getSubtotal()
				+ " | Desconto: R$" + pedido.getDesconto() + " | Total: R$" + pedido.getTotal());
	}
}
