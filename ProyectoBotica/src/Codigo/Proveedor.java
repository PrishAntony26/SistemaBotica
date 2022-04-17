package Codigo;

public class Proveedor {
    private String nombre;
    private int codigo;
    private String marca;

    public Proveedor() {

    }

    public Proveedor(String nombre, int codigo, String marca) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nombre=" + nombre + ", codigo=" + codigo + ", marca=" + marca + '}';
    }

}
