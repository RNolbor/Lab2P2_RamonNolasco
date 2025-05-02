/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_ramonnolasco;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Lab2P2_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("---MENU---");
            System.out.println("1. ZeldaRPG");
            System.out.println("0. Salir");
            
            System.out.println("Elija una opcion: ");
            opcion = input.nextInt();
            while (opcion < 0 || opcion > 1){
                System.out.println("Ingrese una opcion valida!: ");
                opcion = input.nextInt();
            }
            
            if (opcion == 1) {
                
                
                
                
                
                
                
                
            } else {
                System.out.println("Saliendo...");
            }
            
        } while (opcion != 0);
        
        
    }
    
}
