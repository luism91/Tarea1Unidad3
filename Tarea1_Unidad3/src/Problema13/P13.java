/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema13;

/**
 *
 * @author UGMWS
 */
public class P13 {
    public static void main(String[] args) {
      int k=0,j=0;
        int sumap=0;
        
        for (int i = 1; i <= 100; i++) {
                k=i%2;
                j=i%3;
                
                if (k==0 || j==0) {
                    sumap = sumap+1;
                }
        }   
        System.out.println("Cantidad de multiplos de 2 y 3: "+sumap);
        
    }
}
