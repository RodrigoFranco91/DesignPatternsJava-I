package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedido;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	//Receber no seu construtor (inje��o de dependencias) o repository, service, etc, 
	// para executar as a��es.
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes){
		this.acoes = acoes;
	}
	
	public void execute(GeraPedido2 dados) {
		
		Orcamento orcamento = new Orcamento(dados.getValor(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getNome(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> {
			a.executarAcao(pedido);
		});
		
		//A��es - Estamos desconsiderante a Inje��o de Dependencias, pois estamos sem Spring neste exemplo:
		//EnviarEmailPedido email = new EnviarEmailPedido();
		//SalvarPedido dao = new SalvarPedido();
		
		//email.execute(pedido);
		//dao.execute(pedido);
		
	}

}
