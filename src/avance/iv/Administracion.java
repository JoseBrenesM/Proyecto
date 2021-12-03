package avance.iv;

import javax.swing.JOptionPane;

public class Administracion 
{

    String[] cantidad;
    String[] juego;
    String[] precio;
    String [] plataforma;
    boolean salir=false;
    public Administracion()
    {
    String contra= "506_admin"; //Contraseña para acceder a administracion
    String opcion=JOptionPane.showInputDialog("Para acceder a la administracion digite la contraseña");
    if (opcion.equals(contra))
    {   
        while (!salir){
        int admin=Integer.parseInt(JOptionPane.showInputDialog("1.- Administrar ventas 2.- Agregar nuevo juego al stock 3.- Ver reclamos y sugerencias 4.-Salir"));
        switch (admin)
        {
            case 1:
                boolean salir2=false;
                while (!salir2){
                int ventas=Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar nueva venta 2.- Ver registro de ventas 3.- Volver"));
                switch(ventas)
                {
                    case 1:
                        Archivos_Planos FIDE14= new Archivos_Planos();
                        FIDE14.Escribir("Administrar datos.txt");
                        break;
                    case 2:
                        Archivos_Planos FIDE15= new Archivos_Planos();
                        FIDE15.Leer2("Administrar ventas.txt");
                        break;
                    case 3:
                        salir2=true;
                        break;
                    default:
                }
                }
                break;
            case 2:
                listaJuegos FIDE10=new listaJuegos();
                FIDE10.ListaJuegos();
                FIDE10.Escribir("Administrar juegos.txt");
                break;
            case 4:
                salir=true;
                break;
                default:
                
        }   
    }
    } 
    }
}
