package org.mvc.vista;

import javax.swing.*;

public class Vista extends JFrame{
    private JTextField textField1;
    private JLabel etiquetaNombre;
    private JPanel ventana;
    private JButton botonGuardar;
    private JButton botonListar;
    private JTextArea textAreaComidas;

    public Vista(){
        super("Comidas");
        setContentPane(ventana);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setVisible(true);
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JLabel getEtiquetaNombre() {
        return etiquetaNombre;
    }

    public void setEtiquetaNombre(JLabel etiquetaNombre) {
        this.etiquetaNombre = etiquetaNombre;
    }

    public JPanel getVentana() {
        return ventana;
    }

    public void setVentana(JPanel ventana) {
        this.ventana = ventana;
    }

    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public void setBotonGuardar(JButton botonGuardar) {
        this.botonGuardar = botonGuardar;
    }

    public JButton getBotonListar() {
        return botonListar;
    }

    public void setBotonListar(JButton botonListar) {
        this.botonListar = botonListar;
    }

    public JTextArea getTextAreaComidas() {
        return textAreaComidas;
    }

    public void setTextAreaComidas(JTextArea textAreaComidas) {
        this.textAreaComidas = textAreaComidas;
    }
}
