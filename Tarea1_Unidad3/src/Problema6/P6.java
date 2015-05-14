/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema6;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author UGMWS
 */
public class P6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        System.out.print("Escribe el numero hasta cual deseas que se imprima: ");
        numero1 = entrada.nextInt();
        System.out.println("===================================================");
         for (int i = 0; i <= numero1; i++) {
                System.out.println(i);
        }
        
    }
}
