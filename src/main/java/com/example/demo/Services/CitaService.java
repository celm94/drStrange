package com.example.demo.Services;

import com.example.demo.Entidades.Cita;
import com.example.demo.Entidades.Pacientes;

import java.util.List;

public interface CitaService {

    public List<Cita> findAll();
    public Cita findById(Long id);
    public void agendarCita(Cita cita);
    public void aceptarCita(String estado, Long id);
    public void borrarCita(Long id);


}
