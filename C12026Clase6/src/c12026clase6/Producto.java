/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c12026clase6;

import java.util.Random;

/**
 *
 * @author viti
 */
public class Producto {
    // attributo
    private String codigo;
    private String nombre;
    
    // constructor

    public Producto(String nombre) {
        Random random = new Random();
        codigo="Prd"+random.nextInt(1000000);
        this.nombre=nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
