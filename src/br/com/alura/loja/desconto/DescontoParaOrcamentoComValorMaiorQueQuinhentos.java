package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

	public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {

			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
