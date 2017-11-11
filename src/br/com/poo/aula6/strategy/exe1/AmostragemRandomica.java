/**
 * 
 */
package br.com.poo.aula6.strategy.exe1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author guilh
 *
 */
public class AmostragemRandomica implements Calculo {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.strategy.Calculo#buscaSubconjunto(int[], int)
	 */
	@Override
	public int[] buscaSubconjunto(int[] populacao, int tamanhoAmostra) {

		int[] subConjunto = new int[tamanhoAmostra];

		Random generator = new Random();

		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		for (int i = 0; i < populacao.length; i++)
			tempArray.add(populacao[i]);

		for (int i = 0; i < tamanhoAmostra; i++) {
			subConjunto[i] = tempArray.remove(generator.nextInt(tempArray.size()));
		}

		return subConjunto;
	}

}
