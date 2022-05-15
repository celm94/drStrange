package com.example.demo.Services;

import com.example.demo.Entidades.Pacientes;
import com.example.demo.dao.PacientesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesServicesImpl implements PacientesService{

    @Autowired
    PacientesDao pacientesDao;

    /*@Override
    public List<Pacientes> Listar() {
        return null;
    }*/

    @Override
    public List<Pacientes> findAll() {
        return (List<Pacientes>) pacientesDao.findAll();
    }

    @Override
    public Pacientes findById(Long id) {
        return pacientesDao.findById(id).orElse(null);
    }

    @Override
    public void modifyPaciente(Long id, Pacientes pacientes) {
        if(pacientesDao.existsById(id)){
            pacientes.setId(id);
            pacientesDao.save(pacientes);
        }

    }

    @Override
    public void deletePaciente(Long id) {
        if(pacientesDao.existsById(id)){
            pacientesDao.deleteById(id);
        }
    }

    /*@Override
    public void deleteById(Long id) {

    }*/
}
