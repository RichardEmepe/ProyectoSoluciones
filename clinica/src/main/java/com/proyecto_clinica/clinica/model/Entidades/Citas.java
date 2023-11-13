package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Citas")
public class Citas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NRO_CITA")
    private String NRO_CITA;

    @Column(name = "Fecha")
    private String Fecha;

    @Column(name = "Hora")
    private String Hora;

    @Column(name = "Especialidad")
    private String Especialidad;

    @Column(name = "DNI_PACIENTE")
    private String DNI_PACIENTE;

    public String getNRO_CITA() {
        return NRO_CITA;
    }

    public void setNRO_CITA(String nRO_CITA) {
        NRO_CITA = nRO_CITA;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getDNI_PACIENTE() {
        return DNI_PACIENTE;
    }

    public void setDNI_PACIENTE(String dNI_PACIENTE) {
        DNI_PACIENTE = dNI_PACIENTE;
    }

    
    
}
