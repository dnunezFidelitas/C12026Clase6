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
public class Mentira {
    // atributos
    private int edad;
    private double salario;
    private int altura;
    private double peso;
    public static String anotacion ="Los datos que devuelve esta clase son mentira";
    
    // constructor

    public Mentira(int edad, int altura, double peso) {
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        Random nuevo = new Random();
        this.salario = nuevo.nextDouble(3000000);
    }

    public Mentira() {
    }
    
    
    
    
    // metodos
    public int getEdad() {
        return edad-10;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario+500000.00;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAltura() {
        int resultado = 0;
        if (altura>175)
            resultado=altura;
        else
            resultado=altura+5;
        return resultado;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        Random random = new Random();
                
        return peso -random.nextInt(1, 10);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mentira{" + "edad=" + edad + ", salario=" + salario + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
    
    
    
}
