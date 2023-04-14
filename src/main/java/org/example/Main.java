package org.example;

import Servicios.VehiculoServicio;

public class Main {
    public static void main(String[] args) {

        VehiculoServicio vehiculoServicio = new VehiculoServicio();
        try {
            vehiculoServicio.ImprimirVehiculo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}