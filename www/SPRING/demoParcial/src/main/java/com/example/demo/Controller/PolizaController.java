package com.example.demo.Controller;

import com.example.demo.Entidades.Pacientes;
import com.example.demo.Entidades.Poliza;
import com.example.demo.Services.PolizaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/polizas")
public class PolizaController {
    @Autowired
    PolizaService polizaService;

    @GetMapping
    public List<Poliza> Listar(){
        return polizaService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Poliza obtenerPoliza(@PathVariable Long id){
        return polizaService.findById(id);
    }

    @PutMapping("/{id}")
    public void modifyPaoliza(@PathVariable Long id, @RequestBody Poliza poliza)
    {
        polizaService.modifyPoliza(id, poliza);
    }

    @DeleteMapping("/{id}")
    public void deletePoliza(@PathVariable Long id){
        polizaService.deletePoliza(id);
    }
}
