package com.br.factoryMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class Cliente {
	public static void main(String[] args) {
		MaquinaDeBebidas maquinaDeCafe = new MaquinaDeCafe();
		MaquinaDeBebidas maquinaDeRefrigerante = new MaquinaDeRefrigerante();

		maquinaDeCafe.entregarBebida(TipoCafe.CARIOCA);
		maquinaDeRefrigerante.entregarBebida(TipoRefrigerante.COCA);
	}
}
