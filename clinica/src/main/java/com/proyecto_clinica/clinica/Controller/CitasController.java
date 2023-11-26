package com.proyecto_clinica.clinica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto_clinica.clinica.model.DAO.IEspec_atenDAO;
import com.proyecto_clinica.clinica.model.Entidades.Citas;
import com.proyecto_clinica.clinica.model.Entidades.Paciente;
import com.proyecto_clinica.clinica.model.Service.IService.ICitasService;
import com.proyecto_clinica.clinica.model.Service.IService.IDoctorService;

@Controller
@RequestMapping("/dashboard/citas")
public class CitasController {
    
    @Autowired
    private ICitasService citasService;

    @Autowired
    private IDoctorService doctorService;

    @Autowired
    private IEspec_atenDAO atenDAO;


    @RequestMapping("/")
    public String citas(Model model){
        Citas citas = new Citas();
        Paciente paciente = new Paciente();

        model.addAttribute("citas", citas);
        model.addAttribute("paciente", paciente);
        model.addAttribute("listaCitas", citasService.listarCitas());
        model.addAttribute("listaDoctores", doctorService.listarDoctores());
        model.addAttribute("listaEspecialidades", atenDAO.findAll());

        return "Dashboard/Secciones/Citas";
    }

    @RequestMapping(value = "/programarcita", method = RequestMethod.POST)
    public String programarCita(Citas citas){
        citasService.registrarCita(citas);
        
        return "redirect:/dashboard/citas/";
    }

    @RequestMapping(value = "/asignardoctor", method = RequestMethod.POST)
    public String asignarDoctor(Citas citas){
        citasService.registrarCita(citas);
        
        return "redirect:/dashboard/citas/";
    }

    @RequestMapping("/cancelar/{NRO_CITA}")
    public String cancelar(@PathVariable(value="NRO_CITA") Long NRO_CITA){
        citasService.cancelarCita(NRO_CITA);
        return "redirect:/dashboard/citas/";
    }
}
