package com.br.null_object;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class Carrinho {

	private double valor;
	private int qtdeItens;
	private String nomeUsuario;

	public Carrinho() {
	}
	
	public Carrinho(double valor, int tamanho, String nomeUsuario) {
		this.valor = valor;
		this.qtdeItens = tamanho;
		this.nomeUsuario = nomeUsuario;
	}

	public double getValor() {
		return valor;
	}

	public int getQtdeItens() {
		return qtdeItens;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}
}
