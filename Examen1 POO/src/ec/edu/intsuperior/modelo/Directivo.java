/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

public class Directivo extends Empleado{
private String categoria;

    public Directivo() {
        
    }

    public Directivo(String categoria, double sueldo_bruto, String nombrecompleto, String Edad) {
        super(sueldo_bruto, nombrecompleto, Edad);
        this.categoria = categoria;
    }

   


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
