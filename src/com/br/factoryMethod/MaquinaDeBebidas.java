package com.br.factoryMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public abstract class MaquinaDeBebidas {

	public abstract Bebida entregarBebida(TipoBebida tipoBebida);

	public String exibirMensagem() {
		return "Bem-vindo à máquina de bebidas";
	}
}
