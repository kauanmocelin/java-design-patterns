package com.br.null_object;

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
