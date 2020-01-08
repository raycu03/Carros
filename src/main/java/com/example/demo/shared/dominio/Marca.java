package com.example.demo.shared.dominio;

import com.example.demo.exceptions.TextoExceptions;

public class Marca {
	
	private final String marca;
	
	public Marca(String marca) {
		this.marca = marca;
		if (!marca.matches("[A-Z].*")) {
			throw new TextoExceptions();
		}
	}

}
