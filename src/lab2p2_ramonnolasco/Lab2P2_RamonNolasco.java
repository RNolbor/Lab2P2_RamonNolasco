/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_ramonnolasco;

import java.util.Scanner;
import java.util.ArrayList;


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
        //fila 5 asiento 4
        Scanner input = new Scanner(System.in);

        ArrayList<Mapa> mapas = new ArrayList<>();
        ArrayList<Enemigo> enemigos = new ArrayList<>();
        System.out.println("PRESIONA ENTER");
        input.nextLine(); 

        int opcion;
        do {
            System.out.println("---MENU---");
            System.out.println("1. ZeldaRPG");
            System.out.println("0. Salir");

            System.out.println("Elija una opcion: ");
            opcion = input.nextInt();
            while (opcion < 0 || opcion > 1) {
                System.out.println("Ingrese una opcion valida!: ");
                opcion = input.nextInt();
            }

            if (opcion == 1) {
                int opcion2;
                do {
                    System.out.println("1. Ingresar como admin");
                    System.out.println("2. Ingresar como jugador");
                    System.out.println("0. Salir");

                    System.out.println("Elija una opcion: ");
                    opcion2 = input.nextInt();
                    while (opcion2 < 0 || opcion2 > 2) {
                        System.out.println("Ingrese una opcion valida!: ");
                        opcion2 = input.nextInt();
                    }

                    switch ( opcion2) {
                        case 1:
                            System.out.println("---- MENU ADMIN ----");
                            System.out.println("1. Crear Mapas/Enemigos");
                            System.out.println("2. Modificar Mapas/Enemigos");
                            System.out.println("3. Listar Mapas/Enemigos");
                            System.out.println("4. Borrar Mapas/Enemigos");
                            System.out.println("0. Volver al menu principal");

                            System.out.println("Elija una opcion: ");

                            int opcion3adminmenu = input.nextInt();
                            while (opcion3adminmenu < 0 || opcion3adminmenu > 4) {
                                System.out.println("Ingrese una opcion valida!: ");
                                opcion3adminmenu = input.nextInt();
                            }
                            
                            int opcionMoE;
                            
                            switch (opcion3adminmenu) {

                                case 1:
                                    System.out.println("Que desea crear?");
                                    System.out.println("1. Mapas");
                                    System.out.println("2. Enemigos");

                                    opcionMoE = input.nextInt();
                                    input.nextLine();
                                    while (opcionMoE < 1 || opcionMoE > 2) {
                                        System.out.println("Ingrese opcion valida!: ");
                                        opcionMoE = input.nextInt();
                                    }

                                    if (opcionMoE == 1) {
                                        System.out.print("Nombre de la zona: ");
                                        String nombre = input.nextLine();
                                        System.out.print("Clima: ");
                                        String clima = input.nextLine();
                                        System.out.print("Efecto en Heroe: ");
                                        int eHeroe = input.nextInt();
                                        System.out.print("Efecto en Enemigos: ");
                                        int eEnemigos = input.nextInt();
                                        input.nextLine();

                                        mapas.add(new Mapa(nombre, clima, eHeroe, eEnemigos));
                                        System.out.println("¡Mapa creado!");
                                        
                                    } else if (opcionMoE == 2) {
                                        System.out.print("Tipo de enemigo: ");
                                        String tipo = input.nextLine();
                                        System.out.print("Vida: ");
                                        int vida = input.nextInt();
                                        System.out.print("Ataque: ");
                                        int ataque = input.nextInt();
                                        input.nextLine();

                                        enemigos.add(new Enemigo(tipo, vida, ataque));
                                        System.out.println("¡Enemigo creado!");
                                    }

                                    break;

                                case 2:
                                    System.out.println("Que desea modificar?");
                                    System.out.println("1. Mapas");
                                    System.out.println("2. Enemigos");

                                    opcionMoE = input.nextInt();
                                    while (opcionMoE < 1 || opcionMoE > 2) {
                                        System.out.println("Ingrese opcion valida!: ");
                                        opcionMoE = input.nextInt();
                                    }

                                    break;

                                case 3:
                                    System.out.println("Que desea listar?");
                                    System.out.println("1. Mapas");
                                    System.out.println("2. Enemigos");

                                    opcionMoE = input.nextInt();
                                    while (opcionMoE < 1 || opcionMoE > 2) {
                                        System.out.println("Ingrese opcion valida!: ");
                                        opcionMoE = input.nextInt();
                                    }

                                    if (opcionMoE == 1){
                                        for ( int i = 0 ; i < mapas.size() ; i++ ) {
                                            System.out.println(i + ". " + mapas.get(i));
                                        }
                                    } else if (opcionMoE == 2){
                                        for ( int i = 0 ; i < enemigos.size() ; i++) {
                                            System.out.println(i + ". " + enemigos.get(i));
                                        }
                                    }
                                    break;

                                case 4:
                                    System.out.println("Que desea borrar?");
                                    System.out.println("1. Mapas");
                                    System.out.println("2. Enemigos");

                                    opcionMoE = input.nextInt();
                                    while (opcionMoE < 1 || opcionMoE > 2) {
                                        System.out.println("Ingrese opcion valida!: ");
                                        opcionMoE = input.nextInt();
                                    }

                                    if (opcionMoE == 1) {
                                        for (int i = 0; i < mapas.size(); i++) {
                                            System.out.println(i + ". " + mapas.get(i));
                                        }
                                        System.out.print("Indice del mapa a borrar: ");
                                        int idx = input.nextInt();
                                        if (idx >= 0 && idx < mapas.size()) {
                                            mapas.remove(idx);
                                            System.out.println("Mapa eliminado.");
                                        } else {
                                            System.out.println("Indice invalido.");
                                        }
                                        
                                    } else if (opcionMoE == 2) {
                                        for (int i = 0; i < enemigos.size(); i++) {
                                            System.out.println(i + ". " + enemigos.get(i));
                                        }
                                        System.out.print("Indice del enemigo a borrar: ");
                                        int idx = input.nextInt();
                                        if (idx >= 0 && idx < enemigos.size()) {
                                            enemigos.remove(idx);
                                            System.out.println("Enemigo eliminado.");
                                        } else {
                                            System.out.println("Indice invalido.");
                                        }
                                    }
                                    break;

                                case 0:
                                    System.out.println("Regresando al menu principal del juego...");
                                    break;
                            }

                            break;

                        case 2:

                            break;

                        case 0:
                            System.out.println("Regresando al menu principal...");
                            break;
                    }

                } while (opcion2 != 0);

            } else {
                System.out.println("Saliendo...");
            }

        } while (opcion != 0);

    }

}

