package com.br.bridge;

import org.junit.Test;

import com.br.bridge.JanelaAviso;
import com.br.bridge.JanelaDialogo;
import com.br.bridge.JanelaLinux;
import com.br.bridge.JanelaTipo;
import com.br.bridge.JanelaWindows;

/**
 * 
 * @author kmocelin
 * @since 21/10/2019
 */
public class ClienteTeste {
	
	@Test
	public void deveInstanciarUmaJanelaDialogoLinux() {
		JanelaTipo janelaTipo = new JanelaDialogo(new JanelaLinux());

		janelaTipo.desenhar();
	}

	@Test
	public void deveInstanciarUmaJanelaAvisoWindows() {
		JanelaTipo janelaTipo = new JanelaAviso(new JanelaWindows());

		janelaTipo.desenhar();
	}
}
