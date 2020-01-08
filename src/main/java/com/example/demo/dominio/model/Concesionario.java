package com.example.demo.dominio.model;

import java.util.List;

import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Direccion;
import com.example.demo.shared.dominio.Gerente;
import com.example.demo.shared.dominio.Nombre;

public class Concesionario {
	
	private final Codigo codigo;
	private final Nombre nombre;
	private final Direccion direccion;
	private final Gerente gerente;
	private final List<Carro> carros;
	
	public Concesionario(Codigo codigo, Nombre nombre, Direccion direccion, Gerente gerente, List<Carro> carros) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.gerente = gerente;
		this.carros = carros;
	}
	public Codigo getCodigo() {
		return codigo;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public List<Carro> getCarros() {
		return carros;
	}
	public static Concesionario of(Codigo codigo, Nombre nombre, Direccion direccion, Gerente gerente,
			List<Carro> carros) {
	
		return new Concesionario(codigo, nombre, direccion, gerente, carros);
	}
	
	
}
