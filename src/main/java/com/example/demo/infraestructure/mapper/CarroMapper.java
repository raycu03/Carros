package com.example.demo.infraestructure.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dominio.model.Carro;
import com.example.demo.infraestructure.dto.CarroDto;
import com.example.demo.infraestructure.rest.CarroRest;
import com.example.demo.shared.dominio.Anio;
import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Modelo;
import com.example.demo.shared.dominio.Nombre;
import com.example.demo.shared.dominio.Valor;
import com.example.demo.shared.infraestructure.MapperApiRest;
import com.example.demo.shared.infraestructure.MapperRepository;

@Component
public class CarroMapper implements MapperApiRest<Carro, CarroDto>, MapperRepository<Carro, CarroRest>{

	
	@Override
	public Carro dtoDominioapi(CarroDto o) {
		return Carro.of(new Codigo(o.getCodigo()), new Modelo(o.getModelo())
				, new Valor(o.getValor()), new Anio( o.getAnio()));
		
	}

	@Override
	public CarroDto dominiodtoapi(Carro i) {
		CarroDto cd = new CarroDto();
		cd.setCodigo(i.getCodigo().getCodigo());
		cd.setModelo(i.getModelo().getModelo());
		cd.setValor(i.getValor().getValor());
		cd.setAnio(i.getAnio().getAnio());
		
		return cd;
	
	}
	

	@Override
	public Carro dtoDominio(CarroRest o) {
		 return Carro.of(new Codigo(o.getCodigo()), new Modelo(o.getModelo())
				, new Valor(o.getValor()), new Anio( o.getAnio()));
	}

	@Override
	public CarroRest dominiodto(Carro i) {
		CarroRest cd = new CarroRest();
		cd.setCodigo(i.getCodigo().getCodigo());
		cd.setModelo(i.getModelo().getModelo());
		cd.setValor(i.getValor().getValor());
		cd.setAnio(i.getAnio().getAnio());
		
		return cd;
	}



	
}
