package com.br.constructorChaining;

/**
 * 
 * @author kmocelin
 * @since 27/08/2019
 */
public class Empregado {

	private String nome;
	private String salario;
	private String endereco;

	public String getNome() {
		return nome;
	}
	public String getSalario() {
		return salario;
	}
	public String getEndereco() {
		return endereco;
	}

	public Empregado() {
		this("João");
	}

	public Empregado(String nome) {
		this(nome, "1200,00");
	}

	public Empregado(String nome, String salario) {
		this(nome, salario, "Curitiba");
	}

	public Empregado(String nome, String salario, String endereco) {
		this.nome = nome;
		this.salario = salario;
		this.endereco = endereco;
	}
}
