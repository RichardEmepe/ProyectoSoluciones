package com.proyecto_clinica.clinica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto_clinica.clinica.model.Entidades.Solicitudes;
import com.proyecto_clinica.clinica.model.Service.IService.ISolicitudService;

@Controller
@RequestMapping("/dashboard/solicitudes")
public class SolicitudesController {

    @Autowired
    private ISolicitudService solicitudService;

    @RequestMapping("/")
    public String soli(Model model){
        Solicitudes solicitud = new Solicitudes();
        
        model.addAttribute("solicitud", solicitud);
        model.addAttribute("listaSolicitudes", solicitudService.listarSolicitudes());

        return "Dashboard/Secciones/Solicitudes";
    }

    

}
