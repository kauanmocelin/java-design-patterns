package com.br.bridge;

/**
 * 
 * @author kmocelin
 * @since 21/10/2019
 */
public class JanelaLinux implements JanelaPlataforma {
	@Override
	public void desenharJanela(String titulo) {
		System.out.println(titulo + " - Janela Linux");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Linux");
	}
}
