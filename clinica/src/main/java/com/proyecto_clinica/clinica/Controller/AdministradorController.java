package com.proyecto_clinica.clinica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.proyecto_clinica.clinica.model.Entidades.Administradores;
import com.proyecto_clinica.clinica.model.Entidades.Rol;
import com.proyecto_clinica.clinica.model.Service.IService.IAdministradorService;
import com.proyecto_clinica.clinica.model.Service.IService.IRolesService;

@Controller
@RequestMapping("/dashboard/administradores")
public class AdministradorController {
    
    @Autowired
    private IAdministradorService administradorService;

    @Autowired
    private IRolesService rolesService;

    @RequestMapping("/")
    public String admin(Model model){
        Administradores admin = new Administradores();

        model.addAttribute("admin", admin);
        model.addAttribute("listaAdmin", administradorService.listarAdmin());

        return "Dashboard/Secciones/Administradores";
    }

    @RequestMapping(value = "/registraradmin", method = RequestMethod.POST)
    public String programarCita(Administradores administradores){
        administradorService.registrarAdministrador(administradores);
        
        return "redirect:/dashboard/administradores/";
    }

    @RequestMapping(value = "/asignarrol", method = RequestMethod.POST)
    public String programarCita(Rol rol){
        rolesService.asignarRol(rol);
        
        return "redirect:/dashboard/administradores/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Long id){
        administradorService.eliminarAdmin(id);
        return "redirect:/dashboard/administradores/";
    }

}
