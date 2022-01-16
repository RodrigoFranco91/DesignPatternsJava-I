import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedido2;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;

public class TestePedidos2 {
	
	public static void main(String[] args) {

		//Simulando pegando os dados, pode ser via web, desktop, linha comando
		String cliente = "Rodrigo";
		BigDecimal valor = new BigDecimal(100);
		int quantidade = 5;
		
		GeraPedido2 dados = new GeraPedido2(cliente, valor, quantidade);
		//GeraPedidoHandler acao = new GeraPedidoHandler(/*Enviaria as dependencias*/);
		//acao.execute(dados);
		
	}
}
