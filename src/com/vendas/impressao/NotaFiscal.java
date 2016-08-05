package com.vendas.impressao;

import java.math.BigDecimal;
import java.text.NumberFormat;

import com.vendas.caixa.Compra;

public class NotaFiscal implements Imprimivel{

	private Compra compra;
	
	public NotaFiscal(Compra compra)
	{
		this.compra = compra;
	}
	
	@Override
	public String getCabecalhoPagina() {
		
		StringBuilder sb = new StringBuilder("------------------ \n");
		
		compra.getListaProdutos().forEach(produto ->{
			sb.append("Nome do produto: "+produto.getNome()+" -> Valor: " + produto.getValor()+"\n");
		});
		
		sb.append("------------------");
		
		return sb.toString();
	}

	@Override
	public String getCorpoPagina() {
		
		BigDecimal valorTotal = compra.getValorTotal();
		String valorFormatado = NumberFormat.getCurrencyInstance().format(valorTotal);
		
		String txt = "Nome do cliente: "+compra.getCliente().getNome() +"\nValorTotal: " + valorFormatado;
		
		return txt;
	}
}
