import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		BigDecimal imposto = calculadora.calcular(orcamento, new ICMS());
		System.out.println("O valor do imposto a ser pago é: " + imposto);
	}
}
