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
public class Alquiler {
    private int numRegistro;
    private Usuario usuario;
    private Juego juego;
    private Plataforma plataforma;
    private LocalDate fechaInicio;
    private LocalDate fechaPrevista;
    private boolean devuelto;
    
    public Alquiler() {
        
    }

    public Alquiler(int numRegistro, Usuario usuario, Juego juego, Plataforma plataforma, LocalDate fechaInicio, LocalDate fechaPrevista, boolean devuelto) {
        this.numRegistro = numRegistro;
        this.usuario = usuario;
        this.juego = juego;
        this.plataforma = plataforma;
        this.fechaInicio = fechaInicio;
        this.fechaPrevista = fechaPrevista;
        this.devuelto = devuelto;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(LocalDate fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "numRegistro=" + numRegistro + ", usuario=" + usuario + ", juego=" + juego + ", plataforma=" + plataforma + ", fechaInicio=" + fechaInicio + ", fechaPrevista=" + fechaPrevista + ", devuelto=" + devuelto + '}';
    }
    
    public String getEstadoTexto() {
        if (devuelto) {
            return "Devuelto";
        } 
        if (LocalDate.now().isAfter(fechaPrevista)) {
            return "Fuera de plazo";
        }
        return "Activo";
    }
}
