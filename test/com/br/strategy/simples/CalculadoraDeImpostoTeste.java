package com.br.strategy.simples;

import org.junit.Assert;
import org.junit.Test;

import com.br.strategy.simples.CalculadoraDeImposto;
import com.br.strategy.simples.ICMS;
import com.br.strategy.simples.IPI;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class CalculadoraDeImpostoTeste {

	@Test
	public void deveCalcularImpostoICMS() {
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		ICMS icms = new ICMS(1000);

		Assert.assertEquals(100.0, calculadoraDeImposto.calcular(icms), 0.00001);
	}

	@Test
	public void deveCalcularImpostoIPI() {
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		IPI ipi = new IPI(1000);

		Assert.assertEquals(200.0, calculadoraDeImposto.calcular(ipi), 0.00001);
	}
}