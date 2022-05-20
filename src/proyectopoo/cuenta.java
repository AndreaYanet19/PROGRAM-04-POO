/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo;

/**
 *
 * @author andys
 */
public class cuenta {
    private String nombre;
    private String apellido;
    private int edad;
    private double cantidad;

    public cuenta(String nombre, String apellido, int edad, double cantidad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cantidad = cantidad;
    }

    public cuenta() {
    }

    public cuenta(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
}
