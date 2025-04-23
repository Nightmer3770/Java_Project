/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Graficos extends JFrame {
    String[] titulo;
    String[] leyendas;
    int datos1[]; // datos columna 1
    int datos2[]; // datos columna 2
    int datos3[]; // datos columna 3
    
    public Graficos(String titulo [], int datos_x [], int datos_y[], int datos_z[]){
        this.titulo=titulo;
        this.datos1 = datos_x;
        this.datos2 = datos_y;
        this.datos3 = datos_z;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        dibujar(g); // Llama a la implementación de la subclase
    }
    
    public void dibujar(Graphics g){
    }
}

