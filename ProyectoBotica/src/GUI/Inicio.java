package GUI;

import Codigo.Botica;

public class Inicio {

    public static void main(String[] args) throws InterruptedException {
        VentanaCargando VentanaCarga = new VentanaCargando();
                
        for (int i = 0; i <= 100; i++) {
            Thread.sleep(300);
            VentanaCarga.setVisible(true);
            VentanaCarga.Cargando.setText("Cargando "+i+" %");
            VentanaCarga.BarraCargando.setValue(i);
            
            if (i == 100) {
                VentanaInicio VentanaI = new VentanaInicio(); 
                VentanaI.setVisible(true);
                VentanaCarga.setVisible(false);
            }
        }
                
        // Cargar datos
        Botica b = new Botica();
        b.establecerDatosSistema();
    }
    
}
