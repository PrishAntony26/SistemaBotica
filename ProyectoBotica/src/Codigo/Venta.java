package Codigo;

public class Venta {
    private Cliente c;
    private Lista<DetalleVenta> det;
    private double total;
    private int mes;
    
    public Venta(Cliente c, int mes) {
        this.c = c;
        this.total = 0;
        this.det = new Lista<DetalleVenta>();
        this.mes = mes;
    }
    
    public DetalleVenta[] obtenerArrayListaDetalleVenta(){
        DetalleVenta[] respuesta;
        
        respuesta = det.TrasaladarListaVectorDetalleVenta();
        return respuesta;
    }
    
    public void agregarDetalleVenta(Medicamento m, int cantidad){
        DetalleVenta d = new DetalleVenta(m,cantidad);
        this.total = this.total + d.getSubtotal();
        det.InsertarDatoFinal(d);
    }
    
    public int contadorDetalleVenta(){
        return det.CantidadElementos();
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public Lista<DetalleVenta> getDet() {
        return det;
    }

    public void setDet(Lista<DetalleVenta> det) {
        this.det = det;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
}
