package com.proyecto_clinica.clinica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto_clinica.clinica.model.Entidades.Citas;
import com.proyecto_clinica.clinica.model.Service.ICitasService;
import com.proyecto_clinica.clinica.model.Service.IDoctorService;

@Controller
@RequestMapping("/dashboard/citas")
public class CitasController {
    
    @Autowired
    private ICitasService citasService;

    @Autowired
    private IDoctorService doctorService;


    @RequestMapping("/")
    public String citas(Model model){
        Citas citas = new Citas();
        
        model.addAttribute("citas", citas);
        model.addAttribute("listaCitas", citasService.listarCitas());
        model.addAttribute("listaDoctores", doctorService.listarDoctores());
        return "Dashboard/Secciones/Citas";

        


        // public String listarElementos(Model model) {
        //     List<Elemento> elementos = elementoRepository.findAll()
        //         .stream()
        //         .filter(elemento -> elemento.getNombre() != null && elemento.getDescripcion() != null)
        //         .collect(Collectors.toList());
        //     model.addAttribute("elementos", elementos);
        //     return "lista_elementos";
        // }
    }

    @RequestMapping(value = "/asignardoctor", method = RequestMethod.POST)
    public String asignarDoctor(Citas citas){
        citasService.registrarCita(citas);
        
        return "redirect:/dashboard/citas/";
    }
}
