/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao03;

/**
 *
 * @author zier
 */
public class Operacoes {
    public static String contador(int i, int f) { //public private protected//
        String s = "";
        for (int c = i; c<= f; c++) {
            s += c + " ";
        }
        return s;
    }
}
