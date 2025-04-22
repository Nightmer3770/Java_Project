/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author rodse
 */
public class IdentificarExpresiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String curso = "Lenguajes Orientados a Objetos";
        String numero = "123.45";
        String palabra;
        int entero;
        System.out.println(curso.charAt(4));
        System.out.println(curso.length());
        palabra=curso.substring(23).toUpperCase();
        System.out.println(palabra);
        entero=Integer.parseInt(numero.substring(0,numero.indexOf(".")));
        System.out.println(entero);
    }
}

