
package clase_s6;

/**
 *
 * @author Chemo
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;
    
    public Nodo(int d){
        this.dato=d;
        this.siguiente=null;
    }
    
    public Nodo(int d, Nodo n){
        dato=d;
        siguiente=n;
    }
}
