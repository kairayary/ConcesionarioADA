package Servicios;


import Entidad.Vehiculo;
import Persistencia.VehiculoDao;

import java.util.List;

//traer logica dao
public class VehiculoServicio {

    private final VehiculoDao vehiculoDao;

    public VehiculoServicio(){
        vehiculoDao = new VehiculoDao();
    }


    //metodo para imprimir con try-catch exception
    public void ImprimirVehiculo() throws Exception {
        try {

            List<Vehiculo> vehiculo = vehiculoDao.getVehiculo();


            if (vehiculo.isEmpty()){
                throw new Exception("El vehiculo no existe.");
            }else{
                System.out.println("Lista vehiculos: ");
                System.out.printf("%-10s%-15s%-15s%-20s\n","ID","MARCA", "MODELO", "COLOR", "STOCK_DISPONIBLE");

                for (Vehiculo vehiculos : vehiculo) {
                    System.out.printf("%-10s%-15s%-15s%-20s\n", vehiculo.getId(),
                            vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getColor(), vehiculo.getStock_disponible());
                }
            }
        }catch (Exception e){
            throw e;
        }
    }
}
