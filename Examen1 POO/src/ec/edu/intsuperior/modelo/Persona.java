/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author Home
 */
public class Persona {
  private String nombrecompleto;
private String Edad;

 public Persona (){
     
 }
 
public Persona(String nombrecompleto, String Edad) {
        this.nombrecompleto = nombrecompleto;
        this.Edad = Edad;
    }



 public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
   public void mostrar(){
       System.out.println("Hola Mundo");
}
  
}
