package com.vendas.caixa;

import com.vendas.cartao.Cartao;
import com.vendas.impressao.Impressora;
import com.vendas.impressao.Imprimivel;
import com.vendas.pagamento.Operadora;

public class FecharCompra {

	private Operadora operadora;
	private Impressora impressora;

	public FecharCompra(Operadora operadora, Impressora impressora)
	{
		this.operadora = operadora;
		this.impressora = impressora;
	}
	
	public void fechar(Imprimivel imprimivel, Compra compra, Cartao cartao)
	{
		boolean autorizado = this.operadora.autorizar(compra, cartao);
		
		if (autorizado)		
			this.impressora.imprimir(imprimivel);
		else
			System.out.println("Pagamento negado!");
	}
}
