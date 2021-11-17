import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 1);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal imposto = calculadora.calcular(orcamento);
		System.out.println("O valor do desconto é de: " + imposto);
	}
}
