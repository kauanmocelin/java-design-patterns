package com.br.strategy;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class ICMS implements Imposto {

	private double valor;

	public ICMS(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcular() {
		return this.valor * 0.10;
	}
}
