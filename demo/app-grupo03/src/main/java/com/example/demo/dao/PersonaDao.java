package com.example.demo.dao;

import com.example.demo.bean.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaDao {

    @Autowired
    JdbcTemplate template;
    public void agregar(Persona persona){
        String sql = "INSERT INTO PERSONA(DNI, NOMBRE, TELEFONO, CELULAR, CORREO) VALUES (?, ?, ?, ?, ?)";
        template.update(sql, persona.getDNI(), persona.getNombre(), persona.getTelefono(), persona.getCelular(), persona.getCorreo());
    }
    
}
