package Codigo;

public class OperacionOrdenamiento {
    private Medicamento m[];
    private int opc;//En base a que atributo se realizara el ordenamiento
    
    public OperacionOrdenamiento(Medicamento m[],int opc){
        this.m = m;
        this.opc = opc;
    }

    public Medicamento[] getM() {
        return m;
    }

    public void setM(Medicamento[] m) {
        this.m = m;
    }
           
    public void implementarQuicksort(){
        if (opc == 1){
            //Ordenamiento stock
            MetodoOrdenQuicksortStock (0,(m.length-1));
        } 
        else if (opc == 2) {
            //Ordenamiento nombre
            MetodoOrdenQuicksortNombre (0,(m.length-1)); 
        }
        else if (opc == 3) {
            MetodoOrdenQuicksortCodigo (0, (m.length-1));
        }

    }
    
    public void implementarQuicksortNombre(){
        
    }
    
    public void MetodoOrdenQuicksortStock(int inicio,int fin){
        Medicamento pivote = m[inicio],aux;
        int i = inicio,j = fin;
        while(i<j){
            while(m[i].getStock()<=pivote.getStock()&&i<j){
                i++;
            }
            while(m[j].getStock() > pivote.getStock()){
                j--;
            }
            if(i<j){
                aux = m[i];
                m[i] = m[j];
                m[j] = aux;
            }
        }
        m[inicio] = m[j];
        m[j] = pivote;
        if(inicio<j-1){
            MetodoOrdenQuicksortStock(inicio,j-1);
        }
        if(j+1<fin){
            MetodoOrdenQuicksortStock(j+1,fin);
        }
        setM(m);
    }
    
    public void MetodoOrdenQuicksortNombre(int inicio,int fin){
        Medicamento pivote = m[inicio],aux;
        int i = inicio, j = fin;
        while(i<j){
            while((m[i].getNombre().compareTo(pivote.getNombre())<0||m[i].getNombre().equals(pivote.getNombre()))&&i<j){
                i++;
            }
            while(pivote.getNombre().compareTo(m[j].getNombre())<0){
                j--;
            }
            if(i<j){
                aux = m[i];
                m[i] = m[j];
                m[j] = aux;
            }
        }
        m[inicio] = m[j];
        m[j] = pivote;
        if(inicio<j-1){
            MetodoOrdenQuicksortNombre(inicio,j-1);
        }
        if(j+1<fin){
            MetodoOrdenQuicksortNombre(j+1,fin);
        }
        setM(m);
    }
    
    public void MetodoOrdenQuicksortCodigo(int inicio,int fin){
        Medicamento pivote = m[inicio],aux;
        int i = inicio, j = fin;
        while(i<j){
            while((m[i].getCodigo().compareTo(pivote.getCodigo())<0||m[i].getCodigo().equals(pivote.getCodigo()))&&i<j){
                i++;
            }
            while(pivote.getCodigo().compareTo(m[j].getCodigo())<0){
                j--;
            }
            if(i<j){
                aux = m[i];
                m[i] = m[j];
                m[j] = aux;
            }
        }
        m[inicio] = m[j];
        m[j] = pivote;
        if(inicio<j-1){
            MetodoOrdenQuicksortCodigo(inicio,j-1);
        }
        if(j+1<fin){
            MetodoOrdenQuicksortCodigo(j+1,fin);
        }
        setM(m);
    }
    /*
    public void MetodoOrdenQuicksortPrecio(int inicio,int fin){
        Medicamento pivote = m[inicio],aux;
        int i = inicio,j = fin;
        while(i<j){
            while(Double.compare(m[i].getPrecio(), pivote.getPrecio()) && i<j){ // <=
                i++;
            }
            while(m[j].getStock() > pivote.getStock()){
                j--;
            }
            if(i<j){
                aux = m[i];
                m[i] = m[j];
                m[j] = aux;
            }
        }
        m[inicio] = m[j];
        m[j] = pivote;
        if(inicio<j-1){
            MetodoOrdenQuicksortStock(inicio,j-1);
        }
        if(j+1<fin){
            MetodoOrdenQuicksortStock(j+1,fin);
        }
        setM(m);
    }
    
    public void compare (double d1, double d2) {
        
    }*/
    
    public void OrdenamientoBurbuja(){
        Medicamento aux;
        int i,j;
        for(i=0;i<m.length;i++){
            for(j=0;j<m.length-1;j++){
                if(m[j].getStock()>m[j+1].getStock()){
                   aux = m[j];
                   m[j] = m[j+1];
                   m[j+1] = aux; //9-10-12
                }
            }
        }
        setM(m);
    }
    
}
