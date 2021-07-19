/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author zier
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n[] = new int[4];
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de N " + n.length);
        for (int c = 0; c < n.length; c++) {
            System.out.println("na posicao " + c + " Temos o valor " + n[c]);
        }
        System.out.println("O terceiro valor é " + n[2]); // n[//posicao//] //
    }

}
