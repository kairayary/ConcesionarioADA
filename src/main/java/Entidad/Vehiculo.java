package Entidad;
public class Vehiculo {

    private String marca;
    private String modelo;
    private String color;
    private int stock_disponible;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String color, int stock_disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.stock_disponible = stock_disponible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock_disponible() {
        return stock_disponible;
    }

    public void setStock_disponible(int stock_disponible) {
        this.stock_disponible = stock_disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", stock_disponible=" + stock_disponible +
                '}';
    }
}
