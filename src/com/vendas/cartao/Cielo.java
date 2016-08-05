package com.vendas.cartao;

public class Cielo implements Cartao {

	private String nome;
	private String numero;
	
	public Cielo(String nome, String numero)
	{
		this.nome = nome;
		this.numero = numero;
	}
	
	@Override
	public String titular() {		
		return this.nome;
	}

	@Override
	public String numero() {
		return this.numero;
	}
}
