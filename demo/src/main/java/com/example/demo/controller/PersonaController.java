package com.example.demo.controller;

import com.example.demo.bean.Persona;
import com.example.demo.service.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addperson")
public class PersonaController {
    
    @Autowired
    PersonaService personaService;

    @PostMapping
    public void agregar(@RequestBody Persona persona){
        personaService.agregar(persona);
    }
}
