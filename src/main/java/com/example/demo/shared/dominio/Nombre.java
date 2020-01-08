package com.example.demo.shared.dominio;

import com.example.demo.exceptions.TextoExceptions;

public class Nombre {
	
	private final String nombre;
	
	public Nombre(String nombre) {
		this.nombre = nombre;
		
		if (!nombre.matches("[A-Z].*")) {
			throw new TextoExceptions();
		}
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
