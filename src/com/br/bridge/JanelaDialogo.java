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
		desenharJanela("Janela de Diálogo");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
		desenharBotao("Botão Cancelar");
	}
}
