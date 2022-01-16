import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.Pedido;

public class TestePedidos {
	
	public static void main(String[] args) {

		//Simulando pegando os dados, pode ser via web, desktop, linha comando
		String cliente = "Rodrigo";
		BigDecimal valor = new BigDecimal(100);
		int quantidade = 5;
		
		GeraPedido geradorPedido = new GeraPedido(cliente, valor, quantidade);
		geradorPedido.executa();
		
	}
}
