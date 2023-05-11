package org.mvc.controlador;

import org.mvc.modelo.Comida;
import org.mvc.modelo.ComidaDAOSqlite;
import org.mvc.vista.Vista;

import javax.swing.*;

public class Controlador {

    private ComidaDAOSqlite modelo;
    private Vista vista;

    public Controlador(){
        modelo = new ComidaDAOSqlite();
        vista = new Vista();

        vista.getBotonGuardar().addActionListener(e -> {
            guardarComida();
        });

        vista.getBotonListar().addActionListener(e -> {
            listarComidas();
        });

    }

    private void listarComidas() {
        String comidas = "";
        for(Comida comida : modelo.listar()){
            comidas += comida.getNombre()+"\n";
        }
        vista.getTextAreaComidas().setText(comidas);
    }

    private void guardarComida() {
        String nombre = vista.getTextField1().getText().trim().toLowerCase();
        Comida comida = new Comida(nombre);
        modelo.guardar(comida);
        JOptionPane.showMessageDialog(null, "La comida "+nombre+" se ha añadido correctamente", "Añadido correctamente", JOptionPane.ERROR_MESSAGE);

    }
}
