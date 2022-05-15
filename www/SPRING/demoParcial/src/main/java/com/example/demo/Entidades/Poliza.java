package com.example.demo.Entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="polizas")

public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoliza;

    @Column(name= "idcliente")
    private String idCliente;
    @Column(name= "estado")
    private String Estado;
    @Column(name= "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date createAt;
    @Column(name= "fechafin")
    @Temporal(TemporalType.DATE)
    private Date creatAt;


    public Long getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Long idPoliza) {
        this.idPoliza = idPoliza;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getCreatAt() {
        return creatAt;
    }

    public void setCreatAt(Date creatAt) {
        this.creatAt = creatAt;
    }
}
