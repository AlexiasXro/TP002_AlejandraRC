/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel_maras;

/**
 *
 * @author Romin
 */
public class Habitacion {
    private int numero;
    private int capacidad;
    private double precioNoche;
    private boolean disponible;
    private double facturacionTotal;

    public Habitacion(int numero, int capacidad, double precioNoche) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precioNoche = precioNoche;
        this.disponible = true;
        this.facturacionTotal = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public double getFacturacionTotal() {
        return facturacionTotal;
    }

    public void agregarFacturacion(double monto) {
        facturacionTotal += monto;
    }
}
