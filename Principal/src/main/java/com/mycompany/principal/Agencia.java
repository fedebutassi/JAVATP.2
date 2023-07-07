
package com.mycompany.principal;

public enum Agencia {
    agencia1 ("AG automotores", "Espania 1234", "3571238923"),
    agencia2("Gioda automotores", "Savio 125", "3571328920"),
    agencia3("Petiti", "Dean Funes 345","3571283922");
   
   private final String nombre;
   private final String direccion;
   private final  String telefono;

    private Agencia(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
   
   
   
    @Override
   public String toString(){
       
        return  "Agencia: " + nombre +" - "+ "Direccion: " + direccion+" - " + "Telefono de contacto:" +" "+telefono;
       
   }  
}


