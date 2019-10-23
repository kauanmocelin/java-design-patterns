package com.br.bridge;

/**
 * 
 * @author kmocelin
 * @since 21/10/2019
 */
public class JanelaDialogo extends JanelaTipo {
	public JanelaDialogo(JanelaPlataforma janelaPlataforma) {
		super(janelaPlataforma);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Di�logo");
		desenharBotao("Bot�o Sim");
		desenharBotao("Bot�o N�o");
		desenharBotao("Bot�o Cancelar");
	}
}
