/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author luisr
 */
public class Graficos extends JFrame {
    String titulo;
    String[] nombresEjes;
    String[] leyendas;
    int datos[];
    
    public Graficos(String titulo, String[]nombresEjes, int []datos){
        this.titulo = titulo;
        this.nombresEjes = nombresEjes;
        this.datos = datos;
        this.leyendas = nombresEjes;
    }
    // este método es llamado automáticamente por Java
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        dibujar(g); // Llama a la implementación de la subclase
    }
    
    public void dibujar(Graphics g){
    }
}
