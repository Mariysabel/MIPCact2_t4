package com.act1.spring.app1.springboot_aplications.controllers;

import com.act1.spring.app1.springboot_aplications.models.Empleados;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController 
@RequestMapping("api/vari")
public class PathVariableController {
    @Value("${config.codigo}")
    private String codigo;

    @Value("${config.nombre}")
    private String nombre;

    @Value("${config.mensaje}")
    private String mensaje;
    

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
    public Empleados crearEmple(@RequestBody Empleados empreado1){
        return empreado1;
    }
    
    @GetMapping("/valores")
    public Map<String, Object> values(){
        Map<String, Object> json= new HashMap<>();
        json.put("Codigo", codigo);
        json.put("Nombre", nombre);
        json.put("Mensaje", mensaje);
    
        return json;
    }
    
    
}
