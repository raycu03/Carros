package com.example.demo.application;

import java.util.List;

import com.example.demo.dominio.services.CarroServices;
import com.example.demo.infraestructure.mapper.CarroMapper;
import com.example.demo.infraestructure.rest.CarroRest;
import com.example.demo.shared.dominio.Codigo;

public class CarroAplicacion {
	private CarroServices carroServices;
	private CarroMapper carroMapper;
	
	public CarroAplicacion(CarroServices carroServices, CarroMapper carroMapper) {
		this.carroServices = carroServices;
		this.carroMapper = carroMapper;
	}
	
	public CarroRest guardar(CarroRest carro) {
		carroServices.guardar(carroMapper.dtoDominio(carro));
		return carro;
	}
	
	public List<CarroRest> mostrarTodos(){
		List<CarroRest> carros = carroMapper.dominiodto(carroServices.bucarTodos());
		return carros;
	}
	
	public CarroRest buscarCarro(String codigo) {
		CarroRest carro = carroMapper.dominiodto(carroServices.bucarCarro(new Codigo(codigo)));
		return carro;
		
	}

}
