/*
Entregable IV: Estructura de Clases
Jose Andres Brenes Montero
David Jesus Garcia Tencio
Jose Dario Zuñiga Gamboa 
 */
package avance.iv;

import javax.swing.JOptionPane;

public class AvanceIV 
{

    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null,"Bienvenido a Juegos506 ");
        Inicio_Sesion FIDE= new Inicio_Sesion();
        String seleccion= JOptionPane.showInputDialog("1.- Ver Inventario 2.- Ver Carrito 3.- Atencion al cliente 4.- Acerca de Nosotros");
        int numero;
        numero=Integer.parseInt(seleccion);
        switch (numero){
            case 1:
                Menu_Games FIDE4=new Menu_Games();
                break;
            case 2:
                Carrito FIDE2=new Carrito();
                Facturacion FIDE1= new Facturacion();
                break;
            case 3:
                Atencion_Cliente FIDE5= new Atencion_Cliente();
                break;
            case 4:
                Nosotros FIDE6= new Nosotros();
                break;
            default:
        }
    }
    
}
