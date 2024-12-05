/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EXAMEN.PARCIAL.EJERCICIO._YUPANQUI.controller;

import com.example.EXAMEN.PARCIAL.EJERCICIO._YUPANQUI.model.Registro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador para gestionar el registro de eventos.
 * 
 * @author Usuario
 */
@Controller
public class RegistroController {

    // Mostrar formulario de registro
    @GetMapping("/registro")
    public String showRegistroForm(Model model) {
        // Creamos una nueva instancia de Registro y la pasamos al modelo para usarla en el formulario
        model.addAttribute("registro", new Registro());
        return "registro";  // Vista HTML
    }

    // Procesar datos del formulario de registro
    @PostMapping("/registro")
    public String processRegistroForm(Registro registro, Model model) {
        // Aquí puedes agregar lógica para guardar la información en una base de datos

        // Agregar mensaje de éxito
        model.addAttribute("nombre", registro.getNombre());
        return "exito";  // Redirigir a página de éxito
    }
}