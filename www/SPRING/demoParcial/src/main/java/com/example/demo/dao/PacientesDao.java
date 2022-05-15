package com.example.demo.dao;

import com.example.demo.Entidades.Pacientes;
import org.springframework.data.repository.CrudRepository;

public interface PacientesDao extends CrudRepository<Pacientes, Long> {

}
