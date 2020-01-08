package com.example.demo.dominio.services;

import java.util.List;

import com.example.demo.dominio.model.Concesionario;
import com.example.demo.shared.dominio.Codigo;

public interface ConcesionarioServices {
	
	public Concesionario guardar (Concesionario concesionario);
	
	public List<Concesionario> buscarTodos();
	
	public Concesionario buscarConcesionario(Codigo codigo);

}
