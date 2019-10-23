package com.br.strategy.simples;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class CalculadoraDeImposto {

	private CalculoImposto calculoImposto;

	public CalculadoraDeImposto(CalculoImposto imposto) {
		this.calculoImposto = imposto;
	}

	public double calcular() {
		return calculoImposto.calcular();
	}
}
