package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor implements Serializable{
    @Id
    @Column(name = "DNI_DOCTOR")
    private Long DNI_DOCTOR;

    @Column(name = "Nombres")
    private String Nombres;
    
    @Column(name = "Apellidos")
    private String Apellidos;
    
    @OneToOne
    @JoinColumn(name = "ESPEC_DOC")
    private Especialidad_doc especialidad_doc;

    public Long getDNI_DOCTOR() {
        return DNI_DOCTOR;
    }

    public void setDNI_DOCTOR(Long dNI_DOCTOR) {
        DNI_DOCTOR = dNI_DOCTOR;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Especialidad_doc getEspecialidad_doc() {
        return especialidad_doc;
    }

    public void setEspecialidad_doc(Especialidad_doc especialidad_doc) {
        this.especialidad_doc = especialidad_doc;
    }

    

}
