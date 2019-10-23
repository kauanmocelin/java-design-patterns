package com.br.templateMethod;

/**
 * 
 * @author kmocelin
 * @since 18/10/2019
 */
public class ClienteCafeteria {

	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		Cha cha = new Cha();

		cafe.preparar();
		cha.preparar();
	}
}
