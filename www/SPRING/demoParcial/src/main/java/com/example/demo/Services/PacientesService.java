package com.example.demo.Services;
import com.example.demo.Entidades.Pacientes;
import java.util.List;

public interface PacientesService {


    //public List<Pacientes> Listar();
    public List<Pacientes> findAll();
    public Pacientes findById(Long id);
    public void modifyPaciente(Long id, Pacientes pacientes);
    public void deletePaciente(Long id);
    //public void deleteById(Long id);





}
