/**
 * 
 */
package com.br.strategy.enumerador;

/**
 * 
 * @author kmocelin
 * @since 23/08/2019
 */
public class Venda {

	private final Funcionario funcionario;
	private final double valor;

	public Venda(Funcionario funcionario, double valor) {
		this.funcionario = funcionario;
		this.valor = valor;
	}

	public double calculaComissao() {
		Cargo cargo = this.funcionario.getCargo();
		return cargo.calculaComissao(valor);
	}
}
