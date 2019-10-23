package com.br.strategy.simples;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class ICMS implements CalculoImposto {

	private double valor;

	public ICMS(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return this.valor * 0.10;
	}
}
