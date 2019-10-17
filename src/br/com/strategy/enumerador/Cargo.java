/**
 * 
 */
package br.com.strategy.enumerador;

/**
 * 
 * @author kmocelin
 * @since 23/08/2019
 */
public enum Cargo implements Comissao {

	ATENDENTE {
		@Override
		public double calculaComissao(double valor) {
			return valor * 0.1;
		}
	},
	VENDEDOR {
		@Override
		public double calculaComissao(double valor) {
			return valor * 0.15 + 5;
		}
	},
	GERENTE {
		@Override
		public double calculaComissao(double valor) {
			return valor * 0.20 + 10;
		}
	};

}
