
package com.mycompany.principal;

public enum Cliente {
    cliente1(00234, "Butassi Federico", 41280335, "Espania 348", "3571327923"),
    cliente2(00563, "Jeff Bezos", 31023892, "Dean Funes 1244", "3571890293");
    
    private final int dni;
    private final String direccion;
    private final String nombreapellido;
    private final String telefono;
    private final int idCliente;
    
  private Cliente(int idCliente,String nombreapellido, int dni, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.direccion = direccion;
        this.nombreapellido = nombreapellido;
        this.telefono = telefono;
    }
  
    @Override
  public String toString(){
       
        return  "Cliente: id" +idCliente +"\n"+ nombreapellido +"\n"+ "DNI: " + dni +" - " + "Direccion:" +" "+direccion + "\n" + "Telefono: " +telefono ;
       
   }

}
