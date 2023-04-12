package org.example;

public class Main {
    public static void main(String[] args) {

        VehiculoServicio vehiculoServicio = new VehiculoServicio();
        try {
            VehiculoServicio.ImprimirVehiculo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}