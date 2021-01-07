/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * Esta es la clase Circulo de la practica 10
 * @author Giovanny Sanchez, Eduardo Javier Mejia
 */
public class Cajero {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.depositar(500);
        try{
            cuenta.retirar(300);
            cuenta.retirar(100);
            cuenta.retirar(200);
        }catch( SaldoinsuficienteException ex){
            System.out.println("Saldo insuficiente");
        }
        
    }
}
