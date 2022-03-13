package com.example.demo.controller;

import com.example.demo.bean.Solicitante;
import com.example.demo.service.SolicitanteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addsol")
public class SolicitanteController {

    @Autowired
    SolicitanteService solicitanteService;

    @PostMapping
    public void agregar(@RequestBody Solicitante solicitante){
        solicitanteService.agregar(solicitante);

    }
    
}
