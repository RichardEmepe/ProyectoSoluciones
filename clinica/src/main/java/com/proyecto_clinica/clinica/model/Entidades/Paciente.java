package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Paciente")
public class Paciente implements Serializable{
    @Id
    // @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "DNI")
    private String DNI;

    @Column(name = "Nombres")
    private String Nombres;

    @Column(name = "Apellidos")
    private String Apellidos;

    @Column(name = "Telefono")
    private String Telefono;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    
    

}
