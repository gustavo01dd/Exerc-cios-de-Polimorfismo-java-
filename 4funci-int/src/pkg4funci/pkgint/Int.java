/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4funci.pkgint;

/**
 *
 * @author gugaa
 */
public class Int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();

        System.out.println("Salário gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário vendedor: R$ " + vendedor.calcularSalario());
    }
    
}
