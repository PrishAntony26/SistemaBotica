package Codigo;

public class Persona {

    private String DNI;
    private String nombre;
    private int edad;

    public Persona() {

    }

    public Persona(String DNI, String nombre, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        String c = String.format("Persona = %-8d %15s %15s %2d", DNI, nombre, edad);
        return c;
    }

}
