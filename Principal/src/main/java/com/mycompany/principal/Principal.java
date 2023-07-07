
package com.mycompany.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
        Agencia[] agencias = Agencia.values();
          System.out.println("AGENCIAS DISPONIBLES EN LA ZONA");
          System.out.println("");
          for(int i = 0; i < agencias.length; i++){
              System.out.println((i + 1) + ")" + agencias[i]);
          }
          System.out.println("");
          System.out.println("Cada agencia en cuestion, tiene un total de 2(dos) garages");
          System.out.println("---------------------------------------------------------------------");
          System.out.println("-" + Agencia.agencia1+ "\n" + "Tiene solo uno de sus dos lugares disponibles para alquilar.");
          
          Auto[] autos = Auto.values();
          System.out.println("");
          for (int i = 0; i < autos.length-4; i++) {
              System.out.println((i+1) + "-" + autos[i]);
        }
         System.out.println("-------------------");
         System.out.println("-" + Agencia.agencia1+ "\n" + "Tiene dos de sus lugares disponibles para alquilar.");
         System.out.println("");
          for (int i = 2; i < autos.length-2; i++) {
              System.out.println((i+1) + "-" + autos[i]);
        }
          System.out.println("");
         System.out.println("-------------------");
         System.out.println("");
         System.out.println("-" + Agencia.agencia1+ "\n" + "Tiene solo uno de sus dos lugares disponibles para alquilar.");
         System.out.println("");
          for (int i = 4; i < autos.length; i++) {
              System.out.println((i+1) + "-" + autos[i]);
        }
          System.out.println("//////////////////////////////////////");
          System.out.println("Estos autos no estan disponibles: ");
          
          for (Auto auto : Auto.values()) {
            if (!auto.disponibilidad) {
            System.out.println(auto);
            }
            }
          System.out.println("Alquilados por los siguientes clientes");
          System.out.println("");
          System.out.println(Auto.auto2.getMarca() +") Fue entregado el dia "+ Reservas.getReserva1().getFechainicio());
          System.out.println(" Sera devuelto el dia " + Reservas.getReserva1().getFechafin());
          System.out.println(" Por un valor total de: " + Reservas.reserva1.getPreciototal());
          Cliente[] clientes = Cliente.values();
          for (int i = 0; i < clientes.length -1; i++) {
                    System.out.println((i+1) + "-" + clientes[i]);
                }
          System.out.println("");
          System.out.println(Auto.auto5.getMarca() + ") Fue entregado el dia "+ Reservas.getReserva2().getFechainicio());
          System.out.println(" Sera devuelto el dia " + Reservas.getReserva2().getFechafin());
          System.out.println(" Por un valor total de: " + Reservas.reserva2.getPreciototal());
          for (int i = 1; i < clientes.length; i++) {
                    System.out.println((i+1) + "-" + clientes[i]);
                }
          System.out.println("-----------------");
          System.out.println("Desea alquilar alguno de estos otros?");
          System.out.println();
          for (Auto auto : Auto.values()) {
            if (auto.disponibilidad) {
            System.out.println(auto);
                }
            }
    
        Scanner entrada = new Scanner(System.in);
        char respuesta;
        int opcion;

        do {
            do {
                System.out.println("Qué auto desea?");
                System.out.println("1. " + Auto.auto1.getMarca());
                System.out.println("2. " + Auto.auto3.getMarca());
                System.out.println("3. " + Auto.auto4.getMarca());
                System.out.println("4. " + Auto.auto6.getMarca());
                System.out.print("Opción: ");
                opcion = entrada.nextInt();
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1:
                    System.out.println("Usted seleccionó: " + Auto.auto1);
                    break;
                case 2:
                    System.out.println("Usted seleccionó: " + Auto.auto3);
                    break;
                case 3:
                    System.out.println("Usted seleccionó: " + Auto.auto4);
                    break;
                case 4:
                    System.out.println("Usted seleccionó: " + Auto.auto6);
                    break;
            }

            System.out.print("\nDesea seleccionar otro auto (SI/NO)?: ");
            respuesta = entrada.next().charAt(0);
            System.out.println();
        } while (respuesta == 's' || respuesta == 'S');
        boolean ejecutarBucle = true;
        boolean datosCompletos = false;
        
         do{
                 
             System.out.println("Ingrese sus datos personales para confirmar la transaccion: ");
             System.out.println("Nombre: ");
             String nombre;
             nombre = entrada.next();
             
             System.out.println("Apellido: ");
             String apellido;
             apellido = entrada.next();
             
             System.out.println("DNI: ");
             String dni;
             dni = entrada.next();
             
             System.out.println("Direccion: ");
             String direccion;
             direccion = entrada.next();
             
             System.out.println("Telefono: ");
             String telefono;
             telefono = entrada.next();
             System.out.println("----------TRANSACCION CONFIRMADA----------");
             
             switch (opcion) {
                 
                case 1:
                        System.out.println("Enhorabuena " + nombre +" "+ apellido+"\n"+
                        "HA RESERVADO EL AUTO: " + "\n" +" " +
                     opcion+" "+Auto.auto1);

                break;
                case 2:
                        System.out.println("Enhorabuena " + nombre +" "+ apellido+"\n"+
                        "HA RESERVADO EL AUTO: " + "\n" +
                     opcion+" "+Auto.auto3);               

                        break;
                case 3:
                        System.out.println("Enhorabuena " + nombre +" "+ apellido+"\n"+
                        "HA RESERVADO EL AUTO: " + "\n" +
                     opcion+" "+Auto.auto4);          

                        break;
                case 4:
                        System.out.println("Enhorabuena " + nombre +" "+ apellido+"\n"+
                        "HA RESERVADO EL AUTO: " + "\n" +
                        opcion+" "+Auto.auto6);      
                    break;
                    
             }

    // verificar si los datos están completos
                if (!nombre.isEmpty() && !apellido.isEmpty() && !dni.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty()) {
                datosCompletos = true;
    }

    // verificar si se deben interrumpir los bucles
    if (datosCompletos || respuesta == 'n' || respuesta == 'N') {
        ejecutarBucle = false;
    }

        } while (ejecutarBucle);
         
         }
         }

         


    

    

    
