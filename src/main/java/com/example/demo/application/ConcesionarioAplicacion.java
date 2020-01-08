package com.example.demo.application;

import java.util.List;

import com.example.demo.dominio.services.ConcesionarioServices;
import com.example.demo.infraestructure.mapper.ConcesionarioMapper;
import com.example.demo.infraestructure.rest.ConcesionarioRest;
import com.example.demo.shared.dominio.Codigo;

public class ConcesionarioAplicacion {
	private ConcesionarioServices concesionarioServices;
	private ConcesionarioMapper concesionarioMapper;
	
	public ConcesionarioAplicacion(ConcesionarioServices concesionarioServices, ConcesionarioMapper concesionarioMapper ) {
		this.concesionarioServices = concesionarioServices;
		this.concesionarioMapper = concesionarioMapper;
	}
	
	public ConcesionarioRest guardar(ConcesionarioRest concesionario) {
	
		concesionarioServices.guardar(concesionarioMapper.dtoDominioapi(concesionario));
		
		return concesionario;
	}
	
	public List<ConcesionarioRest> mostrarTodos(){
		
		List<ConcesionarioRest> Concesionario = concesionarioMapper.dominiodtoapi(concesionarioServices.buscarTodos());
		return Concesionario;
	}
	
	public ConcesionarioRest buscar(String codigo) {
		
		ConcesionarioRest concesionario = concesionarioMapper.dominiodtoapi(concesionarioServices.buscarConcesionario(new Codigo(codigo)));
		
		return concesionario;
	}

}
