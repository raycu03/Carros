package com.example.demo.infraestructure.rest;

import java.util.List;

import com.example.demo.infraestructure.dto.CarroDto;

public class ConcesionarioRest {
	
	private String codigo;
	private String nombre;
	private String direccion;
	private String gerente;
	private List<CarroDto> carros;
	
	public ConcesionarioRest() {
		// TODO Auto-generated constructor stub
	}

	public ConcesionarioRest(String codigo, String nombre, String direccion, String gerente, List<CarroDto> carros) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.gerente = gerente;
		this.carros = carros;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public List<CarroDto> getCarros() {
		return carros;
	}

	public void setCarros(List<CarroDto> carros) {
		this.carros = carros;
	}
	
	

}
