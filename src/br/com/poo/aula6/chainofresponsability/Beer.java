/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public class Beer implements Produto {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.chainofresponsability.Produto#getNome()
	 */
	@Override
	public String getNome() {
		return new String("BEER GUIGS");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.chainofresponsability.Produto#getValor()
	 */
	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return 9.00;
	}

}
