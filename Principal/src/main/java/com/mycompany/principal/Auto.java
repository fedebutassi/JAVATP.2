
package com.mycompany.principal;

public enum Auto {
    auto1(3550, 12.4, "NXT", 345, "Rojo", "Mazda", true),
    auto2(2230, 11.5,"HWP", 352, "Verde", "Nissan", false),
    auto3(2230, 14.2, "PIO", 569, "Negro", "Nissan", true),
    auto4(4539, 16.5, "FTO", 469, "Negro", "Ferrari", true),
    auto5(3459, 12.5, "TRO", 589, "Blanco", "Peugeot", false),
    auto6(1890, 10.5,"POO",789, "Rojo", "Fiat", true);
    private final int precioAuto;
    private final double naftaDep;
    private final String matricula1;
    private final int matricula2;
    private final String color;
    private final String marca;
    final boolean disponibilidad;
    
    private Auto (int precioAuto, double naftaDep, String matricula1, int matricula2, String color, String marca, boolean disponibilidad) {
        this.precioAuto = precioAuto;
        this.naftaDep = naftaDep;
        this.matricula1 = matricula1;
        this.matricula2 = matricula2;
        this.color = color;
        this.marca = marca;
        this.disponibilidad = disponibilidad;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public static Auto getAuto1() {
        return auto1;
    }

    public static Auto getAuto2() {
        return auto2;
    }

    public static Auto getAuto3() {
        return auto3;
    }

    public static Auto getAuto4() {
        return auto4;
    }

    public static Auto getAuto5() {
        return auto5;
    }

    public static Auto getAuto6() {
        return auto6;
    }
    public String getDisponibilidadString() {
        return disponibilidad ? "Disponible" : "No disponible";
    }
    
     @Override
   public String toString(){
       
        return  "Auto: " +"$"+ precioAuto +" - "+ "Nafta disponible: " + naftaDep+" - " + "Matricula:" +" "+matricula1+matricula2 + "\n" + "Color: " +color +" - " + "Marca: " + marca + "\n" + getDisponibilidadString();
       
   }
    
    }
