package Codigo;

import java.io.Serializable;

public class Nodo<TD> implements Serializable{
    private TD elemento;
    private Nodo<TD> sgte;
    
    public Nodo(){
        sgte = null; //Constructor de un nodo el cual inicializamos cuando apunta a NULL 
    }
    
    public Nodo(TD velemento){
        elemento = velemento;
        sgte = null; //Constructor de un nodo el cual tiene un elemento y apunta a null
    }
    
    public Nodo(Nodo<TD> vsgte, TD velemento){
        elemento = velemento;
        sgte = vsgte; //Creacion de una lista a partir de un nodo 
    }
    
    public TD getElemento() {
        return elemento;
    }
    
    public void setElemento(TD elemento) {
        this.elemento = elemento;
    }
    
    public Nodo<TD> getSgte() {
        return sgte;
    }
    
    public void setSgte(Nodo<TD> sgte) {
        this.sgte = sgte;
    }

}
