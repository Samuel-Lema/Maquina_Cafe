package maquina_cafe;

/**
 *
 * @author slemagonzalez
 */

public class Monedero {
    
    private static float credito;
    private static float cambio;

    public static float getCredito() {
        return credito;
    }
    
    public static float getCambio() {
        return cambio;
    }

    /**
     * Añade el cambio del producto selecionado y llama a la función devolución
     * @param precio
     */
    
    public static void setCambio(float precio) {
        
        Monedero.cambio = credito - precio;
        devolucion(cambio);
    }
    
    /**
     * Funcion que pide el importe y envia a selProducto(float dinero)
     * @param dinero
     */
    
    public static void introducirImporte(float dinero){
        
        credito = dinero;
        Funciones.selProducto(dinero);
    }
    
    /**
     * Función que devuelve el cambio en caso de haberlo
     * @param cambio
     */
    
    public static void devolucion(float cambio){
        
        Display.window("Su cambio: " + cambio);
    }
    
}
