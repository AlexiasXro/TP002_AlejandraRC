/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria_clara;

/**
 *
 * @author Romin
 */
public class Mascota {
    // Atributos
    private String nombre;
    private String sexo;
    private int edad;
    private String raza;
    private String especie;
    private double peso;
    private String color;
    private boolean libreta;

    // Constructor
    public Mascota(String nombre, String sexo, int edad, String raza, String especie, double peso, String color, boolean libreta) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.raza = raza;
        this.especie = especie;
        this.peso = peso;
        this.color = color;
        this.libreta = libreta;
    }

    Mascota(String max, String perro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLibreta() {
        return libreta;
    }

    public void setLibreta(boolean libreta) {
        this.libreta = libreta;
    }
}

