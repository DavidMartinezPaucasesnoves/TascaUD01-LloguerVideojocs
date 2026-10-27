/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.service;

import com.practica.model.Usuario;
import com.practica.model.Juego;
import com.practica.model.Alquiler;
import com.practica.model.Plataforma;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MrDeivid
 */
public class DataStore {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Juego> juegos = new ArrayList<>();
    private static List<Alquiler> alquileres = new ArrayList<>();
    
    private static int siguienteNumRegistro = 1;
    
    static {
        cargarDatosIniciales();
    }
    
    private static void cargarDatosIniciales() {
        Usuario u1 = new Usuario("Laura", "Garcia", "Pérez", "12345678A","600111222", LocalDate.now());
        Usuario u2 = new Usuario("Marc", "López", "Martí", "87654321B","600333444", LocalDate.now());
        Usuario u3 = new Usuario("David", "Martínez", "Jiménez", "11223344D","600555666", LocalDate.now());
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        Juego j1 = new Juego("Cyberpunk 2077", "Acció", 2, 0, 0, 1);
        Juego j2 = new Juego("Minecraft", "Aventura", 0, 3, 2, 0);
        Juego j3 = new Juego("Sea of Thieves", "Aventura", 1, 5, 2, 0);
        Juego j4 = new Juego("Counter Strike 2", "tirs", 0, 0, 10, 0);
        juegos.add(j1);
        juegos.add(j2);
        juegos.add(j3);
        juegos.add(j4);
        
        j1.decrementarStock(Plataforma.PS5);
        Alquiler a1 = new Alquiler(siguienteNumRegistro++, u1, j1, Plataforma.PS5, LocalDate.now().minusDays(2), LocalDate.now().plusDays(5), false);
        Alquiler a2 = new Alquiler(siguienteNumRegistro++, u2, j2, Plataforma.XBOX, LocalDate.now().minusDays(1), LocalDate.now().plusDays(6), false);
        alquileres.add(a1);
        alquileres.add(a2);
    }
    
    public static boolean tieneAlquileresActivos(Juego juego) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getJuego().equals(juego) && !alquiler.isDevuelto()) {
                return true;
            }
        }
        
        return false;
    }
    
    public static int getSiguienteNumRegistro() {
        return siguienteNumRegistro;
    }
}
