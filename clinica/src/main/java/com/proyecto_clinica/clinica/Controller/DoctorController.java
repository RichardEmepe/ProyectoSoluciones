package com.proyecto_clinica.clinica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto_clinica.clinica.model.DAO.IEspec_docDAO;
import com.proyecto_clinica.clinica.model.Entidades.Doctor;
import com.proyecto_clinica.clinica.model.Service.IService.IDoctorService;

@Controller
@RequestMapping("/dashboard/doctores")
public class DoctorController {

    @Autowired
    private IDoctorService doctorService;

    @Autowired
    private IEspec_docDAO espec_docDAO;

    @RequestMapping("/")
    public String doctores(Model model){
        Doctor doctor = new Doctor();

        model.addAttribute("doctor", doctor);
        model.addAttribute("listarDoctores", doctorService.listarDoctores());
        model.addAttribute("listadoEspecialidad", espec_docDAO.findAll());
        return "Dashboard/Secciones/Doctores";

    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String registrarDoctor(Doctor doctor){
        doctorService.registrarDoctor(doctor);

        return "redirect:/dashboard/doctores/";
    }
    
    @RequestMapping("/delete/{DNI_DOCTOR}")
    public String delete(@PathVariable(value = "DNI_DOCTOR") Long DNI_DOCTOR){
        doctorService.eliminarDoctor(DNI_DOCTOR);
        return "redirect:/dashboard/doctores/";
    }

}
