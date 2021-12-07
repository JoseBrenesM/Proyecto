package avance.iv;

import javax.swing.JOptionPane;

public class Administracion 
{
    //seCreanLosAtributos
    String[] cantidad;
    String[] juego;
    String[] precio;
    String [] plataforma;
    boolean salir=false;
    public Administracion() //creaccionDelMetodo
    {
    String contra= "506_admin"; //contraseñaParaAccederaAdministracion
    String opcion=JOptionPane.showInputDialog("Para acceder a la administracion digite la contraseña");
    if (opcion.equals(contra))
    {   
        while (!salir){ //seCreaUnCicloEnElMenuParaQueEsteNoseSalgaSinoSeSeleccionaLaOpcion4
        int admin=Integer.parseInt(JOptionPane.showInputDialog("1.- Administrar ventas 2.- Agregar nuevo juego al stock 3.- Ver reclamos y sugerencias 4.-Salir"));
        switch (admin)
        {
            case 1:
                boolean salir2=false;
                while (!salir2){ //seVuelveAcrearOtroCicloEnCasoQueSeQuieraVolverEsteVuelvaYNoSeCierreElPrograma
                int ventas=Integer.parseInt(JOptionPane.showInputDialog("1.- Agregar nueva venta 2.- Ver registro de ventas 3.- Volver"));
                switch(ventas)
                {
                    case 1:
                        Archivos_Planos FIDE14= new Archivos_Planos();
                        FIDE14.Escribir("Administrar datos.txt"); //seLlamaUnArchiboPlanoEnElCualSeEscribiranLasNuevasVentas
                        break;
                    case 2:
                        Archivos_Planos FIDE15= new Archivos_Planos();
                        FIDE15.Leer2("Administrar ventas.txt");//seProcedeALeerEsteArchivoPlanol
                        break;
                    case 3:
                        salir2=true;
                        break;
                    default:
                }
                }
                break;
            case 2:
                ListaJuegos FIDE10=new ListaJuegos();//seLlamaALaClaseListaJuegos
                FIDE10.ListaJuegos();
                FIDE10.Escribir("Administrar juegos.txt");//seLlmaUnArchivoPlanoParaFacilitarLaLecturaDeLosJuegos
                break;
            case 3:
                Archivos_Planos FIDE8= new Archivos_Planos();
                FIDE8.Leer("Reclamo o Consulta.txt");
            case 4:
                salir=true; //seCierraElCicloDelMenuAlSeleccionarLaOpcion4
                break;
                default:
                
        }   
    }
    } 
    }
}
