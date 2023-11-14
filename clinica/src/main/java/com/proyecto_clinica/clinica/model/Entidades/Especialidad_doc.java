package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESPECIALIDAD_DOCTORES")
public class Especialidad_doc implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ESPEC_DOC")
    private long ESPEC_DOC;

    @Column(name = "ESPECIALIDAD")
    private String Especialidad;

    public long getESPEC_DOC() {
        return ESPEC_DOC;
    }

    public void setESPEC_DOC(long eSPEC_DOC) {
        ESPEC_DOC = eSPEC_DOC;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    
}
