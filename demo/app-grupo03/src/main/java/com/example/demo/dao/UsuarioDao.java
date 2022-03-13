package com.example.demo.dao;

import com.example.demo.bean.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDao {
    
    @Autowired
    JdbcTemplate template;
    public void agregar(Usuario usuario){

        String sql = "INSERT INTO USUARIO (CORREO, CONTRASENIA, FECHA_CREACION) VALUES (?, ?, CURRENT_DATE)";
        template.update(sql, usuario.getCorreo(), usuario.getContrasenia());
    }
}
