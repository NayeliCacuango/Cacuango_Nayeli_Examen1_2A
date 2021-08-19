/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;

/**
 *
 * @author Home
 */
public class Aplicacion {
  public static void main(String[] args) {

  Cliente c1 = new Cliente();
  
  c1.setNombrecompleto("Nayeli Cacuango");
  c1.setTelefono_contacto("0967501444");
  c1.setEdad("18");
 
        System.out.println("Nombre Cliente: "+c1.getNombrecompleto()+
                "\nTelefono Contacto: "+c1.getTelefono_contacto()+
               "\nEdad: "+c1.getEdad());
        

    }
 }   
