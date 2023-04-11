package Persistencia;

public class VehiculoDao extends Dao{
    public List<Vehiculo> getVehiculo() throws Exception {
        try {
            String sql = "SELECT * FROM Registros;";

            queryDatabase(sql);

            List<Vehiculo> vehiculos = new ArrayList<>();
            Vehiculo vehiculo;

            while (resultSet.next()) {
                vehiculo = new Vehiculo();

                vehiculo.setId(resultSet.getInt(1));
                vehiculo.setMarca(resultSet.getString(2));
                vehiculo.setModelo(resultSet.getInt(3));
                vehiculo.setColor(resultSet.getString(4));
                vehiculo.setStock_disponible(resultSet.getInt(5));

                vehiculos.add(vehiculo);
            }

            return vehiculos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("ERROR!!!..Ha ocurrido un error al obtener vehiculo");
        } finally {
            disconnectDatabase();
        }
    }


}
