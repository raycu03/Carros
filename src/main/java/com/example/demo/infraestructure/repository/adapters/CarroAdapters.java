package com.example.demo.infraestructure.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.model.Carro;
import com.example.demo.dominio.services.CarroServices;
import com.example.demo.exceptions.NotFound;
import com.example.demo.infraestructure.mapper.CarroMapper;
import com.example.demo.infraestructure.repository.database.CarroRepository;
import com.example.demo.shared.dominio.Codigo;

@Service
public class CarroAdapters implements CarroServices{

	@Autowired
	public CarroRepository carroRepository;
	
	@Autowired
	public CarroMapper carroMapper;

	@Override
	public void guardar(Carro carro) {
		carroRepository.save(carroMapper.dominiodtoapi(carro));
		
	}

	@Override
	public List<Carro> bucarTodos() {
		return carroMapper.dtoDominioapi(carroRepository.findAll());
	}

	@Override
	public Carro bucarCarro(Codigo codigo) {
		Carro carro = carroMapper.dtoDominioapi(carroRepository.findById(codigo.getCodigo()).orElseThrow(()-> new NotFound()));
		return carro;
	}
}
