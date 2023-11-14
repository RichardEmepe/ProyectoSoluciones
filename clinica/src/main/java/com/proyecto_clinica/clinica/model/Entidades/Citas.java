package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Citas")
public class Citas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NRO_CITA")
    private Long NRO_CITA;

    @Column(name = "Fecha")
    private String Fecha;

    @Column(name = "Hora")
    private String Hora;

    @OneToOne
    @JoinColumn(name = "ESPEC_ATEN")
    private Especialidad_aten especialidad_aten;

    @OneToOne
    @JoinColumn(name = "DNI_DOCTOR")
    private Doctor doctor;

    @OneToOne
    @JoinColumn(name = "DNI_PACIENTE")
    private Paciente paciente;

    public Long getNRO_CITA() {
        return NRO_CITA;
    }

    public void setNRO_CITA(Long nRO_CITA) {
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

    public Especialidad_aten getEspecialidad_aten() {
        return especialidad_aten;
    }

    public void setEspecialidad_aten(Especialidad_aten especialidad_aten) {
        this.especialidad_aten = especialidad_aten;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
    
}
