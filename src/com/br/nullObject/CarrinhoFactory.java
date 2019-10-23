package com.br.nullObject;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class CarrinhoFactory {

	public Carrinho criarCarrinho(boolean existeCarrinho) {
		if (existeCarrinho) {
			return new Carrinho(100.0, 5, "Kauan Mocelin");
		}
		return new CarrinhoNulo();
	}
}
