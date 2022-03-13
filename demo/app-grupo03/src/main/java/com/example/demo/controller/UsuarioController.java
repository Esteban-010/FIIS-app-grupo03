package com.example.demo.controller;

import com.example.demo.bean.Usuario;
import com.example.demo.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adduser")
public class UsuarioController {
    

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public void agregar(@RequestBody Usuario usuario){
        usuarioService.agregar(usuario);
    }
}
