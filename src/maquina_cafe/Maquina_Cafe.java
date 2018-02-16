package maquina_cafe;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author slemagonzalez
 */

public class Maquina_Cafe {

    static ArrayList<Producto> productos = new ArrayList<>();
    
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        
        Funciones.start();
        
        do {
            userPanel();
        } while (1 == 1);
        
    }

    /**
     * Funcion para cargar la seleccion del Usuario
     */
    
    public static void userPanel(){
        
        int opcion;
        
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1) Introducir credito\n"
                + "2) Añadir Azucar\n"
                + "3) Quitar Azucar\n"
                + "4) Ver Productos"));
        } catch (NumberFormatException exception){
            opcion = 0;
        }
        
        switch(opcion){
            case 0: System.exit(opcion); ; break;
            case 1: Monedero.introducirImporte(Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero")));break;
            case 2: Producto.añadirAzucar(); break;
            case 3: Producto.quitarAzucar(); break;
            case 4: Funciones.verProductos(); break;
            default: System.exit(opcion); break;
        }
    }
   
}
