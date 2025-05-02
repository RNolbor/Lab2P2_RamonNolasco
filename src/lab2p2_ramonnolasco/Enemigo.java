/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_ramonnolasco;

/**
 *
 * @author ramon
 */
public class Enemigo {
    String tipo;
    int vida, ataque;

    public Enemigo(String tipo, int vida, int ataque) {
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Vida: " + vida + ", Ataque: " + ataque;
    }
}


