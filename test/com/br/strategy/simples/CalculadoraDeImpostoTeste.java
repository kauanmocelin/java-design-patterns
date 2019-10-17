package com.br.strategy.simples;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author kmocelin
 * @since 17/10/2019
 */
public class CalculadoraDeImpostoTeste {

	@Test
	public void deveCalcularImpostoICMS() {
		ICMS icms = new ICMS(1000);
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(icms);

		Assert.assertEquals(100.0, calculadoraDeImposto.calcular(), 0.00001);
	}

	@Test
	public void deveCalcularImpostoIPI() {
		IPI ipi = new IPI(1000);
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(ipi);

		Assert.assertEquals(200.0, calculadoraDeImposto.calcular(), 0.00001);
	}
}