package br.com.constructor_chaining;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author kmocelin
 * @since 27/08/2019
 */
public class EmpregadoTeste {

	@Test
	public void deveConstruirObjetoUtilizandoEncadeamentoDeConstrutores() {
		Empregado empregado = new Empregado();

		Assert.assertEquals(empregado.getNome(), "Jo�o");
		Assert.assertEquals(empregado.getSalario(), "1200,00");
		Assert.assertEquals(empregado.getEndereco(), "Curitiba");
	}
}
