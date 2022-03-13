package com.example.demo.bean;

public class Usuario {
    Integer id_usuario;
    String correo;
    String contrasenia;
    String fecha_creacion;

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }
}
