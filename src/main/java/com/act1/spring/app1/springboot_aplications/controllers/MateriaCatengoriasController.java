package com.act1.spring.app1.springboot_aplications.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.act1.spring.app1.springboot_aplications.models.DTO.MateriaDTO;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("api/path")
public class MateriaCatengoriasController {

    @GetMapping("/pagina1/{credits}")
    public String pagina1(@PathVariable int credits, Model model) {

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

        List<MateriaDTO> lista_credits = new ArrayList<>();

        for (MateriaDTO materia : materias) {

            if (materia.getCredit() == credits) {
                lista_credits.add(materia);
            }

        }

        model.addAttribute("materias", lista_credits);

        model.addAttribute("creditos", credits);

        return "listar";
    }

    @GetMapping("/listar")
    public String pagina1(
            @RequestParam(required = false, defaultValue = "Programación Web") String nombre,
            Model model) {

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

        List<MateriaDTO> lista_nombre = new ArrayList<>();

        for (MateriaDTO materia : materias) {

            if (materia.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                lista_nombre.add(materia);
            }

        }

        model.addAttribute("materias", lista_nombre);
        model.addAttribute("nombre", nombre);

        return "lista_materias";
    }

}
