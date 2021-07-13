/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaswitch;

import java.util.Scanner;

/**
 *
 * @author zier
 */
public class ProgramaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a)");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
               tipo = "bipede";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
               tipo = "outro"; 
            break;
            
        }
        System.out.println(tipo);
    }
    
}
