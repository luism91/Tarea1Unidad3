/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema11;

import java.util.Scanner;

/**
 *
 * @author UGMWS
 */
public class P11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int k=0;
        int num=0;
        int cont =0;
        
         System.out.print("Escribe un numero:");
         num = entrada.nextInt();
         System.out.println("++++++++++++++++++++++++++++++++");
         k = num%3;

            for (int i = 1; i <= num; i++) {
                k=i%3;
                if (k==0) {
                    System.out.println(i);
                    cont = cont+1;
                }   
            }
        System.out.println("Cantidad de multiplos de 3: "+cont);
        
        
    }
}
