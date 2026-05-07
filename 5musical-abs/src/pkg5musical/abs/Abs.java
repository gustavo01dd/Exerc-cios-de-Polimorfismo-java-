/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5musical.abs;

/**
 *
 * @author gugaa
 */
public class Abs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical piano = new Piano();

        guitarra.tocar();
        piano.tocar();
    }
    
}
