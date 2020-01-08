package com.example.demo.shared.dominio;

import com.example.demo.exceptions.AnioExceptions;

public class Anio {
	
	private final Integer anio;
	
	public Anio(Integer anio) {
		this.anio = anio;
		
		if(anio> 2022 || anio <1800) {
			
			throw new AnioExceptions();
			
		}
		
	}

	public Integer getAnio() {
		return anio;
	}
	
	

}
