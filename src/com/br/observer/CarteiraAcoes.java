package com.br.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author kmocelin
 * @since 23/10/2019
 */
public class CarteiraAcoes implements CarteiraAcoesSubject {

	private Map<String, Integer> acoes = new HashMap<>();
	private List<CarteiraAcoesObserver> observadores = new ArrayList<>();

	public void adicionarAcoes(String acao, Integer quantidade) {
		if (acoes.containsKey(acao)) {
			quantidade += acoes.get(acao);
		}
		acoes.put(acao, quantidade);
		notificar(acao, quantidade);
	}

	@Override
	public void adicionarObsevador(CarteiraAcoesObserver observador) {
		observadores.add(observador);
	}

	@Override
	public void removerObsevador(CarteiraAcoesObserver observador) {
		observadores.remove(observador);
	}

	@Override
	public void notificar(String acao, Integer quantidade) {
		for (CarteiraAcoesObserver o : observadores) {
			o.atualizarQuantidadeAcao(acao, quantidade);
		}
	}
}
