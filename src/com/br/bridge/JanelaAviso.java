package com.br.bridge;

/**
 * 
 * @author kmocelin
 * @since 21/10/2019
 */
public class JanelaAviso extends JanelaTipo {
	public JanelaAviso(JanelaPlataforma janelaPlataforma) {
		super(janelaPlataforma);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Aviso");
		desenharBotao("Ok");
	}
}
