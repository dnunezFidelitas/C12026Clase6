/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c12026clase6;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C12026Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RedSocial insta = new RedSocial();
        insta.venderAnuncio("Nueva");
        
        Mentira viti = new Mentira();
        viti.setAltura(165);
        viti.setEdad(41);
        viti.setPeso(85);
        viti.setSalario(1000000.00);
        
        
        JOptionPane.showMessageDialog(null, "Altura " + viti.getAltura() + "\n" +
                                            "Edad " + viti.getEdad() + "\n" +
                                            "Peso " + viti.getPeso() + "\n" +
                                            "Salario " + viti.getSalario() + "\n" 
                                            );
        
        JOptionPane.showMessageDialog(null, viti.toString());
                
                
        Mentira sebas = new Mentira(24, 174, 80);
        
         JOptionPane.showMessageDialog(null, "Altura " + sebas.getAltura() + "\n" +
                                            "Edad " + sebas.getEdad() + "\n" +
                                            "Peso " + sebas.getPeso() + "\n" +
                                            "Salario " + sebas.getSalario() + "\n" 
                                            );
        JOptionPane.showMessageDialog(null, sebas.toString());
        
        ;
        
        
        Producto productoA = new Producto("Botellas");
        
        Producto productoB = new Producto("Tenis");
        
        JOptionPane.showMessageDialog(null, productoA.toString());
        JOptionPane.showMessageDialog(null, productoB.toString());
        
        JOptionPane.showMessageDialog(null, Mentira.anotacion);
        
        
    }
    
    public static void metodo1(){
    
    }
    
    public static void metodo1(String valor1){
    
    }
    
    public static void metodo1(String valor1, int asd){
    
    }
    
    public static void metodo1(int valor1){
    
    }
    
    
}
