/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojoptionpane;

import javax.swing.JOptionPane;
/**
 *
 * @author PedroFiveM
 */
public class ExercicioJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, imp = 0, par = 0, maior100 = 0, m = 0, i = 0, s = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um Número: <br> "
                    + "<em>0 Interrompe</em> </html>"));
            i++;
            if (n % 2 == 0){
                par++;
            }else{
                imp++;
            }
            
            if(n > 100){
                maior100++;
            }
            s += n;
        }while(n != 0);
        i--;
        par--;
        m = s/i;
        JOptionPane.showMessageDialog(null, "<html>Resultado <hr>" +  
                "<br>Total de Valores: " + i + 
                "<br>Total Pares: " + par + 
                "<br>Total Impares: " + imp + 
                "<br>Acima de 100: " + maior100 + 
                "<br>Media dos Valores: " + m +
                "</html");
    }
    
}
