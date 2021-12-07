
package avance.iv;

import javax.swing.JOptionPane;

public class Inicio_Sesion 
{   //creamosLosMetodosEnPrivadoParaQueNingunaClaseTengaAccesoAModificarEstosDatos
    private String Nombre;
    private String Pass;
    private String tipo;
    private String Inicio;
    private int tipoF;
    boolean menu= false;
    
    public Inicio_Sesion() //creaccionDelMetodoParaElInicioDeSession
    {
        while(!menu){ //seCreaUnMenuParaQueElUsuarioPuedaIniciarSession
        tipo= JOptionPane.showInputDialog("Escriba '1' si quiere registrarse, o escriba '2' si quiere salir: ");
        tipoF=Integer.parseInt(tipo);
        switch (tipoF) {
            case 1:
                Nombre=JOptionPane.showInputDialog("Para registrase escriba un nombre de usuario: ");
                Pass=JOptionPane.showInputDialog("Introduzca una contraseña: ");
                Inicio= JOptionPane.showInputDialog("Bienvenido "+ Nombre+" escriba su contraseña para iniciar sesion: ");
                if (Pass.equals(Inicio)){ //seCompruebaQueLacontraseñaEstablecidaSeaLaMismaQueLaIngresada
                    JOptionPane.showMessageDialog(null,"Bienvenido "+ Nombre);
                    menu=true;
                }
                else 
                {   //damosElRespectivoErrorEnCasoDeQueEstasContraseñasNoCoincidan
                    String error="Contraseña incorrecta";
                    String titulo="Error al iniciar sesion";
                    javax.swing.JOptionPane.showMessageDialog( null,
                    "Contraseña incorrecta" );
                }
                break;
            case 2:
                menu=true;
                default:}
                
          
        }
        
    }
    //seCreanLosRespectivosGetterYSetterParaLosAtributos
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public int getTipoF() {
        return tipoF;
    }

    public void setTipoF(int tipoF) {
        this.tipoF = tipoF;
    }
}
