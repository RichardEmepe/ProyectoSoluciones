package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Paciente")
public class Paciente implements Serializable{
    @Id
    @Column(name = "DNI")
    private String DNI;

    @Column(name = "Nombres")
    private String Nombres;

    @Column(name = "Apellidos")
    private String Apellidos;

    @Column(name = "Telefono")
    private String Telefono;

    @Column(name = "Passw")
    private String Passw;

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

    public String getPassw() {
        return Passw;
    }

    public void setPassw(String passw) {
        Passw = passw;
    }

}
