/*
ProyectoIntroduccionAlaProgramacion
Jose Andres Brenes Montero
David Jesus Garcia Tencio
Jose Dario Zuñiga Gamboa 
 */
package avance.iv;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.CANCEL_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;

public class AvanceIV 
{
    public static void main(String[] args) 
    {
        boolean menu=false;
        JOptionPane.showMessageDialog(null,"Bienvenido a Juegos506 ");
        Inicio_Sesion FIDE= new Inicio_Sesion();  //llamamosAlaClaseEncargadaDelInicioDeSession
        while(!menu){
        String seleccion= JOptionPane.showInputDialog("1.- Menu Pricipal \n2.- Atencion al cliente \n3.- Acerca de Nosotros \n4.- Administracion \n5.- Salir");//seSlolicitaAlUsuariolLaOpcionQueQuiereEjecutar
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
                FIDE6.Nosotros();
                break;
            case 4:
                Administracion FIDE7= new Administracion();
                break;
            case 5:
               int salida;
                salida = showConfirmDialog( null, "Estas seguro que quieres Salir?"); 
                switch(salida)
                { //seLePreguntaAlUsuarioSiQuiereSalirConUnSistemaDeSioNo
                    case CANCEL_OPTION:  
                         JOptionPane.showMessageDialog(null,"Volviendo al sistema");
                         break;
                     case NO_OPTION: //enCasoDeMarcarLaOpcionNoOLaOpcionCancelLoDevolveranAlMenuPrincipal
                         JOptionPane.showMessageDialog(null,"Volviendo al sistema");
                         break;
                     case YES_OPTION: 
                         JOptionPane.showMessageDialog(null,"Gracias por su visita, esperamos que vuelva pronto :) \nSaliendo...");
                         menu=true; //seCierraElCicloySeFinalizaElPrograma 
                }
            default:
        }        
        }
        }
}
