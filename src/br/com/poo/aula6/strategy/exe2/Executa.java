/**
 * 
 */
package br.com.poo.aula6.strategy.exe2;

/**
 * @author guilh
 *
 */
public class Executa {

	public static void main(String[] args) {

		DiaDaSemana d = new DiaDaSemana();
		d.mensagemDoDia(new Segunda());
		d.mensagemDoDia(new Terca());
		d.mensagemDoDia(new Quarta());
		d.mensagemDoDia(new Quinta());
		d.mensagemDoDia(new Sexta());
		d.mensagemDoDia(new Sabado());
		d.mensagemDoDia(new Domingo());
	}
}
