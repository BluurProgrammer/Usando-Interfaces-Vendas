package com.vendas.teste;

import java.math.BigDecimal;

import com.vendas.caixa.Compra;
import com.vendas.caixa.FecharCompra;
import com.vendas.cartao.Cartao;
import com.vendas.cartao.Cielo;
import com.vendas.impressao.Impressora;
import com.vendas.impressao.Imprimivel;
import com.vendas.impressao.NotaFiscal;
import com.vendas.impressao.impressoras.ImpressoraHP;
import com.vendas.model.Cliente;
import com.vendas.model.Produto;
import com.vendas.pagamento.BancoDoBrasil;
import com.vendas.pagamento.Operadora;

public class Teste {
	
	public static void main(String[] args) {
				
		Cliente cliente = new Cliente("Matheus");
		
		Produto produto1 = new Produto("Monitor LED 23\"", new BigDecimal("550.0"), 1);		
		Produto produto2 = new Produto("Notebook Asus", new BigDecimal("2000.0"), 1);
		Produto produto3 = new Produto("Tablet DL X", new BigDecimal("290.0"), 1);
		
		Compra compra = new Compra(cliente);
		compra.addProduto(produto1);
		compra.addProduto(produto2);
		compra.addProduto(produto3);
					
		Operadora operadora = new BancoDoBrasil();
		
		Cartao cartao = new Cielo("Matheus Serrao", "123456");
		
		Impressora impressora = new ImpressoraHP();
			
		FecharCompra fecharCompra = new FecharCompra(operadora, impressora);
		
		Imprimivel notaFiscal = new NotaFiscal(compra);
		
		fecharCompra.fechar(notaFiscal, compra, cartao);
			
	}
}
