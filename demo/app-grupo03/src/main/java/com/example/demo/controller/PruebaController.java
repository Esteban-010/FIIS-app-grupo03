package com.example.demo.controller;


import java.util.*;

import com.example.demo.bean.Persona;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {
    
    @RequestMapping("/prueba")
    public List <Persona> prueba(){
        List <Persona> p = new ArrayList<>();
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.setNombre("Jans Ortega Carranza");
        p1.setCelular(9999999);
        p1.setCorreo("hortegac@uni.pe");
        p1.setDNI("77777731");

        p2.setNombre("Esteban Palomino Valdivia");
        p2.setCelular(99999998);
        p2.setCorreo("epalominov@uni.pe");
        p2.setDNI("77777732");

        p.add(p1);
        p.add(p2);
        
        return p ;
    }
}
