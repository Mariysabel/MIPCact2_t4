package com.act1.spring.app1.springboot_aplications.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("api/parametros")
public class RequestParamController {
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam (required =  false , defaultValue = "hola a todos" )String info ){
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(info);
        return parametro1;
    }

}
