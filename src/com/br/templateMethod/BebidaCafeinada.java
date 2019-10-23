package com.br.templateMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public abstract class BebidaCafeinada {

	/* Método que representa o Template Method */
	public final void preparar() {
		esquentarAgua();
		misturar();
		colocarEmCopo();
		if (possuiCondimentos()) {
			adicionarCondimentos();
		}
	}

	public void esquentarAgua() {
		System.out.println("\nEsquentando água...");
	}

	public abstract void misturar();

	public void colocarEmCopo() {
		System.out.println("Colocando no copo..");
	}

	/* Método que representa um Hook Method */
	public boolean possuiCondimentos() {
		return true;
	}

	public abstract void adicionarCondimentos();
}
