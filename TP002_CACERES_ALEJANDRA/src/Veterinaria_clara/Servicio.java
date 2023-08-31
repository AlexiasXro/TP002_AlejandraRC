/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Veterinaria_clara;

/**
 *
 * @author Romin
 */
public class Servicio {
    private String nombre;
    private Profesional profesional;
    private Mascota mascota;
    private String fecha;
    private String resultado;
    private String tipoServicio;
    private double tarifa;

    public Servicio(String nombre, Profesional profesional, Mascota mascota, String fecha, String resultado, String tipoServicio, double tarifa) {
        this.nombre = nombre;
        this.profesional = profesional;
        this.mascota = mascota;
        this.fecha = fecha;
        this.resultado = resultado;
        this.tipoServicio = tipoServicio;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

   /* @Override
    public String toString() {
        return "Servicio: " + nombre + "\n" +
                "Profesional: " + profesional + "\n" +
                "Mascota: " + mascota + "\n" +
                "Fecha: " + fecha + "\n" +
                "Resultado: " + resultado + "\n" +
                "Tipo de Servicio: " + tipoServicio + "\n" +
                "Tarifa: " + tarifa;
            */
    
}
