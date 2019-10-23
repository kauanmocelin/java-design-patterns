package com.br.nullObject;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class ApresentacaoCarrinho {

	public Carrinho carregarCarrinho(boolean existeCarrinho) {
		return new CarrinhoFactory().criarCarrinho(existeCarrinho);
	}
}
