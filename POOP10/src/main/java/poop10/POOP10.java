/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * Esta es la clase Circulo de la practica 10
 * @author Giovanny Sanchez, Eduardo Javier Mejia
 */
public class POOP10 {
    public static void main(String[] args) {
        System.out.println(" ============={ 1 }===========");
        try{
            String mensajes[] = {"Antonio", "Javier", "Gabriela" };
            for( int i = 0; i < 4; ++i ){
                System.out.println( mensajes[ i ]);
            }
        }catch( ArrayIndexOutOfBoundsException aiea){  
            System.out.println("Error: apuntador fuera de rango");
        }
        System.out.println(" ============={ 2 }===========");
        try{
            float equis = 5/0;
            System.out.println(" Equis = " + equis );
        }catch( ArithmeticException ae){
            System.out.println("Error: división entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta el finally");
        }
        System.out.println("Fuera de try catch");
        
        //ArithmeticException ae = ;
        
        System.out.println(" ============={ 3 }===========");
        try{
            float equis = 5/0;
            System.out.println(" Equis = " + equis );
        }catch( ArrayIndexOutOfBoundsException aiea){
            System.out.println("Error: apuntador fuera de rango");
        }catch( ArithmeticException ae){
            System.out.println("Error: división entre cero");
        }catch( Exception e){
            System.out.println("Excepsion general");
        }finally{
            System.out.println("A pesar de todo, se ejecuta el finally");
        }
        System.out.println("Fuera de try-catch");
        
        System.out.println(" ============={ 4 }===========");
        //Propagacion de exceptions
        try{
            int division = division(8,0);
            System.out.println("Division = "+ division);  
        }catch( ArithmeticException e ){
            System.out.println("Exception aritmetica");
            //e.printStackTrace //hace cosas raraz
        }
        /*int division = division(8,0);
        System.out.println("Division = "+ division);*/
        
        System.out.println(" ============={ 4 }===========");
         try{
            int division = division2(8,0);
            System.out.println("Division = "+ division);  
        }catch( ArithmeticException e ){
            System.out.println("Exception aritmetica");
            //e.printStackTrace //hace cosas raraz
        }
    }
    
    public static int division ( int a, int b ) throws ArithmeticException {
        int c;
        /*try{
            c = a/b;
        }catch( ArithmeticException e ){
            c = 0;
        }*/
        c = a/b;
        return c;
    }
    
    public static int division2( int a, int b ) throws ArithmeticException{
        if( b== 0 ){
            throw new ArithmeticException();
        }
        int c = a/b; 
        return c;
    }
}
