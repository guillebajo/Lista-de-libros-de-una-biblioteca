package PracticaTema9_LIstaDeLIbrosBiblioteca;
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros{
   
    Libro primero;
    Libro siguiente;
    
    public ListaLibros(){
        primero = null;
        siguiente = null;
    }

   

    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
    	Libro nuevo = valor;
        nuevo.siguiente = primero;
        primero = nuevo;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	int cont = 0; 
    	int cont2 =0;
    	Libro aux = primero;
    	Libro aux2 = primero.siguiente;
    	Libro solucion = null;
    	
    	while (aux2 != null) {
        	if (primero.id == id) {
        		cont2++;
        		primero.siguiente = null;
        		break;
        	}
        	if (aux2.id == id) {
        		aux.siguiente = aux2.siguiente;
        		aux2.siguiente = null;
                cont = 1;
                break;
        	}
        	aux = aux.siguiente;
        	aux2 = aux2.siguiente;
    	}
    	
        if (cont != 0) {
    		solucion = aux2;
    	}
    	if (cont2 != 0) {
    		solucion = primero;
    	}
        return solucion;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
        Libro aux = primero;
        int solucion = -1;
        
        while (aux != null) {
        	if(aux.titulo.equals(titulo) ) {
        		solucion = aux.id;
        		break;
        	}
        aux = aux.siguiente;	
        }
        return solucion;
       }
    
   
    // Muestra los libros almacenados
    public void verCatalogo (){
    	Libro aux = primero;

    	while (aux != null) {
    		System.out.println(aux.toString());
    		aux = aux.siguiente;
    	}
    }
         
    

}
