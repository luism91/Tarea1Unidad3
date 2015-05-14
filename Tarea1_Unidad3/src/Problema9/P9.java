/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema9;

import java.util.Scanner;

/**
 *
 * @author UGMWS
 */
public class P9 {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        float num=0;
        
        System.out.print("Escribe un numero:");
        num = entrada.nextLong();
        System.out.println("++++++++++++++++++++++++++++++++");
           if (num>0) {
                System.out.println("Es positivo");
           }else{
                System.out.println("Es negativo");    
             }
          
            }  
    }
    
    
