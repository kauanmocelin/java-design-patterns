package com.br.templateMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class Cha extends BebidaCafeinada {

	@Override
	public void misturar() {
		System.out.println("Preparando saquinho de chá...");

	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando algumas gotas de limão...");
	}

	@Override
	public boolean possuiCondimentos() {
		return false;
	}
}
