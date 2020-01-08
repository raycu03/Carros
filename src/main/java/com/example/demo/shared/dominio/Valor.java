package com.example.demo.shared.dominio;

import com.example.demo.exceptions.ValorExceptions;

public class Valor {
	
	private final Double valor;
	
	public Valor(Double valor) {
		this.valor = valor;
		
		if(valor<0) {
			throw new ValorExceptions();
		}
	}

	public Double getValor() {
		return valor;
	}
	
	

}
