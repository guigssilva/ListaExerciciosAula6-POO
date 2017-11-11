/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public class Refrigerante implements Produto {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.chainofresponsability.Produto#getNome()
	 */
	@Override
	public String getNome() {

		return new String("REFRIGERANTE");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.chainofresponsability.Produto#getValor()
	 */
	@Override
	public double getValor() {

		return 1.00;
	}

}
