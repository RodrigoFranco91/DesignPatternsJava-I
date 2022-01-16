package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

//Usada para o Padrão Command (Somente Command)
public class GeraPedido {
	
	private String nome;
	private BigDecimal valor;
	private int quantidadeItens;
	
	//Receberiamos ainda o ServiceEmail, PedidoRepository e tudo mais para executar as ações
	public GeraPedido(String nome, BigDecimal valor, int quantidadeItens) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}
	
	public void executa() {
		
		Orcamento orcamento = new Orcamento(this.valor, this.quantidadeItens);
		String cliente = nome;
		Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);
		
		//Ações:
		System.out.println("Salvando Pedido no banco de dados");
		System.out.println("Enviando email ao cliente.");
		
	}

}
