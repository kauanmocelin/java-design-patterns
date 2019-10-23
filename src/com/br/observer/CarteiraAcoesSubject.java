package com.br.observer;

/**
 * 
 * @author kmocelin
 * @since 23/10/2019
 */
public interface CarteiraAcoesSubject {

	public void adicionarObsevador(CarteiraAcoesObserver observador);
	public void removerObsevador(CarteiraAcoesObserver observador);
	public void notificar(String acao, Integer quantidade);
}
