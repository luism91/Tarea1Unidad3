/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema8;

import java.util.Scanner;

/**
 *
 * @author UGMWS
 */
public class P8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String opcion ="S";
        while(opcion.equals("S") || opcion.equals("N")){
            System.out.print("TECLEA S o N: ");
            opcion = entrada.nextLine();
        }
    }
}
