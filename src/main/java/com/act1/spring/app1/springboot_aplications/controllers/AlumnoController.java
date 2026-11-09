package com.act1.spring.app1.springboot_aplications.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.act1.spring.app1.springboot_aplications.models.Empleados;


@Controller 
public class AlumnoController {

    @GetMapping("/detalles_alumno")
    

    public String info(Model model){
        Empleados empleado1 = new Empleados("María","Cruz","Calle xd","gerente ",21,2444635,001);
        
        model.addAttribute("Empleado", empleado1);

        return "detalles_alumno";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
            new Empleados("María","Cruz","Calle xd","secretadria ",21,1844635,002),
            new Empleados("María","Cruz","Calle xd","secretadria ",21,1844635,002),
        
            new Empleados("María","Cruz","Calle xd","secretadria ",21,1844635,002),
        
            new Empleados("María","Cruz","Calle xd","secretadria ",21,1844635,002)
    
        );
    }
}
