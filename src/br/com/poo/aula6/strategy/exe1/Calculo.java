/**
 * 
 */
package br.com.poo.aula6.strategy.exe1;

/**
 * @author guilh
 *
 */
public interface Calculo {

	/**
	 * Retorna o conjunto Final ap�s o calculo
	 * 
	 * @param populacao
	 * @param tamanhoAmostra
	 * @return
	 */
	public int[] buscaSubconjunto(int[] populacao, int tamanhoAmostra);

}
