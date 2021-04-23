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
public class escalera_1 {

    public static void main(String args[]) {
        /*
         Crea una aplicación que dibuje una escalera de números,
         siendo cada linea números empezando en uno y acabando en el numero de la linea.
         Salida
         1
         12
         123
         1234
         12345

         */
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la altura", "Introduciendo Altura", JOptionPane.INFORMATION_MESSAGE));
            dibujarEscalera(n);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void dibujarEscalera(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

}
