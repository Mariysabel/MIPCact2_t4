package com.act1.spring.app1.springboot_aplications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.act1.spring.app1.springboot_aplications.models.DTO.MateriaDTO;


@RestController
public class MateriaPostController {
    @Value("${config.nombre}")
    private String nombre;
    
    @PostMapping("/solicitud")
    public MateriaDTO crearEmple(@RequestBody MateriaDTO mat1) {
        return mat1;
    }

    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("Nombre", nombre);
        return json;
    }
}
