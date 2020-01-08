package com.example.demo.shared.dominio;

import com.example.demo.exceptions.TextoExceptions;

public class Modelo {
	
	private final String modelo;
	
	public Modelo(String modelo) {
		this.modelo = modelo;
		if (!modelo.matches("[A-Z].*")) {
			throw new TextoExceptions();
		}
		
	}

	public String getModelo() {
		return modelo;
	}
	
	

}
