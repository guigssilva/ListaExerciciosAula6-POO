/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public class Executa {

	public static void main(String[] args) {
		try {
			Maquina maquina = new Maquina();
			maquina.selecioneProduto(new Refrigerante());
			maquina.selecioneProduto(new Chips());
			maquina.efetuarPagamento(5.00);
			maquina.selecioneProduto(new Chips());
			maquina.efetuarPagamento(1.00);
			maquina.efetuarPagamento(1.00);

			maquina.efetuarPagamento(1.00);

			maquina.selecioneProduto(new Beer());
			maquina.efetuarPagamento(10.00);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
