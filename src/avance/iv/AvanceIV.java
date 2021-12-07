/*
ProyectoIntroduccionAlaProgramacion
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
        Inicio_Sesion FIDE= new Inicio_Sesion();  //llamamosAlaClaseEncargadaDelInicioDeSession
        String seleccion= JOptionPane.showInputDialog("1.- Menu Pricipal 2.- Atencion al cliente 3.- Acerca de Nosotros 4.- Administracion 5.- Salir");//seSlolicitaAlUsuariolLaOpcionQueQuiereEjecutar
        int numero;
        numero=Integer.parseInt(seleccion);
        switch (numero)
        { //seCreaUnSistemaDeMenuElCualSeEncargaraDeLlamarAlaClaseQueCorrespondaAlaAccionDeseada
            case 1:
                Menu_Games FIDE4=new Menu_Games();
                break;
            case 2:
                Atencion_Cliente FIDE5= new Atencion_Cliente();
                break;
            case 3:
                Nosotros FIDE6= new Nosotros();
                break;
            case 4:
                Administracion FIDE7= new Administracion();
                break;
                default://seCierraElMenu
        }
        }
    
    
}
