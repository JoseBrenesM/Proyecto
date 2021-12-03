
package avance.iv;

import javax.swing.JOptionPane;

public class Atencion_Cliente
{
    //Atributos
    private String Mensaje;
    public int OpcionAC;
    public String Correo;
    public String Nombre;
    public String Motivo;
    
    //Metodo
    public Atencion_Cliente()
    {
        JOptionPane.showMessageDialog(null,"Servicio de Atencion al Cliente. ");
        JOptionPane.showMessageDialog(null,">>>>>>>>>>> ");
        
        OpcionAC=Integer.parseInt(JOptionPane.showInputDialog("1.- Formulario de Reclamos y Consultas 2.- Salir "));
        
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
                
                
            case 2: 
                
                break;
                
        }
        
       
                
        
        
    }
}
