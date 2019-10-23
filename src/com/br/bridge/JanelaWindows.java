package com.br.bridge;

/**
 * 
 * @author kmocelin
 * @since 21/10/2019
 */
public class JanelaWindows implements JanelaPlataforma {
	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Windows");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Windows");
	}
}
