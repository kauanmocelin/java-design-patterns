package com.br.strategy.enumeradorLogicaCondicional;

import org.junit.Assert;
import org.junit.Test;

import com.br.strategy.enumeradorLogicaCondicional.TipoOperacao;

/**
 * 
 * @author kmocelin
 * @since 27/08/2019
 */
public class TipoOperacaoTeste {

	@Test
	public void deveRealizarOperacaoDeAdicao() {
		double valorA = 10.00;
		double valorB = 20.00;

		double resultado = TipoOperacao.obterTipoOperacao(TipoOperacao.ADICAO.getDescricaoOperacao()).calcular(valorA, valorB);

		Assert.assertEquals(30.00, resultado, 0.000001);
	}
}
