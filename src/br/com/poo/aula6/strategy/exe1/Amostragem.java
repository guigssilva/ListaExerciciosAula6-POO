/**
 * 
 */
package br.com.poo.aula6.strategy.exe1;

/**
 * @author guilh
 *
 */
public class Amostragem {
	private int[] amostras;

	public Amostragem(int[] ceps) {
		amostras = ceps;
	}

	/**
	 * Retorna os valores apos calcular o subconjunto
	 * 
	 * @param subConjunto
	 * @param tamanhoAmostra
	 * @return
	 */
	public int[] selecionaSubconjunto(Calculo subConjunto, int tamanhoAmostra) {
		return subConjunto.buscaSubconjunto(amostras, tamanhoAmostra);
	}

	/**
	 * @return the amostras
	 */
	public int[] getAmostras() {
		return amostras;
	}

	/**
	 * @param amostras
	 *            the amostras to set
	 */
	public void setAmostras(int[] amostras) {
		this.amostras = amostras;
	}

}
