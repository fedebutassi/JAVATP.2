
package com.mycompany.principal;

public enum Reservas {
    reserva1(11.12,12.01, 12500),
    reserva2(10.11,10.12,11200);
   double fechainicio;
   double fechafin;
   double preciototal;

    private Reservas(double fechainicio, double fechafin, double preciototal) {
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.preciototal = preciototal;
    }

    public static Reservas getReserva1() {
        return reserva1;
    }

    public static Reservas getReserva2() {
        return reserva2;
    }

    public double getFechainicio() {
        return fechainicio;
    }

    public double getFechafin() {
        return fechafin;
    }

    public double getPreciototal() {
        return preciototal;
    }

    @Override
    public String toString() {
        return "Reservas{" + "fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", preciototal=" + preciototal + '}';
    }
   
}
