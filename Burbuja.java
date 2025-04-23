package proyecto;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Burbuja extends Graficos {

    public Burbuja(String[] titulo, int[] datos_x, int[] datos_y, int[] datos_z) {
        super(titulo, datos_x, datos_y, datos_z);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void dibujar(Graphics g) {
        // Dibujar ejes
        g.setColor(Color.BLACK);
        g.drawLine(50, 350, 550, 350); // Eje X
        g.drawLine(50, 350, 50, 50);   // Eje Y

        // Obtener máximos para escalado
        Estadisticos c1= new Estadisticos(datos1,datos1.length);
        int maxX = c1.maximo();
        int maxY = c1.maximo();

        // Dibujar los círculos (burbuja)
        for (int i = 0; i < datos1.length; i++) {
            int x = 50 + (int) ((500.0 * datos1[i]) / maxX);
            int y = 350 - (int) ((300.0 * datos2[i]) / maxY);

            g.setColor(Color.RED);
            g.fillOval(x - datos3[i] / 2, y - datos3[i] / 2, datos3[i], datos3[i]); // Centrados en x,y

            // Opcional: dibujar etiquetas
            //g.setColor(Color.BLACK);
            //g.drawString("(" + datos1[i] + "," + datos2[i] + ")", x, y);
        }
    }

