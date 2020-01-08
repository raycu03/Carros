package com.example.demo.shared.dominio;

import com.example.demo.exceptions.TextoExceptions;

public class Gerente {
	
	private final String gerente;
	
	public Gerente(String gerente) {
		this.gerente = gerente;
		
		if (!gerente.matches("[A-Z].*")) {
			throw new TextoExceptions();
		}
	}

	public String getGerente() {
		return gerente;
	}
	
}
