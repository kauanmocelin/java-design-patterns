package com.br.strategy.simples;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class IPI implements Imposto {

	private double valor;

	public IPI(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return this.valor * 0.20;
	}
}
