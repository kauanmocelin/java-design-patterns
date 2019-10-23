package com.br.null_object;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class CarrinhoNulo extends Carrinho {

	@Override
	public double getValor() {
		return 0.0;
	}

	@Override
	public int getQtdeItens() {
		return 0;
	}

	@Override
	public String getNomeUsuario() {
		return "";
	}
}