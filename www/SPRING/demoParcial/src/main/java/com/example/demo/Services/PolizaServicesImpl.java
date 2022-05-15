package com.example.demo.Services;

import com.example.demo.Entidades.Poliza;
import com.example.demo.dao.PolizaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolizaServicesImpl implements PolizaService{

    @Autowired
    PolizaDao polizaDao;

    @Override
    public List<Poliza> findAll() {
        return (List<Poliza>) polizaDao.findAll();
    }

    @Override
    public Poliza findById(Long id) {
        return polizaDao.findById(id).orElse(null);
    }

    @Override
    public void modifyPoliza(Long id, Poliza poliza) {
        if(polizaDao.existsById(id)){
            poliza.setIdPoliza(id);
            polizaDao.save(poliza);
        }
    }
    @Override
    public void deletePoliza(Long id) {
        if(polizaDao.existsById(id)){
            polizaDao.deleteById(id);
        }

    }
}
