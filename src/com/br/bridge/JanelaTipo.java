package com.br.bridge;

/**
 * 
 * @author kmocelin
 * @since 21/10/2019
 */
public abstract class JanelaTipo {
	protected JanelaPlataforma janelaPlataforma;

	public JanelaTipo(JanelaPlataforma j) {
		janelaPlataforma = j;
	}

	public void desenharJanela(String titulo) {
		janelaPlataforma.desenharJanela(titulo);
	}

	public void desenharBotao(String titulo) {
		janelaPlataforma.desenharBotao(titulo);
	}

	public abstract void desenhar();
}
