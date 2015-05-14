/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema7;
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author UGMWS
 */
public class P7 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String frases;
        String opcion ="S";
        int cont=1;
      
        while(opcion.equals("S")){
            System.out.print("Escribe la frase: ");
            frases = entrada.nextLine();
            System.out.println("=============================================");
            System.out.println(cont + ".-" +frases);
            cont = cont +1;
            System.out.print("Deseas introducir mas frases?(S/N):");
            opcion = entrada.nextLine();
        }
        
        System.out.println("Cantidad de frases: "+cont);
        
    }
    }

