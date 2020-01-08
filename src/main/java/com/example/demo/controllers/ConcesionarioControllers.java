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
import com.example.demo.application.ConcesionarioAplicacion;
import com.example.demo.dominio.services.ConcesionarioServices;
import com.example.demo.infraestructure.mapper.ConcesionarioMapper;
import com.example.demo.infraestructure.rest.ConcesionarioRest;

@RestController
@RequestMapping("/concesionario")
public class ConcesionarioControllers {
	
	private ConcesionarioAplicacion concesionarioAplicacion;
	
	public ConcesionarioControllers(@Autowired ConcesionarioServices concesionarioServices,
			@Autowired ConcesionarioMapper concesionarioMapper)
	{
		this.concesionarioAplicacion = new ConcesionarioAplicacion(concesionarioServices, concesionarioMapper);
	}
	
	@PostMapping
	public ConcesionarioRest guardar (@RequestBody ConcesionarioRest concesionario){
		return concesionarioAplicacion.guardar(concesionario);
		
	}
	
	@GetMapping
	public List<ConcesionarioRest> mostrasTodos(){
		
		return concesionarioAplicacion.mostrarTodos();
	}
	
	@GetMapping("/{codigo}")
	public ConcesionarioRest mostrarUno (@PathVariable String codigo){
		
		return concesionarioAplicacion.buscar(codigo);
	}
	
	
	
}
