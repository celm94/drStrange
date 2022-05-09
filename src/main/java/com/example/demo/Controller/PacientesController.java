package com.example.demo.Controller;


import com.example.demo.Entidades.Pacientes;
import com.example.demo.Services.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {
     @Autowired
    PacientesService pacientesService;

     @GetMapping
     public List<Pacientes> Listar(){
         return pacientesService.findAll();
     }
    @GetMapping(value = "/{id}")
     public Pacientes obtenerPacientes(@PathVariable Long id){
         return pacientesService.findById(id);
     }

     @PutMapping("/{id}")
    public void modifyPaciente(@PathVariable Long id, @RequestBody Pacientes pacientes)
     {
         pacientesService.modifyPaciente(id, pacientes);
     }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id){
         pacientesService.deletePaciente(id);
    }




}
