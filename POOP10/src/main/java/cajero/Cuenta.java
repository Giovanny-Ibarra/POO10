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
public class Cuenta {
    private double saldo;
    
    public Cuenta(){
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar( double monto ){
        System.out.println("Depositando: " + monto + " pesos");
        saldo += monto; 
    }
    
    public void retirar( double monto ) throws SaldoinsuficienteException {
        System.out.println("Retirar: " + monto + " de pesos de mi cuenta");
        if( saldo < monto ){
            throw new SaldoinsuficienteException();
        }else{
            saldo-=monto;
        }
        System.out.println("Nuevo saldo es: " + saldo + " pesos");
    }
}
