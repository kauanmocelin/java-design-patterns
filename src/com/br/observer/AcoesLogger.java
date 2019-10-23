package com.br.observer;

/**
 * 
 * @author kmocelin
 * @since 23/10/2019
 */
public class AcoesLogger implements CarteiraAcoesObserver {

	public void atualizarQuantidadeAcao(String acao, Integer qtd) {
		System.out.println("Alterada a quantidade da ação " + acao + " para " + qtd);
	}
}
