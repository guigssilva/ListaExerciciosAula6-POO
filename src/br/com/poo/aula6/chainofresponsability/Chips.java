/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public class Chips implements Produto {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.chainofresponsability.Produto#getNome()
	 */
	@Override
	public String getNome() {

		return new String("CHIPS");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.chainofresponsability.Produto#getValor()
	 */
	@Override
	public double getValor() {

		return 2.50;

	}

}
