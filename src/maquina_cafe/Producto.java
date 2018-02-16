package maquina_cafe;

/**
 *
 * @author slemagonzalez
 */

public class Producto {
    
    private String nombre;
    private float precio;
    private static int azucar = 3;

    // Constructor
    
    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Get's
    
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public static int getAzucar() {
        return azucar;
    }

    /**
     * Funcion que muestra el precio del producto Seleccionado
     */
    
    public void mostrarPrecio(){
        
        String mensaje = "El precio es: " + (precio * Math.pow(10, 2));
        Display.window(mensaje);
    }

    /**
     * Funcion que añade azucar
     */
    
    public static void añadirAzucar() {

        if(azucar < 6){
            azucar++;
        }
        
        System.out.format("\nNivel de Azucar: %d", azucar);
    }

    /**
     * Funcion que quita azucar
     */
    public static void quitarAzucar() {
        
        if(azucar > 0){
            azucar--;
        }
        
        System.out.format("\nNivel de Azucar: %d", azucar);
    }

    /**
     * Funcion que elabora el producto seleccionado y llama a setCambio en caso de necesitarlo
     */
    
    public void elaborando(){
        
        if (Monedero.getCredito() >= this.precio){

            Display.window("El " + nombre + " se esta elaborando.");
            Monedero.setCambio(precio);
        } else {
            
            Display.window("Faltan " + (precio - Monedero.getCredito()) + " para pagar el producto.");
        }
        
    }
}
