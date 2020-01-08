package com.example.demo.infraestructure.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.infraestructure.dto.CarroDto;

public interface CarroRepository extends JpaRepository<CarroDto, String>{

}
