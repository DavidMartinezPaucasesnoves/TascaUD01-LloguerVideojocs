/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.model;

import java.time.LocalDate;

/**
 *
 * @author MrDeivid
 */
public class Usuario {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String telefono;
    private LocalDate fechaRegistro;
    
    public Usuario() {}

    public Usuario(String nombre, String apellido1, String apellido2, String dni, String telefono, LocalDate fechaRegistro) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + (apellido1 != null ? apellido1: "")  + " " + (apellido2 != null ? apellido2: "");
    }
    
    @Override
    public String toString() {
        return getNombreCompleto().trim();
    }
}
