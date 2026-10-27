/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.model;

import java.util.Map;

/**
 *
 * @author MrDeivid
 */
public class Juego {
    private String nombre;
    private String genero;
    private int stockPs5;
    private int stockXbox;
    private int stockPc;
    private int stockSwitch2;
    
    public Juego () {
        
    }

    public Juego(String nombre, String genero, int stockPs5, int stockXbox, int stockPc, int stockSwitch2) {
        this.nombre = nombre;
        this.genero = genero;
        this.stockPs5 = stockPs5;
        this.stockXbox = stockXbox;
        this.stockPc = stockPc;
        this.stockSwitch2 = stockSwitch2;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getStockPs5() {
        return stockPs5;
    }

    public void setStockPs5(int stockPs5) {
        this.stockPs5 = stockPs5;
    }

    public int getStockXbox() {
        return stockXbox;
    }

    public void setStockXbox(int stockXbox) {
        this.stockXbox = stockXbox;
    }

    public int getStockPc() {
        return stockPc;
    }

    public void setStockPc(int stockPc) {
        this.stockPc = stockPc;
    }

    public int getStockSwitch2() {
        return stockSwitch2;
    }

    public void setStockSwitch2(int stockSwitch2) {
        this.stockSwitch2 = stockSwitch2;
    }
    
    public int getUnidadesDisponibles(Plataforma plataforma) {
        switch (plataforma) {
            case PS5: return stockPs5;
            case XBOX: return stockXbox;
            case PC: return stockPc;
            case SWITCH_2: return stockSwitch2;
            default: return 0;
        }
    }
    
    public boolean decrementarStock(Plataforma plataforma) {
        if (getUnidadesDisponibles(plataforma) <= 0) {
            return false;
        }
        
        switch (plataforma) {
                case PS5: stockPs5--;
                break;
                case XBOX: stockXbox--;
                break;
                case PC: stockPc--;
                break;
                case SWITCH_2: stockSwitch2--;
                break;
        }
        
        return true;
    }
    
    public void incrementarStock(Plataforma plataforma) {
        switch (plataforma) {
            case PS5: stockPs5++;
            break;
            case XBOX: stockXbox++;
            break;
            case PC: stockPc++;
            break;
            case SWITCH_2: stockSwitch2++;
            break;
        }
    }
    
}
