/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public class Slot15 extends Slot {

	private double value = 15.00;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.poo.aula6.chainofresponsability.Slot#processaRequisicao(java.lang.
	 * Double)
	 */
	@Override
	public double processaRequisicao(Double valor) throws Exception {

		if (this.value == valor) {
			return this.value;
		} else {
			return this.getSucessor().processaRequisicao(valor);
		}
	}

}
