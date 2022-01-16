import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedido2;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;

public class TesteGeraPedidoObserver {

	public static void main(String[] args) {

		// Simulando pegando os dados, pode ser via web, desktop, linha comando
		String cliente = "Rodrigo";
		BigDecimal valor = new BigDecimal(100);
		int quantidade = 5;

		GeraPedido2 dados = new GeraPedido2(cliente, valor, quantidade);

		GeraPedidoHandler acao = new GeraPedidoHandler(Arrays.asList(
				new EnviarEmailPedido(), 
				new SalvarPedido())
				);
		acao.execute(dados);
	}
}
