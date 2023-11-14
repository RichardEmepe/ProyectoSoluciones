package com.proyecto_clinica.clinica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard/solicitudes")
public class SolicitudesController {
    
    @RequestMapping("/")
    public String soli(Model model){

        return "Dashboard/Secciones/Solicitudes";
    }
}
