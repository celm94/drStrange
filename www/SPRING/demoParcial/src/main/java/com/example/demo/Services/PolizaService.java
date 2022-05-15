package com.example.demo.Services;

import com.example.demo.Entidades.Pacientes;
import com.example.demo.Entidades.Poliza;

import java.util.List;

public interface PolizaService {

    public List<Poliza> findAll();
    public Poliza findById(Long id);
    public void modifyPoliza(Long id, Poliza poliza);
    public void deletePoliza(Long id);

}
