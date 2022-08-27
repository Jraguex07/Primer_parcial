package sobrecarga;


import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase define la Carretilla de compras del cliente
 * en ella pueden haber muchos productos, los cuales 
 * se van agreando de diferentes formas.
 */
public class Carretilla {// Atributo que define una lista de productos contenidos en la carretilla
	private List<Producto> lista = new ArrayList<Producto>();
	
	/**
	 * Constructor de la clase Carretilla
	 */
	public Carretilla() {
	    super();
            
	}
	
        public Carretilla(List<Producto> lista){
            super();
            this.lista= lista;     
        }
	/**
	 * Método que agrega un producto a la lista de la carretilla
	 * @param p Parámetro de tipo Producto a agregar a la lista
	 */
	public void agregarProducto(Producto p) {
		lista.add(p);
	}
        public void agregarProducto (String nombre , double precio ){
             
                lista.add(new Producto(nombre,precio));
         }
        
        public void agregarProducto (List<Producto> producto){            
            lista.addAll(producto);  
         }
        
        public void agregarProducto(Producto... productos) {
        
         for (Producto f : productos) {
         lista.add(f);
         }
        }

    
    
}
