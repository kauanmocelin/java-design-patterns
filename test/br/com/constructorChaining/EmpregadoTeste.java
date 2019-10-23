package br.com.constructorChaining;

import org.junit.Assert;
import org.junit.Test;

import com.br.constructorChaining.Empregado;

/**
 * 
 * @author kmocelin
 * @since 27/08/2019
 */
public class EmpregadoTeste {

	@Test
	public void deveConstruirObjetoUtilizandoEncadeamentoDeConstrutores() {
		Empregado empregado = new Empregado();

		Assert.assertEquals(empregado.getNome(), "João");
		Assert.assertEquals(empregado.getSalario(), "1200,00");
		Assert.assertEquals(empregado.getEndereco(), "Curitiba");
	}
}
