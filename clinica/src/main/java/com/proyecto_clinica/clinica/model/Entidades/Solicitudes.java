package com.proyecto_clinica.clinica.model.Entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Solicitudes")
public class Solicitudes implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NRO_SOLI")
    private long NRO_SOLI;

    @Column(name = "DNI_SOLICITANTE")
    private String DNI_SOLICITANTE;

    @Column(name = "NOMBRE_SOLICITANTE")
    private String NOMBRE_SOLICITANTE;

    @Column(name = "CORREO_SOLICITANTE")
    private String CORREO_SOLICITANTE;

    @Column(name = "TELEFONO_SOLICITANTE")
    private String TELEFONO_SOLICITANTE;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FECHA_SOLICITUD")
    private LocalDateTime FECHA_SOLICITUD;

    public long getNRO_SOLI() {
        return NRO_SOLI;
    }

    public void setNRO_SOLI(long nRO_SOLI) {
        NRO_SOLI = nRO_SOLI;
    }

    public String getDNI_SOLICITANTE() {
        return DNI_SOLICITANTE;
    }

    public void setDNI_SOLICITANTE(String dNI_SOLICITANTE) {
        DNI_SOLICITANTE = dNI_SOLICITANTE;
    }

    public String getNOMBRE_SOLICITANTE() {
        return NOMBRE_SOLICITANTE;
    }

    public void setNOMBRE_SOLICITANTE(String nOMBRE_SOLICITANTE) {
        NOMBRE_SOLICITANTE = nOMBRE_SOLICITANTE;
    }

    public String getCORREO_SOLICITANTE() {
        return CORREO_SOLICITANTE;
    }

    public void setCORREO_SOLICITANTE(String cORREO_SOLICITANTE) {
        CORREO_SOLICITANTE = cORREO_SOLICITANTE;
    }

    public String getTELEFONO_SOLICITANTE() {
        return TELEFONO_SOLICITANTE;
    }

    public void setTELEFONO_SOLICITANTE(String tELEFONO_SOLICITANTE) {
        TELEFONO_SOLICITANTE = tELEFONO_SOLICITANTE;
    }

    public LocalDateTime getFECHA_SOLICITUD() {
        return FECHA_SOLICITUD;
    }

    public void setFECHA_SOLICITUD(LocalDateTime fECHA_SOLICITUD) {
        FECHA_SOLICITUD = fECHA_SOLICITUD;
    }

    
}
