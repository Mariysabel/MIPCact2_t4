package com.act1.spring.app1.springboot_aplications.controllers;
import java.util.Map;

import com.act1.spring.app1.springboot_aplications.models.DTO.ClaseDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class AlumnoRestController {

    @GetMapping(path="/alumno")
    public ClaseDTO alumno() {
        /*Empleados empleado1 = new Empleados("María","Cruz","Calle Oaxaca","gerente ",21,2444635,001);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);*/
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Info tit");
        usuario1.setUsuario("Mariysabel");


        return usuario1;
    }

    @GetMapping("/tutor")
    public Object info_tutor() {

        return Map.of(
                "nombre", "Sonia Araceli Cruz Méndez",
                "contacto", "9512444635");

    }
}