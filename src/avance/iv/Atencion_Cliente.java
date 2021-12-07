
package avance.iv;

import javax.swing.JOptionPane;

public class Atencion_Cliente
{
    //seEstablecenLosAtributos
    private String Mensaje;
    private int OpcionAC;
    private String Correo;
    private String Nombre;
    private String Motivo;
    
    //seCreaUnMetodo
    public Atencion_Cliente()
    {
        JOptionPane.showMessageDialog(null,"Servicio de Atencion al Cliente. ");
        JOptionPane.showMessageDialog(null,">>>>>>>>>>> ");
        
        OpcionAC=Integer.parseInt(JOptionPane.showInputDialog("1.- Formulario de Reclamos y Consultas 2.- Salir "));//seSolicitaAlUsuarioLocpcionQueDeseaYseProcedeASolicitarDatos
        
        switch(OpcionAC)
        {
            case 1:
                JOptionPane.showMessageDialog(null," Formulario de Reclamos y Consultas ");
                Nombre=JOptionPane.showInputDialog("Ingrese su Nombre Completo");
                Correo=JOptionPane.showInputDialog("Ingrese su Correo Electronico");
                Motivo=JOptionPane.showInputDialog("Ingrese el Motivo de su Consulta o Reclamo: ");
                Mensaje=JOptionPane.showInputDialog("Porfavor, Ingrese la Descripcion de su Reclamo o Consulta ");
                JOptionPane.showMessageDialog(null,"Gracias por Completar el Formulario!!!");
                break;
                
                
            case 2: //seCierraelSwitch
                
                break;
                
        }

    }

    //seInstanciaLosGetterYSetterDeLosAtributosPrivados
    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public int getOpcionAC() {
        return OpcionAC;
    }

    public void setOpcionAC(int OpcionAC) {
        this.OpcionAC = OpcionAC;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }
}
