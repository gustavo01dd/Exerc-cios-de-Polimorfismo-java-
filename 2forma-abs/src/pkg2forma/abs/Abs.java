/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2forma.abs;

/**
 *
 * @author gugaa
 */
public class Abs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Forma[] formas = {
            new Circulo(3),
            new Retangulo(4, 5)
        };

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
    
}
