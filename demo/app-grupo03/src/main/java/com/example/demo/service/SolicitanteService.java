package com.example.demo.service;

import com.example.demo.bean.Solicitante;
import com.example.demo.dao.SolicitanteDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitanteService {
    @Autowired
    SolicitanteDao solicitanteDao;


    public void agregar(Solicitante solicitante){
        solicitanteDao.agregar(solicitante);
    }

}
