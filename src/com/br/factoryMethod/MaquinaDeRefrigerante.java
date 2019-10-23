package com.br.factoryMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class MaquinaDeRefrigerante extends MaquinaDeBebidas {

	@Override
	public Bebida entregarBebida(TipoBebida tipoRefrigerante) {

		Bebida refrigerante = null;

		if (TipoRefrigerante.COCA.equals(tipoRefrigerante)) {
			return new Coca();
		} else if (TipoRefrigerante.FANTA.equals(tipoRefrigerante)) {
			return new Fanta();
		}
		return refrigerante;
	}
}
