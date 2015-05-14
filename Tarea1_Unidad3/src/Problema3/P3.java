/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

/**
 *
 * @author UGMWS
 */
public class P3 {
    
     public static void main(String[] args) {
         int k=0;

            for (int i = 0; i <= 100; i++) {
                k=i%2;
                if (k==0) {
                    System.out.println(i);
                }   
            }
        }
}
