package com.example.demo.service;

import com.example.demo.bean.Persona;
import com.example.demo.dao.PersonaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    

    @Autowired
    PersonaDao personaDao;
    public void agregar(Persona persona){
        personaDao.agregar(persona);
    }

}
