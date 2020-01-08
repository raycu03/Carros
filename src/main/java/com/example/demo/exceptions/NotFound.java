package com.example.demo.exceptions;

public class NotFound extends RuntimeException{
	
	public NotFound() {
		super("Registro no encontrado");
	}

}
