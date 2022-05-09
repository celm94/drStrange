package com.example.demo.Entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "fechacita")
    @Temporal(TemporalType.DATE)
    private Date fechaCita;

    @Column(name= "horacita")
    private String horaCita;

    @Column(name ="poliza")
    private Long poliza;

    @Column(name ="estado")
    private String estado;

    @Column(name ="observaciones")
    private String observaciones;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public Long getPoliza() {
        return poliza;
    }

    public void setPoliza(Long poliza) {
        this.poliza = poliza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
