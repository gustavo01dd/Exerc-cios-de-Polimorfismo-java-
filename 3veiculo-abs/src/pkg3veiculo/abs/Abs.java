/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3veiculo.abs;

/**
 *
 * @author gugaa
 */
public class Abs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
    
}

