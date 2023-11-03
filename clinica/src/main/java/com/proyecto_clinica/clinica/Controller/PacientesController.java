package com.proyecto_clinica.clinica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
public class PacientesController {
    
    @RequestMapping("/")
    public String clientes(){
        return "Dashboard/Pacientes";
    }
}
