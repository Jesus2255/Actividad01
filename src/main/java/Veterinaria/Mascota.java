/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Veterinaria;

/**
 *
 * @author estiv
 */
public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private boolean vacunado;

    public Mascota(String nombre, String especie, int edad, boolean vacunado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.vacunado = vacunado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }


    public void mostrarInformacion() {
        System.out.println("Informacion de la mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Vacunado: " + (vacunado ? "Si" : "No"));
        System.out.println("--------------------------");
    }
}