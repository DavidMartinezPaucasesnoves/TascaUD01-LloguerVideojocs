/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.validation;

/**
 *
 * @author MrDeivid
 */
public class ValidationAPI {
    
    public static boolean empiezaMayus(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        } else {
            return Character.isUpperCase(nombre.trim().charAt(0));
        }
    }
    
    public static boolean estaVacio(String text) {
        return text == null || text.trim().isEmpty();
    }
    
    public static boolean validarDni(String dni) {
        if (dni == null) {
            return false;
        } else {
            return dni.matches("^[0-9]{8}[A-Za-z]$");
        }
    }
    
    public static boolean validarTelefono(String telefono) {
        if (telefono == null) {
            return false;
        } else {
            return telefono.matches("^[0-9]{9}$");
        }
    }
}
