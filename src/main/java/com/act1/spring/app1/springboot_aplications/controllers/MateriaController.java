package com.act1.spring.app1.springboot_aplications.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.act1.spring.app1.springboot_aplications.models.DTO.MateriaDTO;


@Controller
public class MateriaController {

    @GetMapping("/lista_materias")
    public String lista(Model model) {

        MateriaDTO mat1 = new MateriaDTO();
        mat1.setNombre("Programación Web");
        mat1.setDesc("Desarrollo de aplicaciones web");
        mat1.setCredit(5);

        MateriaDTO mat2 = new MateriaDTO();
        mat2.setNombre("Base de Datos");
        mat2.setDesc("Administración de bases de datos");
        mat2.setCredit(5);

        MateriaDTO mat3 = new MateriaDTO();
        mat3.setNombre("Redes");
        mat3.setDesc("Configuración de redes");
        mat3.setCredit(4);

        List<MateriaDTO> materias = Arrays.asList(mat1, mat2, mat3);

        model.addAttribute("materias", materias);

        return "lista_materias";
    }

    @GetMapping("/formulario_materia")
    public String formulario() {

        return "formulario_materia";
    }

    @GetMapping("/resultado_materia")
    public String resultado(
            @ModelAttribute("materia") MateriaDTO materia,
            Model model) {

        model.addAttribute("materia", materia);

        return "resultado_materia";
    }
}