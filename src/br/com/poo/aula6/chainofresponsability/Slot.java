/**
 * 
 */
package br.com.poo.aula6.chainofresponsability;

/**
 * @author guilh
 *
 */
public abstract class Slot {

	private Slot sucessor;

	public Slot() {
		sucessor = null;
	}

	public abstract double processaRequisicao(Double valor) throws Exception;

	/**
	 * @return the sucessor
	 */
	public Slot getSucessor() throws Exception {
		if (this.sucessor == null) {
			throw new Exception("A maquina não aceita este valor!");
		} else {
			return this.sucessor;
		}
	}

	/**
	 * @param sucessor
	 *            the sucessor to set
	 */
	public void setSucessor(Slot sucessor) {
		if (this.sucessor == null) {
			this.sucessor = sucessor;
		} else {
			this.sucessor.setSucessor(sucessor);
		}
	}

}
