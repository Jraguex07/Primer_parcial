
package sobrecarga;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
    //imprimos los productos del metoso sobrecargado agregarProducto 
    Producto p = new Producto("Caja de leche", 12);
    Carretilla b = new Carretilla();
    b.agregarProducto(p);
    b.agregarProducto("Caja de leche", 15);
   
    //imprimimos otros productos pero utlizando el metodo sobrecargado que contiene nuestor array ArrayList<Producto>
    List<Producto> productos= new ArrayList<Producto>();
    productos.add(new Producto("Libra de café",50));
    productos.add(new Producto("Pan de banano",70));
    productos.add(new Producto("Galletas de chocolate",10));
    b.agregarProducto(productos);
    b.agregarProducto(new Producto("Galletas de chocolate",15));
    b.agregarProducto(new Producto("galleda de  Vainilla",7));
     }

        }