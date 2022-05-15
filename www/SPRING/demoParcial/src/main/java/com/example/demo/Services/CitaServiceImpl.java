package com.example.demo.Services;

import com.example.demo.Entidades.Cita;
import com.example.demo.Entidades.Pacientes;
import com.example.demo.dao.CitaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService{


    @Autowired
    CitaDao citaDao;


    @Override
    public List<Cita> findAll() {
        return (List<Cita>) citaDao.findAll();
    }

    @Override
    public Cita findById(Long id) {
        return citaDao.findById(id).orElse(null);
    }

    @Override
    public void agendarCita(Cita cita) {
        citaDao.save(cita);

    }

    @Override
    public void aceptarCita(Long id) {

    }

    /*@Override
    public void aceptarCita(String estado, Long id) {
        if(citaDao.existsById(id)) citaDao.aceptarCita(estado, id);

    }*/
    @Override
    public void borrarCita(Long id) {
        if(citaDao.existsById(id)){
            citaDao.deleteById(id);
        }


    }
}
