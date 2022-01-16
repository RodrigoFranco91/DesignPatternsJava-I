package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GeraPedido2 {

	private String nome;
	private BigDecimal valor;
	private int quantidadeItens;

	public GeraPedido2(String nome, BigDecimal valor, int quantidadeItens) {
		this.nome = nome;
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

}
