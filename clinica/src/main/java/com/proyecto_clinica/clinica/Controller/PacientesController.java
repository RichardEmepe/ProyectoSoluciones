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
import com.proyecto_clinica.clinica.model.Service.IService.IPacienteService;

@Controller
@RequestMapping("/dashboard/pacientes")
public class PacientesController {
    
    @Autowired
    private IPacienteService pacienteService;

    @Autowired
    private ICitasService citasService;

    @Autowired
    private IEspec_atenDAO espec_atenDAO;

    @RequestMapping("/")
    public String clientes(Model model){
        Paciente paciente = new Paciente();
        Paciente pacienteBuscado = new Paciente();

        model.addAttribute("pacienteBuscado", pacienteBuscado);
        model.addAttribute("paciente", paciente);
        model.addAttribute("listaPacientes", pacienteService.listar());
        model.addAttribute("tablasRelacionadas", espec_atenDAO.findAll());

        return "Dashboard/Secciones/Pacientes";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String guardar(Paciente paciente){
        pacienteService.guardarPaciente(paciente);
        return "redirect:/dashboard/pacientes/";
    }

    @RequestMapping(value = "/registrarcita", method = RequestMethod.POST)
    public String registrarCita(Citas citas){
        citasService.registrarCita(citas);

        return "redirect:/dashboard/pacientes/";
    }

    @RequestMapping("/delete/{DNI}")
    public String delete(@PathVariable(value = "DNI") Long DNI){
        pacienteService.eliminarPaciente(DNI);
        return "redirect:/dashboard/pacientes/";
    }

    @RequestMapping(value = "/buscar", method = RequestMethod.POST)
    public String buscar(Long txtBuscarDNI, Model model){
        Paciente pacienteBuscado = new Paciente();
        Paciente paciente = new Paciente();


        if (txtBuscarDNI != null){
            pacienteBuscado = pacienteService.buscarPaciente(txtBuscarDNI);
            if (pacienteBuscado == null){
                pacienteBuscado = new Paciente();
            }
        }
        

        model.addAttribute("pacienteBuscado", pacienteBuscado);
        model.addAttribute("paciente", paciente);
        model.addAttribute("listaPacientes", pacienteService.listar());

        return "Dashboard/Secciones/Pacientes";
    }

}
