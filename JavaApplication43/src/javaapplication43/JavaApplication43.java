/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication43;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidadEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Digite la catidad estudiante"));
        int notaMayor=0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            int nuevaNota= Integer.parseInt(JOptionPane.showInputDialog("Digite la nota del estudiante"));
            if (nuevaNota>notaMayor){
                notaMayor=nuevaNota;
            }
        }
        
        JOptionPane.showMessageDialog(null, "La nota mayor es "+ notaMayor);
        
                
        
    }
    
}
