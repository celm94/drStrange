package com.example.demo.dao;

import com.example.demo.Entidades.Cita;
import org.springframework.data.repository.CrudRepository;

public interface CitaDao extends CrudRepository<Cita, Long>{

    void aceptarCita(String estado, Long id);
}
