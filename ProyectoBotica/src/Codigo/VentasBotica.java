package Codigo;

public class VentasBotica {
    private Lista<Venta> listV = new Lista<>();
    
    public VentasBotica(){
        listV = new Lista<Venta>();
    }
    
    public void AgregarVenta(Venta v){
        listV.InsertarDatoFinal(v);
    }
    
    //Para ordenar las ventas segun mes
    public Venta[] obtenerArrayListaVenta(){
        Venta[] respuesta;
        
        respuesta = listV.TrasaladarListaVectorVenta();
        return respuesta;
    }
    
    public int cantElementos(){
        return listV.CantidadElementos();
    }
    
}
