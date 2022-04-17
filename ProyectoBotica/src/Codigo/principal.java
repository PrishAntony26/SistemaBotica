package Codigo;

public class principal {

    public static void main(String[] args) {
        
        Botica b = new Botica();
        
        int cantInventario = Botica.inv.cantElementos();
        
        if(cantInventario == 0){
            System.out.println("NO HAY MEDICAMENTOS ALMACENADOS");
        }
        else{
            System.out.println("CODIGO NOMBRE STOCK TIPO");
            
            for(int i=0;i<cantInventario;i++){
                System.out.println("\n" +Botica.inv.mostrarDato(i));
            }
        }
    }
    
}
