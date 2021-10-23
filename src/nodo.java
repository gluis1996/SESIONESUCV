
public class nodo {
 public int datos;
 public nodo siguiente;
 
 public nodo(int d){
 this.datos=d;
 this.siguiente= null;
 
 }

    public nodo(int d, nodo n) {
        datos = d;
        siguiente = n;
    }
 
 
}
