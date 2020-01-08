package com.example.demo.infraestructure.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.model.Concesionario;
import com.example.demo.dominio.services.ConcesionarioServices;
import com.example.demo.exceptions.NotFound;
import com.example.demo.infraestructure.mapper.ConcesionarioMapper;
import com.example.demo.infraestructure.repository.database.ConcesionarioRepository;
import com.example.demo.shared.dominio.Codigo;

@Service
public class ConcesionarioAdapters implements ConcesionarioServices{

	@Autowired
	public ConcesionarioRepository concesionarioRepository;
	
	@Autowired
	public ConcesionarioMapper concesionarioMapper;
	
	@Override
	public Concesionario guardar(Concesionario concesionario) {
		concesionarioRepository.save(concesionarioMapper.dominiodto(concesionario));
		
		return concesionario;
		
	}

	@Override
	public List<Concesionario> buscarTodos() {
		return concesionarioMapper.dtoDominio(concesionarioRepository.findAll());
	}

	@Override
	public Concesionario buscarConcesionario(Codigo codigo) {
		Concesionario concesionario = concesionarioMapper.dtoDominio(concesionarioRepository.findById(codigo.getCodigo()).orElseThrow(()-> new NotFound()));
		return concesionario;
	}

}
