package com.br.templateMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class Cafe extends BebidaCafeinada {

	@Override
	public void misturar() {
		System.out.println("Moendo caf�..");

	}

	@Override
	public void adicionarCondimentos() {
		System.out.println("Adicionando a�ucar e leite");
	}
}
