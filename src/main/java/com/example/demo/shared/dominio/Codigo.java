package com.example.demo.shared.dominio;

import com.example.demo.exceptions.CodigoMayor;

public class Codigo {
	
	private final String codigo;
	
	public Codigo(String codigo) {
		
		this.codigo = codigo;
		if ( codigo.length() >1000) {
			
			throw new CodigoMayor();
		}
	}

	public String getCodigo() {
		return codigo;
	}
	
}
