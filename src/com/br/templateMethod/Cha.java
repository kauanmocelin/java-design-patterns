package com.br.templateMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class Cha extends BebidaCafeinada {

	@Override
	public void misturar() {
		System.out.println("Preparando saquinho de ch�...");

	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando algumas gotas de lim�o...");
	}

	@Override
	public boolean possuiCondimentos() {
		return false;
	}
}
