package com.example.demo.bean;

public class Persona {
    String DNI;
    String nombre;
    Integer telefono;
    Integer celular;
    String correo;
    Integer id_usuario;

    public Integer getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDNI() {
        return DNI;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public String getNombre() {
        return nombre;
    }
    public Integer getTelefono() {
        return telefono;
    }
    
    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

}
