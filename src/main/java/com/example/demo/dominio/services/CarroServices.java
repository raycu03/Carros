package com.example.demo.dominio.services;

import java.util.List;

import com.example.demo.dominio.model.Carro;
import com.example.demo.shared.dominio.Codigo;

public interface CarroServices {
	
	public void guardar (Carro carro);
	
	public List<Carro> bucarTodos();
	
	public Carro bucarCarro (Codigo codigo);

}
