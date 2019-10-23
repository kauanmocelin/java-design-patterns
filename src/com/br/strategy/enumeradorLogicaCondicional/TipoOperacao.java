package com.br.strategy.enumeradorLogicaCondicional;

/**
 * 
 * @author kmocelin
 * @since 27/08/2019
 */
public enum TipoOperacao {

	ADICAO("Adi��o") {

		@Override
		public double calcular(double valorEsquerdaOperacao, double valorDireitaOperacao) {
			return valorEsquerdaOperacao + valorDireitaOperacao;
		}

	},
	SUBTRACAO("Subtra��o") {

		@Override
		public double calcular(double valorEsquerdaOperacao, double valorDireitaOperacao) {
			return valorEsquerdaOperacao - valorDireitaOperacao;
		}

	},
	MULTIPLICACAO("Multiplica��o") {

		@Override
		public double calcular(double valorEsquerdaOperacao, double valorDireitaOperacao) {
			return valorEsquerdaOperacao * valorDireitaOperacao;
		}

	},
	DIVISAO("Divis�o") {

		@Override
		public double calcular(double valorEsquerdaOperacao, double valorDireitaOperacao) {
			return valorEsquerdaOperacao / valorDireitaOperacao;
		}

	};

	public abstract double calcular(double valorEsquerdaOperacao, double valorDireitaOperacao);

	private final String descricaoOperacao;

	private TipoOperacao(String descricaoOperacao) {
		this.descricaoOperacao = descricaoOperacao;
	}

	public String getDescricaoOperacao() {
		return descricaoOperacao;
	}

	public static TipoOperacao obterTipoOperacao(String descricaoOperacao) {
		for (TipoOperacao tipoOperacao : TipoOperacao.values()) {
			if (tipoOperacao.descricaoOperacao.equalsIgnoreCase(descricaoOperacao)) {
				return tipoOperacao;
			}
		}
		throw new IllegalArgumentException("N�o existe opera��o com esta descri��o.");
	}

}
