package Codigo;

public class DetalleVenta {
    private Medicamento m;
    private int cantidadComprada;
    private double Subtotal;

    public DetalleVenta() {
        
    }

    public DetalleVenta(Medicamento m, int cantidadComprada) {
        this.m = m;
        this.cantidadComprada = cantidadComprada;
        this.Subtotal = m.getPrecio()*this.cantidadComprada;
    }

    public Medicamento getM() {
        return m;
    }

    public void setM(Medicamento m) {
        this.m = m;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

}
