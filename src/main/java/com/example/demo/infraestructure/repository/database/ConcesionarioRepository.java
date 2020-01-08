package com.example.demo.infraestructure.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dominio.model.Concesionario;
import com.example.demo.infraestructure.dto.ConcesionarioDto;


public interface ConcesionarioRepository extends JpaRepository<ConcesionarioDto, String>{

}
