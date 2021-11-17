package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {

	//Aqui é onde configuramos a ordem de chamada das ações, a primeira será a tentativa
	// de dar o desconto por ter mais de 5 itens no orçamento, a segunda será o desconto
	// por valor ser maior que 500 e por fim finaliza sem dar desconto...
	//Tenha em mente que apenas um desconto (ação) é executado, se executar o fluxo será
	// interrompido.
	Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
			new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
					new SemDesconto()));
	
	return desconto.calcular(orcamento);
	
	}
	
}
