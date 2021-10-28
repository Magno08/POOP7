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
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        if (sueldo > 0)
            this.sueldo = sueldo;
        else
            this.sueldo = 0;
        
    }
    
    public int aumentarSueldo(int porcentaje){
        sueldo += (sueldo * porcentaje/100) ;
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
}
