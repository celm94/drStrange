package com.example.demo.Entidades;

import javax.persistence.*;


@Entity
@Table(name="Pacientes")

public class Pacientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "nombre")
    private String Nombre;
    @Column(name= "segundonombre")
    private String SegundoNombre;
    @Column(name= "apellido")
    private String Apellido;
    @Column(name= "segundoapellido")
    private String SegundoApellido;
    @Column(name= "edad")
    private Long edad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        SegundoNombre = segundoNombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public Long getEdad() {
        return edad;
    }

    public void setEdad(Long edad) {
        this.edad = edad;
    }
}
