package com.vendas.pagamento;

import com.vendas.cartao.Cartao;

public interface Operadora {
	
	public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
