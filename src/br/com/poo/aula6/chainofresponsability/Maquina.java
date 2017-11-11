/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public class Maquina {

	Slot slot;
	Produto produto;
	double valorTotal;

	public Maquina() {
		slot = new Slot1();
		slot.setSucessor(new Slot5());
		slot.setSucessor(new Slot10());
		slot.setSucessor(new Slot15());
	}

	public void selecioneProduto(Produto produto) {
		this.produto = produto;
	}

	public void efetuarPagamento(double valor) throws Exception {
		valorTotal += slot.processaRequisicao(valor);
		if (valorTotal >= produto.getValor()) {
			System.out.println("Produto: " + produto.getNome());
			System.out.println("Valor: " + produto.getValor());
			System.out.println("Troco: " + (valorTotal - produto.getValor()));
			System.out.println("---------------------------------");
			valorTotal = 0;
		} else {
			System.out.println("Produto: " + produto.getNome());
			System.out.println("Valor insulficeinte, falta: " + (produto.getValor() - valorTotal));
		}
	}

}
