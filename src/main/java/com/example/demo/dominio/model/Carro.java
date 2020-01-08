package com.example.demo.dominio.model;

import com.example.demo.shared.dominio.Anio;
import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Modelo;
import com.example.demo.shared.dominio.Nombre;
import com.example.demo.shared.dominio.Valor;

public class Carro {
	
	private final Codigo codigo;
	private final Modelo modelo;
	private final Valor valor;
	private final Anio anio;
	

	public Carro(Codigo codigo, Modelo modelo, Valor valor, Anio anio) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.valor = valor;
		this.anio = anio;
	}


	public Codigo getCodigo() {
		return codigo;
	}


	public Modelo getModelo() {
		return modelo;
	}


	public Valor getValor() {
		return valor;
	}


	public Anio getAnio() {
		return anio;
	}


	public static Carro of(Codigo codigo, Modelo modelo, Valor valor, Anio anio) {
		// TODO Auto-generated method stub
		return new Carro(codigo,  modelo,  valor,  anio);
	}
	
	
	
	

}
