/**
 * 
 */
package br.com.poo.aula6.strategy.exe1;

import java.util.Arrays;
import java.util.Random;

/**
 * @author guilh
 *
 */
public class AmostragemSistematica implements Calculo {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.poo.aula6.strategy.Calculo#buscaSubconjunto(int[], int)
	 */
	@Override
	public int[] buscaSubconjunto(int[] populacao, int tamanhoAmostra) {

		int[] subConjunto = new int[tamanhoAmostra];

		Random generator = new Random();

		int[] populacaoOrdenada = new int[populacao.length];

		System.arraycopy(populacao, 0, populacaoOrdenada, 0, populacao.length);
		Arrays.sort(populacaoOrdenada);

		int step = populacaoOrdenada.length / tamanhoAmostra;
		int startingPoint = generator.nextInt(step);

		for (int i = 0; i < tamanhoAmostra; i++) {
			subConjunto[i] = populacaoOrdenada[startingPoint + (i * step)];
		}

		return subConjunto;
	}

}
