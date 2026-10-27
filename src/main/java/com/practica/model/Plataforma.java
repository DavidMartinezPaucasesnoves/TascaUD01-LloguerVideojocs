/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.practica.model;

/**
 *
 * @author MrDeivid
 */
public enum Plataforma {
    PS5("PS5"),
    XBOX("XBOX"),
    PC("PC"),
    SWITCH_2("Switch 2");
    
    private final String nombre;

    private Plataforma(String nombre) {
        this.nombre = nombre;
    }

    public static Plataforma getPS5() {
        return PS5;
    }

    public static Plataforma getXBOX() {
        return XBOX;
    }

    public static Plataforma getPC() {
        return PC;
    }

    public static Plataforma getSWITCH_2() {
        return SWITCH_2;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    @Override
    public String toString() {
        return nombre;
    }
}
