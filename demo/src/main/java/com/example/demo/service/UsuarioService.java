package com.example.demo.service;

import com.example.demo.bean.Usuario;
import com.example.demo.dao.UsuarioDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioDao usuarioDao;

    public void agregar(Usuario usuario){
        usuarioDao.agregar(usuario);
    }
    
}
