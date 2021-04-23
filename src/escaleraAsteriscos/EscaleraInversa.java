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
public class EscaleraInversa {

    public static void main(String args[]) {
        /*
         Crea una aplicación que dibuje una escalera inversa de asteriscos. 
         Nosotros le pasamos la altura de la escalera inversa por teclado. 
         */
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el tamaño de la sub escalera", "Introduciendo n", JOptionPane.INFORMATION_MESSAGE));
            dibujarEscalera(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void dibujarEscalera(int n) {
        for (int i = n; i != 0; i--) {
            System.out.print("*");
            for (int j = 0; j < i - 1; j++) {

                System.out.print("*");

            }
            System.out.println("");
        }

    }

}
