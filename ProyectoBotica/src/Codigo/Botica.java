package Codigo;

public class Botica {
    private String nombre;
    private int id;
    public static Inventario inv = new Inventario();
    public static VentasBotica vent = new VentasBotica();
    
    public Botica() {
        nombre = "Botica TuSalud";
        id = 972782;     
    }

    public Botica(String nombre, int id, int CantidadEmpleado) {
        this.nombre = nombre;
        this.id = id;    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void establecerDatosSistema(){
        añadirMedicamento("Termometro", 10, 5);
        añadirMedicamento("Toallita", 13, 3.2);
        añadirMedicamento("Panadol", 9, 0.1);
        añadirMedicamento("Cepillo", 19, 10);
        añadirMedicamento("Desodorante Axe", 20, 3.5);
        añadirMedicamento("Shampu", 29, 8.2);
        añadirMedicamento("Jarabe tos", 39, 5);
        añadirMedicamento("Amoxicilina", 49, 0.1);
        añadirMedicamento("Gotas para ojos",49, 15);
        añadirMedicamento("Vitaminas", 59, 3);
        
        añadirVentaCliente("72896029","Rahmat Velasquez",20 ,1 ,"Penicilina",2,2); //String dni, String nombre, int edad, int mes, String medicamento, double precio, int cantidad
        añadirVentaCliente("72481614","Brayan Salvatierra",30,2,"Pastilla Cafeina", 5,8);
        añadirVentaCliente("75315314","Jair Llican",40,2,"Vitaminas", 3,8);
        añadirVentaCliente("77832314","Pablo Escobar",80,3,"Cepillo", 19,7);
        añadirVentaCliente("74277255","Raul Saldivar",39,5,"Pastilla Tos", 0.2,4);
        añadirVentaCliente("78241414", "Pedro Picapiedra", 50, 4,"Penicilina", 2.2, 2);
        añadirVentaCliente("19324840", "Ben Tennyson", 19, 6,"Vitaminas", 4, 9);
        añadirVentaCliente("14645838", "Harry Odinson", 17, 7, "Jarabe", 5.6, 1);
        añadirVentaCliente("19410248", "Peter Parker", 41, 3, "Pastillas", 3, 10);
        añadirVentaCliente("10942344", "Prish Dominguez", 20, 9, "Jabon", 4, 6);
        añadirVentaCliente("12414121", "Johann Gutierrez", 19, 10, "Cepillo", 2, 1);
        añadirVentaCliente("13215152", "Shrek", 34, 11, "Jabon Ogro", 3, 10);
        añadirVentaCliente("94201423", "Harry Osborn", 29, 3, "Vendas", 1, 20);
        
        añadirVentaCliente("42145533", "Natasha Romanov", 27, 1, "Vendas", 2, 10);
        añadirVentaCliente("12432512", "Steve Rogers", 70, 1, "Vitaminas", 3, 9);
        añadirVentaCliente("10241424", "Nick Fury", 40, 1, "Gotas para ojos", 16, 1);
        añadirVentaCliente("11242014", "Ron Weasley", 17, 1, "Hisopo", 4, 1);
        añadirVentaCliente("15643623", "Hermione Granger", 17, 1,"Jarabe", 3, 2);
        
        añadirVentaCliente("58129414", "Clark Kent", 22, 2, "Vitaminas", 4, 10);
        añadirVentaCliente("121413531", "Flahs Tompson", 15, 2, "Vendaje", 2, 1);
        añadirVentaCliente("156136622", "Lucy Morales", 21, 2, "Pasta dental", 6, 2);
        añadirVentaCliente("784451321", "Andrea Suarez", 70, 2, "Vaporub", 8, 1);
        
        añadirVentaCliente("981314442", "Octavius", 45, 3, "Paracetamol", 0.1, 20);
    }
    
    public void añadirMedicamento(String medicamento, int stock, double precio){
        Botica.inv.agregarMedicamento(medicamento, stock, precio);
    }
    
    public void añadirVentaCliente(String dni, String nombre, int edad, int mes, String medicamento, double precio, int cantidad){
        Venta v = new Venta(new Cliente(dni, nombre, edad),mes);
        v.agregarDetalleVenta(new Medicamento(medicamento, precio), cantidad);
        Botica.vent.AgregarVenta(v);
    }
    
}
