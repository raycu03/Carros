package com.example.demo.infraestructure.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dominio.model.Concesionario;
import com.example.demo.infraestructure.dto.ConcesionarioDto;
import com.example.demo.infraestructure.rest.ConcesionarioRest;
import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Direccion;
import com.example.demo.shared.dominio.Gerente;
import com.example.demo.shared.dominio.Nombre;
import com.example.demo.shared.infraestructure.MapperApiRest;
import com.example.demo.shared.infraestructure.MapperRepository;

@Component
public class ConcesionarioMapper implements MapperApiRest<Concesionario, ConcesionarioRest>, MapperRepository<Concesionario, ConcesionarioDto>{

	@Autowired
	private CarroMapper carroMapper;
	
	@Override
	public Concesionario dtoDominio(ConcesionarioDto o) {
		
		return Concesionario.of(new Codigo(o.getCodigo()), new Nombre(o.getNombre()), new Direccion(o.getDireccion()), new Gerente(o.getGerente()),
				carroMapper.dtoDominioapi(o.getCarros()));
	}

	@Override
	public ConcesionarioDto dominiodto(Concesionario i) {
		ConcesionarioDto cc = new ConcesionarioDto();
		cc.setCodigo(i.getCodigo().getCodigo());
		cc.setNombre(i.getNombre().getNombre());
		cc.setDireccion(i.getDireccion().getDireccion());
		cc.setGerente(i.getGerente().getGerente());
		carroMapper.dominiodto(i.getCarros());
		return cc;
	}
	
	@Override
	public Concesionario dtoDominioapi(ConcesionarioRest o) {
		
		return Concesionario.of(new Codigo(o.getCodigo()), new Nombre(o.getNombre()),new Direccion(o.getDireccion()),new Gerente(o.getGerente()),
				carroMapper.dtoDominioapi(o.getCarros()));
	}

	@Override
	public ConcesionarioRest dominiodtoapi(Concesionario i) {
		ConcesionarioRest cc = new ConcesionarioRest();
		cc.setCodigo(i.getCodigo().getCodigo());
		cc.setNombre(i.getNombre().getNombre());
		cc.setDireccion(i.getDireccion().getDireccion());
		cc.setGerente(i.getGerente().getGerente());
		carroMapper.dominiodto(i.getCarros());
		return cc;
	}



}
