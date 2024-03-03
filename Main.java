/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package main;
/**
 *
 * @author joseleon
 */

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta ("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        operativa_cuenta(cuenta1, 0);     
    }
    
    private static void operativa_cuenta(CCuenta cuenta1,int Float){
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al reitar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }    
    }
    
}



public class Main {

    

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}