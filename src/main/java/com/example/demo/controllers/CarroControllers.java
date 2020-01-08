package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.CarroAplicacion;
import com.example.demo.dominio.services.CarroServices;
import com.example.demo.infraestructure.mapper.CarroMapper;
import com.example.demo.infraestructure.repository.adapters.CarroAdapters;
import com.example.demo.infraestructure.rest.CarroRest;



@RestController
@RequestMapping("/carro")
public class CarroControllers {
	
	private CarroAplicacion carroAplicacion;
	
	public CarroControllers(@Autowired CarroServices carroServices,
			@Autowired CarroMapper carroMapper) {
		this.carroAplicacion = new CarroAplicacion(carroServices, carroMapper);
		
	}
	
	@PostMapping
	public CarroRest guardaRest (@RequestBody CarroRest carro) {
		return carroAplicacion.guardar(carro);
	}
	
	@GetMapping
	public List<CarroRest> mostrarTodo(){
		
		return carroAplicacion.mostrarTodos();
	}
	
	@GetMapping("/{codigo}")
	public CarroRest mostraruno (@PathVariable String codigo) {
		
		return carroAplicacion.buscarCarro(codigo);
	}

}
