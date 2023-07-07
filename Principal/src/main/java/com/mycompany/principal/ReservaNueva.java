
package com.mycompany.principal;

public class ReservaNueva {
    private final int dni;
    private final String direccion;
    private final String nombreapellido;
    private final String telefono;
    private final int idCliente;
   
      
    public ReservaNueva(int dni, String direccion, String nombreapellido, String telefono, int idCliente) {
        this.dni = dni;
        this.direccion = direccion;
        this.nombreapellido = nombreapellido;
        this.telefono = telefono;
        this.idCliente = idCliente;
    }
    
    public int getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreapellido() {
        return nombreapellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getIdCliente() {
        int numero = (int)(Math.random()*(200-10+1)+10);
        return idCliente;
    }
    
    @Override
    public String toString() {
        return "ReservaNueva{" + "dni=" + dni + ", direccion=" + direccion + ", nombreapellido=" + nombreapellido + ", telefono=" + telefono + ", idCliente=" + idCliente + '}';
    }   
}
