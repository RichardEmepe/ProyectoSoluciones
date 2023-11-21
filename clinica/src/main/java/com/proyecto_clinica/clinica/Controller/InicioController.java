package com.proyecto_clinica.clinica.Controller;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto_clinica.clinica.model.Entidades.Solicitudes;
import com.proyecto_clinica.clinica.model.Service.IService.ISolicitudService;

@Controller
@RequestMapping("/inicio")
public class InicioController {

    @Autowired
    private ISolicitudService solicitudService;
    
    @RequestMapping("/")
    public String inicio(Model model){
        Solicitudes solicitud = new Solicitudes();
        model.addAttribute("solicitud", solicitud);

        return "inicio/index";
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String enviarSolicitud(Solicitudes solicitudes){
        solicitudes.setFECHA_SOLICITUD(LocalDateTime.now());

        solicitudService.registrarSolicitud(solicitudes);
        return "redirect:/inicio/#contact";
    }
}
