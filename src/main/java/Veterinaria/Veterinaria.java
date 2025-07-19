/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria;

/**
 *
 * @author estiv
 */
public class Veterinaria {
    public static void main(String[] args) {
        // Crear tres objetos Mascota
        Mascota mascota1 = new Mascota("Firulais", "Perro", 5, true);
        Mascota mascota2 = new Mascota("Michi", "Gato", 3, false);
        Mascota mascota3 = new Mascota("Bugs", "Conejo", 2, true);

        // Mostrar información de las mascotas
        mascota1.mostrarInformacion();
        mascota2.mostrarInformacion();
        mascota3.mostrarInformacion();
    }
}
