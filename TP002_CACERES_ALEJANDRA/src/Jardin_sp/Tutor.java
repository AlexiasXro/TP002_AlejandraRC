/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jardin_sp;

/**
 *
 * @author Romin
 */
public class Tutor {
    // Atributos
    private String nombre;
    private String apellido;
    private String relacion;
    private String direccion;
    private String email;
    private String telefono;
    private Alumno alumno;

    // Constructor
    public Tutor(String nombre, String apellido, String relacion, String direccion, String email, String telefono, Alumno alumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.relacion = relacion;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.alumno = alumno;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}

