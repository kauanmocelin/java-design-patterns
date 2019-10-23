package com.br.observer;

/**
 * 
 * @author kmocelin
 * @since 23/10/2019
 */
public class Cliente {
	public static void main(String[] args) throws InterruptedException {
		GraficoBarras gb = new GraficoBarras();
		AcoesLogger al = new AcoesLogger();
		CarteiraAcoes c = new CarteiraAcoes();

		c.adicionarObsevador(gb);
		c.adicionarObsevador(al);
		Thread.sleep(2000);

		c.adicionarAcoes("Microsoft", 200);
		Thread.sleep(2000);

		c.adicionarAcoes("Apple", 400);
		Thread.sleep(2000);

		c.adicionarAcoes("Microsoft", 300);
		Thread.sleep(2000);

		c.adicionarAcoes("Apple", -200);
		Thread.sleep(2000);

		c.adicionarAcoes("Microsoft", 150);
	}
}
