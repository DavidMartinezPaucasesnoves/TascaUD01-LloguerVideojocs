package com.practica.ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Deivid
 */

import com.practica.model.Alquiler;
import com.practica.service.DataStore;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.time.LocalDate;

public class AlquilerTableCellRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Obtener el objeto Alquiler según la fila
        Alquiler alquiler = DataStore.alquileres.get(row);

        if (!isSelected) {
            if (alquiler.isDevuelto()) {
                // Retornat (Verde)
                cell.setBackground(new Color(180, 240, 180));
                cell.setForeground(Color.BLACK);
            } else if (LocalDate.now().isAfter(alquiler.getFechaPrevista())) {
                // Fora de termini (Rojo)
                cell.setBackground(new Color(255, 180, 180));
                cell.setForeground(Color.BLACK);
            } else {
                // Estado activo normal (Blanco)
                cell.setBackground(Color.WHITE);
                cell.setForeground(Color.BLACK);
            }
        }

        return cell;
    }
}
