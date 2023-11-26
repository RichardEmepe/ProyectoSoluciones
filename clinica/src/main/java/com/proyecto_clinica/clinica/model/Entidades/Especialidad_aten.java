package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESPECIALIDAD_ATENCION")
public class Especialidad_aten implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ESPEC_ATEN")
    private long ESPEC_ATEN;

    @Column(name = "ESPECIALIDAD")
    private String Especialidad;

    public long getESPEC_ATEN() {
        return ESPEC_ATEN;
    }

    public void setESPEC_ATEN(long eSPEC_ATEN) {
        ESPEC_ATEN = eSPEC_ATEN;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    
}
