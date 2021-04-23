/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaleraAsteriscos;

import javax.swing.JOptionPane;

/**
 *
 * @author CxrlosMX
 */
public class Escalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le pasamos la altura de la escalera por teclado. Este es un ejemplo si insertaras un 5 de altura: */
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño de la sub escalera", "Introduciendo n", JOptionPane.INFORMATION_MESSAGE));
            dibujarEscalera(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void dibujarEscalera(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
