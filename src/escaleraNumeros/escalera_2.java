/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaleraNumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author El Camaleon
 */
public class escalera_2 {

    public static void main(String args[]) {
        /*
         Salida
         1
         22
         333
         4444
         55555
         */
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la altura de la escalera ", "Introduciendo altura", JOptionPane.INFORMATION_MESSAGE));
            dibujarEscalera(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void dibujarEscalera(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);

            }
            System.out.println("");
        }

    }
}
