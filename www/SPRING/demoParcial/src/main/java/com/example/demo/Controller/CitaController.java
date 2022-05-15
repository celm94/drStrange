package com.example.demo.Controller;

import com.example.demo.Entidades.Cita;
import com.example.demo.Entidades.Pacientes;
import com.example.demo.Services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    CitaService citaService;

    @GetMapping
    public List<Cita> Listar(){
        return citaService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Cita obtenerCita(@PathVariable Long id){
        return citaService.findById(id);
    }

    @PostMapping()
    public void agendarCita(@RequestBody Cita cita){
        cita.setId(0L);
        citaService.agendarCita(cita);
    }

    /*@PutMapping(value = "{id}")
    public void aceptarCita(@PathVariable Long id, @RequestParam(value ="estado", defaultValue="Aceptada")String estado){
        citaService.aceptarCita(estado, id);
    }*/

    @DeleteMapping("/{id}")
    public void borrarCita(@PathVariable Long id){
        citaService.borrarCita(id);
    }

}
