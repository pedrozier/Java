/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author zier
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int c;
        System.out.println("Digite o ano ");
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();
        for (c = 0; c < mes.length; c++) {
            
            if(y % 4 == 0){
                tot[1] = 29;
            }
            System.out.println("O mes de " + mes[c] + " tem " + tot[c] + " dias ");
            
        }
    }

}
