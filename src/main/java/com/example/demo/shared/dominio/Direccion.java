package com.example.demo.shared.dominio;

import com.example.demo.exceptions.TextoExceptions;

public class Direccion {
	
	private final String direccion;
	
	public Direccion(String direccion) {
		this.direccion = direccion;
		
		if (!direccion.matches("[A-Z].*")) {
			throw new TextoExceptions();
		}
	}

	public String getDireccion() {
		return direccion;
	}
	
}
