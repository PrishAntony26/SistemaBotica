package Codigo;

import java.io.Serializable;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

public class Lista<TD> implements Serializable{
    private Nodo<TD> cab;
    
    public Lista(){
        cab = null;
    }
    
    public boolean estaVacia(){
        return cab == null;
    }
    
    public void InsertarDatoInicio(TD vdato){
        Nodo<TD> nuevo = new Nodo<>(vdato);
        
        if(!estaVacia()){
            nuevo.setSgte(cab);
        }
        cab = nuevo;
    }
    
    public void InsertarDatoFinal(TD vdato){
        Nodo<TD> nuevo = new Nodo<>(vdato);
        Nodo<TD> aux = cab;
        
        if(estaVacia()){
            InsertarDatoInicio(vdato);
        }else{
            //Recorremos el nodo hasta su ultimo elemento 
            while((aux.getSgte()!=null)){
                aux = aux.getSgte();
            }
            //Cuando llegemos al final tendremos que añadir el nuevo elemento 
            aux.setSgte(nuevo);
        }
    }
    
    public void EliminarDato(TD dato){
        Nodo<TD> aux = cab;
        Nodo<TD> p=null;
        boolean a = true;
        
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!");
        }else{
            if(aux.getSgte() == null){
                aux = null;
            }
            while(!aux.getElemento().equals(dato)&&a){
                if(aux.getSgte()!=null){
                    p = aux;
                    aux = aux.getSgte();
                }else{
                    a = false;
                }
            }
            if(a){
                if(aux==cab){
                    JOptionPane.showMessageDialog(null, "Elemento eliminado:\n"+cab.getElemento().toString());
                    cab = aux.getSgte();
                }else{
                    JOptionPane.showMessageDialog(null, "Elemento eliminado:\n"+aux.getElemento().toString());
                    p.setSgte(aux.getSgte());
                }
            }else{
                JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la lista");
            }
        }
    }
    
    public void modificarElemento(int pos, TD dato){
        Nodo<TD> aux = cab;
        boolean a = true;   //a: bandera para indicar cuando se recorre toda la lista (false)
        int indice = 0;
        
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!");
        }else{
            while((indice<pos) && a){
                if(aux.getSgte()!=null){
                    aux = aux.getSgte();
                }else{
                    a = false;
                }
                indice++;
            }
            aux.setElemento(dato);
        }
    }
    
    public int CantidadElementos(){
        int respuesta=0;
        Nodo<TD> naux = cab;
        
        if(!estaVacia()){
            while(naux!=null){
                respuesta++;
                naux = naux.getSgte();
            }
        }
        return respuesta;
    }
    
    //HACER GENÉRICO SEGUN LA CLASE 
    public TD[] TrasaladarListaVectorMedicamento(){
        Nodo<TD> naux = cab;
        TD [] array;
        array = (TD[]) Array.newInstance(Medicamento.class, CantidadElementos());
        int i = 0;
        
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!");
        }else{
            while(naux!=null){
               array[i] = naux.getElemento();
               i++;
               naux = naux.getSgte();
            }
        }
        return array;
    }
    
    //CLASE EQUIVALENTE A LA ANTERIOR, PERO CON VENTAS
    public TD[] TrasaladarListaVectorVenta(){
        Nodo<TD> naux = cab;
        TD [] array;
        
        array = (TD[]) Array.newInstance(Venta.class, CantidadElementos());
        int i = 0;
        
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!");
        }else{
            while(naux!=null){
               array[i] = naux.getElemento();
               i++;
               naux = naux.getSgte();
            }
        }
        return array;
    }
    
    //Para DetalleVenta
    public TD[] TrasaladarListaVectorDetalleVenta(){
        Nodo<TD> naux = cab;
        TD [] array;
        
        array = (TD[]) Array.newInstance(DetalleVenta.class, CantidadElementos());
        int i = 0;
        
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!");
        }else{
            while(naux!=null){
               array[i] = naux.getElemento();
               i++;
               naux = naux.getSgte();
            }
        }
        return array;
    }
    
    public void RecibirVector(TD[] dato){
        VaciarLista();
        
        for(int i=0;i<dato.length;i++){
            InsertarDatoFinal(dato[i]);
        }
    }
    
    public void VaciarLista(){
        Nodo<TD> aux;
        
        while(cab!=null){
            aux = cab;
            cab = aux.getSgte();
        }
    }   
    
    public String MostrarDato(int pos){
        TD aux;
        Nodo<TD> naux = cab;
        String respuesta ="";
        int indice = 0;
        
        if(estaVacia()){
            respuesta = "La lista se encuentra vacia!";
        }else{
            while(indice<=pos){
               aux = naux.getElemento();
               naux = naux.getSgte();
               indice++;
               respuesta = aux.toString();
            }
        }
        return respuesta;
    }
    
    //Se ingresara la clave del objeto en este caso la placa 
    public TD CambioAtributo(TD dato){
        TD respuesta = null;
        Nodo<TD> aux = cab;
        Nodo<TD> p = null;
        boolean a = true;
        
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!");
        }else{
            while(aux!=null&&a){
                if(aux.getElemento().equals(dato)){
                    a = false;
                    JOptionPane.showMessageDialog(null, "La lista se encuentra vacia!"+aux.getElemento().toString());
                    respuesta = aux.getElemento();
                }
                aux = aux.getSgte();
            }
            if(a){
                JOptionPane.showMessageDialog(null, "El elemento no se encuentra en la lista");
            }
        }
        return respuesta;
    }
    
}
    