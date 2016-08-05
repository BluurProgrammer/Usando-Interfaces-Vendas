package com.vendas.caixa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.vendas.model.Cliente;
import com.vendas.model.Produto;
import com.vendas.pagamento.Autorizavel;

public class Compra implements Autorizavel {

	private BigDecimal valorTotal;
	
	private Cliente cliente;
	private List<Produto> produtos;
	
	public Compra(Cliente cliente)
	{
		valorTotal= BigDecimal.ZERO;
		this.cliente = cliente;
		produtos = new ArrayList<>();
	}
	
	@Override
	public BigDecimal getValorTotal() {
		   
		 produtos.forEach(produto -> valorTotal = valorTotal.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade()))));	 		 
		 
		 return this.valorTotal;
	}
	
	
	// sem nenhuma verificação
	public void addProduto(Produto produto)
	{
		this.produtos.add(produto);
	}
	
	public List<Produto> getListaProdutos()
	{
		return this.produtos;
	}
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
}
