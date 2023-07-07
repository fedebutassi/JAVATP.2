
package com.mycompany.principal;

public class Garage {
    private int nro;
    private String auto;
    boolean disponibilidad;
    
    public Garage(int nro, String auto, boolean disponibilidad) {
        this.nro = nro;
        this.auto = auto;
        this.disponibilidad = disponibilidad;
    }    
    
    public void garages(int nro, String auto){
        
    }
    public int getNro() {
        return nro;
    }

    public String getAuto() {
        return auto;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }
    public String getDatosGareges(int nro, String auto){
        return "Garages: " + nro + auto;
    }
    
}
