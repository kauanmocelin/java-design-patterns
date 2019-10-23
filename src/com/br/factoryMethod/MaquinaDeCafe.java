package com.br.factoryMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class MaquinaDeCafe extends MaquinaDeBebidas {

	@Override
	public Bebida entregarBebida(TipoBebida tipoCafe) {
		
		Bebida cafe = null;
		
		if (TipoCafe.EXPRESSO.equals(tipoCafe)) {
			return new CafeExpresso();
		} else if (TipoCafe.CARIOCA.equals(tipoCafe)) {
			return new CafeCarioca();
		}
		return cafe;
	}
}
