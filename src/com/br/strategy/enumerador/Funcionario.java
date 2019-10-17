/**
 * 
 */
package com.br.strategy.enumerador;

/**
 * 
 * @author kmocelin
 * @since 23/08/2019
 */
public class Funcionario {

	private String nome;
	private double salario;
	private Cargo cargo;

	public Funcionario(String nome, double salario, Cargo cargo) {
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	/**
	 * <br>
	 * @author kmocelin
	 * @since 23/08/2019
	 * @return
	 */
	public Cargo getCargo() {
		return this.cargo;
	}

}
