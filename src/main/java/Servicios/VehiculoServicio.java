package Servicios;


//traer logica dao
public class VehiculoServicio {

    private final VehiculoDao vehiculoDao;

    public VehiculoServicio(){ vehiculoDao = new VehiculoServicio();}


    //metodo para imprimir con try-catch exception
    public void ImprimirVehiculo() throws Exception {

        try {
            List(vehiculo.isEmpty()){
                throw new Excepetion("El vehiculo no existe.")
            }else{
                System.out.println("Lista vehiculos: ");
                System.out.println("");
            }
        }catch (Exception e){
            throw e;
        }
    }
}
