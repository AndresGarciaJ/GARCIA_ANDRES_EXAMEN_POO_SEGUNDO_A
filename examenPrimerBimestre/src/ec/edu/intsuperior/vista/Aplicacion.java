package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;

public class Aplicacion {
     public static void main(String[] args) {
         Cliente c1=new Cliente();
         c1.setTelefonoDeContacto("0959586879");
         
        
         System.out.println("El telefono de contacto del cliente es: "+c1.getTelefonoDeContacto());
     }
}
