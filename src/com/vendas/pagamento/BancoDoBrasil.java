package com.vendas.pagamento;

import com.vendas.cartao.Cartao;
import com.vendas.pagamento.Autorizavel;
import com.vendas.pagamento.Operadora;

public class BancoDoBrasil implements Operadora {

	@Override
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
		
		double limite = 3000.0;	// de cada cliente...
		
		boolean autorizado = cartao.numero().startsWith("123") && autorizavel.getValorTotal().doubleValue() < limite;		
		return autorizado;
	}
}
