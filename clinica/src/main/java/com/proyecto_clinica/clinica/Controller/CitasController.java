package com.proyecto_clinica.clinica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto_clinica.clinica.model.Entidades.Citas;
import com.proyecto_clinica.clinica.model.Service.ICitasService;

@Controller
@RequestMapping("/dashboard/citas")
public class CitasController {
    
    @Autowired
    private ICitasService citasService;


    @RequestMapping("/")
    public String citas(Model model){
        Citas citas = new Citas();
        
        model.addAttribute("citas", citas);
        model.addAttribute("listaCitas", citasService.listarCitas());


        return "Dashboard/Secciones/Citas";
    }
}
