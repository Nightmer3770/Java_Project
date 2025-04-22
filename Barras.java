package proyecto;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author luisr
 */
public class Barras extends Graficos {
    
    public Barras(String titulo, String[] nombresEjes, int[]datos) {
        super(titulo, nombresEjes, datos);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void dibujar(Graphics g){
        int ancho = 50;
        int espacio = 20;
        int x = 50;
        int base = 300;
        
        // Dibujar titulo
        g.drawString(titulo,150,30);
        for(int i = 0; i< datos.length;i++){
            int altura = datos[i]*5;
            g.setColor(new Color(50 + i * 30, 100, 150)); // Color distinto por barra
            g.fillRect(x, base - altura, ancho, altura);

            // Etiqueta de la barra
            g.setColor(Color.BLACK);
            g.drawString(leyendas[i], x + 10, base + 15);
            x += ancho + espacio;
        }
    }
}

