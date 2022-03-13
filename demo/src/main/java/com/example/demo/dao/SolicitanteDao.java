package com.example.demo.dao;

import com.example.demo.bean.Solicitante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SolicitanteDao {
    

    @Autowired
    JdbcTemplate template;
    public void agregar(Solicitante solicitante){
        String sql = "INSERT INTO SOLICITANTE (ID_SOLICITANTE, RUC) VALUES (?, ?)";
        template.update(sql, solicitante.getId_solicitante(), solicitante.getRUC());
        
    }


}
