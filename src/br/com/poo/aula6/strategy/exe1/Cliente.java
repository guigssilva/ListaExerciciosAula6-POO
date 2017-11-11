/**
 * 
 */
package br.com.poo.aula6.strategy.exe1;

/**
 * @author guilh
 *
 */
public class Cliente {

	public static void main(String args[]) {

		// Populacao
		int[] zipCodes = new int[] { 66209, 64113, 10162, 90210, 61701, 55901, 48823, 62901, 50014 };

		Amostragem amostrador = new Amostragem(zipCodes);
		int[] amostra = amostrador.selecionaSubconjunto(new AmostragemRandomica(), 3);

		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}
		System.out.println();

		amostra = amostrador.selecionaSubconjunto(new AmostragemSistematica(), 3);

		for (int i = 0; i < amostra.length; i++) {
			System.out.println(amostra[i]);
		}
	}
}
