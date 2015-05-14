/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema10;

import java.util.Scanner;

/**
 *
 * @author UGMWS
 */
public class P10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        float num=0;
        float k=0;
        
        System.out.print("Escribe un numero:");
        num = entrada.nextLong();
        System.out.println("++++++++++++++++++++++++++++++++");
        k = num%2;
        
           if (k==0) {
                System.out.println("Es par");
           }else{
                System.out.println("Es impar");    
             }
          
            }  
    }
    

