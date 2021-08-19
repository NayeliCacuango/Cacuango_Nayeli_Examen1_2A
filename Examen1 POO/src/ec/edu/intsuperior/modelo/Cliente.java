/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;


 
    public class Cliente extends Persona{
  private String telefono_contacto;

    
  public Cliente (){
      
  }
  public Cliente(String telefono_contacto, String nombrecompleto, String Edad) {
        super(nombrecompleto, Edad);
        this.telefono_contacto = telefono_contacto;
    }


    public String getTelefono_contacto() {
        return telefono_contacto;
    }

    public void setTelefono_contacto(String telefono_contacto) {
        this.telefono_contacto = telefono_contacto;
    }

   
  
}   

