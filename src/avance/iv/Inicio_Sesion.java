
package avance.iv;

import javax.swing.JOptionPane;

public class Inicio_Sesion 
{
    private String Nombre;
    private String Pass;
    private String tipo;
    private String Inicio;
    private int tipoF;
    
    public Inicio_Sesion()
    {
        tipo= JOptionPane.showInputDialog("Escriba '1' si quiere registrarse, o escriba '2' si quiere salir: ");
        tipoF=Integer.parseInt(tipo);
        switch (tipoF) {
            case 1:
                Nombre=JOptionPane.showInputDialog("Para registrase escriba un nombre de usuario: ");
                Pass=JOptionPane.showInputDialog("Introduzca una contraseña: ");
                Inicio= JOptionPane.showInputDialog("Bienvenido "+ Nombre+" escriba su contraseña para iniciar sesion: ");
                if (Pass.equals(Inicio)){
                    JOptionPane.showMessageDialog(null,"Bienvenido "+ Nombre);
                }
                else 
                {
                    String error="Contraseña incorrecta";
                    String titulo="Error al iniciar sesion";
                    javax.swing.JOptionPane.showMessageDialog( null,
                    "Contraseña incorrecta" );
                }
                break;
          
        }
        
    }
}
