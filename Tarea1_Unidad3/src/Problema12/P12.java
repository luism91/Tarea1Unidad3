/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema12;

/**
 *
 * @author UGMWS
 */
public class P12 {
    public static void main(String[] args) {
        
        int k=0;
        int sumap=0,suman=0;
        
        for (int i = 1; i <= 100; i++) {
                k=i%2;
                if (k==0) {
                    sumap = sumap+i;
                }else{
                    suman = suman+i;
                }
                }   
        
        System.out.println("Suma de numeros pares: "+sumap);
        System.out.println("Suma de numeros nones: "+suman);
            }
    }
   

