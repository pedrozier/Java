/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author zier
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Ola,Mundo!", "janela 1",JOptionPane.ERROR_MESSAGE);
        int n, i = 0, s = 0, p = (-1), c = 0, m = 0, mr = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero<br><em> 0 Para Sair</html>"));
            s += n;
            m++;
            if (n % 2 == 1) {
                i++;
            } else {
                p++;
            }
            if (n > 100) {
                c++;
            }
            mr = (s/m);
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html>O resultado foi:<br>" + "<br>Somatorio vale " + s + "<br>Numeros Impares " + i + "<br>Numeros Pares " + p + "<br>Numeros Maiores que 100 " + c + "<br>A media foi " + mr + "</html>");
    }

}
