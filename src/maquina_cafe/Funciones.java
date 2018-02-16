package maquina_cafe;

import javax.swing.JOptionPane;
import static maquina_cafe.Maquina_Cafe.productos;

/**
 *
 * @author slemagonzalez
 */
public class Funciones {

    /**
     * Inicia la Maquina y carga los productos
     */
    
    public static void start(){
        
        Producto producto1 = new Producto("Cafe", 0.50f);
        Producto producto2 = new Producto("Cafe con leche", 0.60f);
        Producto producto3 = new Producto("Chocolate", 0.80f);
        
        Maquina_Cafe.productos.add(producto1);
        Maquina_Cafe.productos.add(producto2);
        Maquina_Cafe.productos.add(producto3);
    }

    /**
     * Funcion que visualiza los productos
     */
    
    public static void verProductos(){
        
        int i = 0;
        
        System.out.print("\n<-- Selección de Productos -->");
        
        for(Producto valor: productos){
            
            System.out.format("\n%s (%d)", valor.getNombre(), i+1);
            i++;
        }
        
        int pos = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduce el Nº de el producto a visualizar"));
        
        if (pos > productos.size()){
            System.out.format("\nNo existe el producto Nº %d", pos);
        } else {
            System.out.format("\nProducto seleccionado (%s), Precio: %.2f", productos.get(pos-1).getNombre(), productos.get(pos-1).getPrecio());
        }
        
    }
    
    /**
     * Funcion que visualiza los productos
     * @param dinero
     */
    
    public static void selProducto(float dinero){
        
                int i = 0;
        
        System.out.print("\n<-- Selección de Productos -->");
        
        for(Producto valor: productos){
            
            System.out.format("\n%s (%d)", valor.getNombre(), i+1);
            i++;
        }
        
        int pos = Integer.parseInt(JOptionPane.showInputDialog("\nIntroduce el Nº de producto"));
        
        if (pos > productos.size()){
            
            System.out.format("\nNo existe el producto Nº %d", pos);
        } else {
            
            System.out.format("\nProducto seleccionado (%s), Precio: %.2f", productos.get(pos-1).getNombre(), productos.get(pos-1).getPrecio());
            productos.get(pos-1).elaborando();
        }
        
        
    }
}
