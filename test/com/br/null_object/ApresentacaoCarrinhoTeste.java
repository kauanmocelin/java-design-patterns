package com.br.null_object;

import org.junit.Assert;
import org.junit.Test;


/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class ApresentacaoCarrinhoTeste {

	@Test
	public void deveExibirInformacoesCarrinhoValido() {
		Carrinho carrinho = new ApresentacaoCarrinho().carregarCarrinho(true);

		Assert.assertEquals(100.0, carrinho.getValor(), 0.00001);
		Assert.assertEquals(5, carrinho.getQtdeItens());
		Assert.assertEquals("Kauan Mocelin", carrinho.getNomeUsuario());
	}

	@Test
	public void deveExibirInformacoesCarrinhoNulo() {
		Carrinho carrinho = new ApresentacaoCarrinho().carregarCarrinho(false);

		Assert.assertEquals(0.0, carrinho.getValor(), 0.00001);
		Assert.assertEquals(0, carrinho.getQtdeItens());
		Assert.assertEquals("", carrinho.getNomeUsuario());
	}
}
