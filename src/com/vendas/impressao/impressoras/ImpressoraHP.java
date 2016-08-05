package com.vendas.impressao.impressoras;

import com.vendas.impressao.Impressora;
import com.vendas.impressao.Imprimivel;

public class ImpressoraHP implements Impressora{

	@Override
	public void imprimir(Imprimivel imprimivel) {
		System.out.println("---------- INICIO ----------");
		System.out.println(imprimivel.getCabecalhoPagina());
		System.out.println("----------------------------");
		System.out.println(imprimivel.getCorpoPagina());
		System.out.println("----------------------------");
		System.out.println("----------- FIM ------------");
	}
}
