
package avance.iv;

import javax.swing.JOptionPane;

public class Menu_Games 
{
    boolean salir=false;
    public Menu_Games() //seCreaElMetodoEnElCualElUsuarioVaADecidirQueQuiereHacerEnLaTienda
    {
        while(!salir){//seCreaElFormatoDeLMenu
        JOptionPane.showMessageDialog(null, "Bienvenido a nuestro menu principal, por favor selecciona una opcion");
        int Menu=Integer.parseInt(JOptionPane.showInputDialog("1.- Ver todos los juegos 2.- Comprar un juego 3.- Salir"));
        switch (Menu){
            //procedeARealizarLaLecrturaDeLaClaseEnFuncionALaAccionElejida
            case 1: 
                Archivos_Planos FIDE8= new Archivos_Planos();
                FIDE8.Leer("Administrar juegos.txt");
                break;
            case 2:
                Buscar_Comprar FIDE11= new Buscar_Comprar();
                FIDE11.buscar();
                break;
            case 3:
                salir=true;
                break;
                default://cerramosRlMenu
        }
        
        }
    }    
}