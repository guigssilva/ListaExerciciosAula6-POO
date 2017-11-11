/**
 * 
 */
package br.com.poo.aula6.strategy.exe2;

/**
 * @author guilh
 *
 */
public class DiaDaSemana {

	public DiaDaSemana() {
		// TODO Auto-generated constructor stub
	}

	public void mensagemDoDia(IDiaDaSemana diaDaSemana) {
		diaDaSemana.mostraMessagem();
	}
}
