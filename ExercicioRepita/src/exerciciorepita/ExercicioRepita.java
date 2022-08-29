/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author PedroFiveM
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.ERROR_MOptionPane.ERESSAGE);
        int n, s =0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>(Valor 0 interrompe</em>html>"));
            s += n;
        } while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" +
                "<br>Somário Vale " + s + "</html>");
        //JOptionPane.showMessageDialog(null, "Você digitou " + n);
    }
    
}
