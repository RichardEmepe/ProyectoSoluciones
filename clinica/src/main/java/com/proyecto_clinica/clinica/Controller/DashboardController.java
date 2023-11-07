package com.proyecto_clinica.clinica.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

    @RequestMapping("/")
    public String dashboard(){
        return "Dashboard/Secciones/Principal";
    }
    
    @RequestMapping("/citas")
    public String dashCitas(){
        return "Dashboard/Secciones/Citas";
    }
}
