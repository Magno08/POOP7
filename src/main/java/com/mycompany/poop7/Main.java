/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author Magno
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(25_000);
        System.out.println(ger);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre gerente: "+ger.getNombre());
        
        Gerente ger2 = new Gerente (120_000,"Karen Avalos",596723,80_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente(0,"Samanta Rios",358625,35_000);
        System.out.println(ger3);
        System.out.println("##########Instancias##########");
        
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es instasncia de Gerente");
        }
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es instancia de Empleado");
            if (ger instanceof Object) {
                System.out.println("Gerente es instancia de Objetc");
            }
        }
    }
    
}
