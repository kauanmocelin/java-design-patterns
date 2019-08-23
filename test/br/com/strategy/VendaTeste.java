/**
 * 
 */
package br.com.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author kmocelin
 * @since 23/08/2019
 */
public class VendaTeste {

	private Funcionario atendente;
	private Funcionario vendedor;
	private Funcionario gerente;

	@Before
	public void configuracaoInicial() {
		atendente = new Funcionario("Maria da Silva", 1200.00, Cargo.ATENDENTE);
		vendedor = new Funcionario("Jose de Almeida", 3000.00, Cargo.VENDEDOR);
		gerente = new Funcionario("Olavo de Carvalho", 12000.00, Cargo.GERENTE);
	}

	@Test
	public void deveCalcularComissaoDeUmAtendente() {
		Venda venda = new Venda(atendente, 200.0);

		Assert.assertEquals(20.0, venda.calculaComissao(), 0.00001);
	}

	@Test
	public void deveCalcularComissaoDeUmVendedor() {
		Venda venda = new Venda(vendedor, 200.0);

		Assert.assertEquals(35.0, venda.calculaComissao(), 0.00001);
	}

	@Test
	public void deveCalcularComissaoDeUmGerente() {
		Venda venda = new Venda(gerente, 200.0);

		Assert.assertEquals(50.0, venda.calculaComissao(), 0.00001);
	}
}
