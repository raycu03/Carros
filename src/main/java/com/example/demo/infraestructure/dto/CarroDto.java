package com.example.demo.infraestructure.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="carros")
public class CarroDto {
	
	@Id
	private String codigo;
	private String modelo;
	private Double valor;
	private Integer anio;
	private String marca;
	
	public CarroDto() {
		// TODO Auto-generated constructor stub
	}

	public CarroDto(String codigo, String nombre, String modelo, Double valor, Integer anio, String marca) {
		super();
		this.codigo = codigo;
		this.modelo = modelo;
		this.valor = valor;
		this.anio = anio;
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
