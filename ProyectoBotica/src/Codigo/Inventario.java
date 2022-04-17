package Codigo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Inventario {
    
    private Lista<Medicamento> Listmed;
    
    public Inventario(){
        Listmed = new Lista<Medicamento>();
    }
    
    public void agregarMedicamento(String nombre, int stock, double tip){
        Medicamento nuevoM = new Medicamento(nombre,stock,tip);
        Listmed.InsertarDatoInicio(nuevoM);
    }
    
    public void eliminarMedicamento(String codigo){
        Medicamento eliminar = new Medicamento();
        eliminar.setCodigo(codigo);
        Listmed.EliminarDato(eliminar);
    }
    
    public Medicamento[] obtenerArrayDeListaMedicamento(){
        Medicamento[] respuesta;
        respuesta = Listmed.TrasaladarListaVectorMedicamento();
        return respuesta;
    }
    
    //Metodo para ver si almacena
    public int cantElementos(){
        return Listmed.CantidadElementos();
    }
    
    public String mostrarDato(int i){
        return Listmed.MostrarDato(i);
    }
    
    public void modificarMedicamento(int pos, Medicamento dato){
        Listmed.modificarElemento(pos, dato);
    }
    
    public Lista<Medicamento> LeerArchivo(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Medicamentos.txt"));
            Lista<Medicamento> r = (Lista<Medicamento>)entrada.readObject();
            return r;
        }catch(IOException | ClassNotFoundException e){
            return null;
        }  
    }
    
    public void EscribirArchivo(Lista<Medicamento> nuevo){
        try{
           ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Medicamentos.txt"));
           salida.writeObject(nuevo);
           salida.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al escribir archivo","Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
