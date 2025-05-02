/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_ramonnolasco;

/**
 *
 * @author ramon
 */
public class Mapa {
    String nombreZona, clima;
    int efectoHeroe, efectoEnemigos;

    public Mapa(String nombreZona, String clima, int efectoHeroe, int efectoEnemigos) {
        this.nombreZona = nombreZona;
        this.clima = clima;
        this.efectoHeroe = efectoHeroe;
        this.efectoEnemigos = efectoEnemigos;
    }

    @Override
    public String toString() {
        return "Zona: " + nombreZona + ", Clima: " + clima + ", Efecto en Héroe: " + efectoHeroe + ", Efecto en Enemigos: " + efectoEnemigos;
    }
}


