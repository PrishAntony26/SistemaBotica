package Codigo;
import java.io.Serializable;

public class Medicamento implements Serializable{
    private String codigo;
    private String nombre;
    private int stock;
    private boolean Receta;
    private double precio;
    private static int cantidad = 0;
    
    public Medicamento(){
        codigo="000";
        nombre = "Vacio";
        stock = 0;
        Receta = false;
        precio = 0;
    }
    
    public Medicamento(String nombre, double precio){
        cantidad++;
        codigo= Integer.toString(cantidad*5+5);
        this.nombre = nombre;
        stock = 0;
        Receta = false;
        this.precio = precio;
    }
    
    public Medicamento(String nombre, int stock, double precio) {
        cantidad++;
        this.codigo = Integer.toString(cantidad*5+5);
        this.nombre = nombre;
        this.stock = stock;
        this.Receta = false;
        this.precio = precio;
    }
    
    public void añadirCantidad(){
        cantidad++;
    }
    
    
    @Override //Sobreescritura metodo equals
    public boolean equals(Object obj){
        Medicamento c = (Medicamento) obj;
        if(this.getCodigo().equals(c.getCodigo())){
            return true;
        }
        return false;
    }

    @Override //Sobreescritura metodo toString
    public String toString(){
        return codigo + " " + nombre + " " + stock + " " + precio;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isReceta() {
        return Receta;
    }

    public void setReceta(boolean Receta) {
        this.Receta = Receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Medicamento.cantidad = cantidad;
    }

}
