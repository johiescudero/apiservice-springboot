package com.asistente.apiservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    
    @Id
    private int id;
    private String nombre;
    private String clave;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}