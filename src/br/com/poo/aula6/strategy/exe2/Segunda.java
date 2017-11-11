/**
 * 
 */
package br.com.poo.aula6.strategy.exe2;

/**
 * @author guilh
 *
 */
public class Segunda implements IDiaDaSemana {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.strategy.exe2.IDiaDaSemana#mostraMessagem()
	 */
	@Override
	public void mostraMessagem() {
		System.out.println("Hoje é Segunda-feria!!!");
	}

}
