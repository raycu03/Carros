package com.example.demo.exceptions;

public class ValorExceptions extends RuntimeException{
	
	public ValorExceptions() {
		super("El valor no puede ser negativo");
	}

}
