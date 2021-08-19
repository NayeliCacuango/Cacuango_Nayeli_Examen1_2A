/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

public class Empleado extends Persona{
 
    private double sueldo_bruto;

    public Empleado() {
       
    }

    public Empleado(double sueldo_bruto, String nombrecompleto, String Edad) {
        super(nombrecompleto, Edad);
        this.sueldo_bruto = sueldo_bruto;
    }

  

    
    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
    
}
