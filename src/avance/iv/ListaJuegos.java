package avance.iv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class ListaJuegos 
        
{
    public Integer id;
    public static Integer autoIncrement=3;
    String[] cantidad;
    String[] juego;
    String[] precio;
    String [] plataforma;
    public void ListaJuegos()
    {
        this.id= autoIncrement;
        autoIncrement ++;
        int Juegos=1;
        juego= new String[Juegos];
        cantidad= new String[Juegos];
        precio= new String[Juegos];
        plataforma=new String[Juegos];
        for(int FILAS=0; FILAS<juego.length;FILAS++)
        {
            juego[FILAS]=JOptionPane.showInputDialog("Ingrese el nombre del juego que quiera agregar");
            cantidad[FILAS]=JOptionPane.showInputDialog("Ingrese la cantidad de copias disponibles");
            precio[FILAS]=JOptionPane.showInputDialog("Ingrese el precio por unidad del juego");
            plataforma[FILAS]=JOptionPane.showInputDialog("Ingrese la o las plataformas compatibles con este juego");
        }
               
        for(int FILAS=0; FILAS<juego.length;FILAS++)
        {
            JOptionPane.showMessageDialog(null,juego[FILAS]+" *ID "+id +"*"+" Unidades Disp: "+cantidad[FILAS]+", Precio Unidad: "+precio[FILAS]+", Plataformas: " +plataforma[FILAS]);
                    
                
        }
        System.out.println();         
                     
                
    }
   
    public void Escribir(String nombre)
    {
        String datos;
        File archivo;
        FileWriter Escritura;
        PrintWriter Linea;
        archivo= new File("Administrar juegos.txt");
        if(!archivo.exists())
        {
            try {
                
                archivo.createNewFile();
                datos=("\n"+Arrays.toString(juego)+" *ID "+id+"*"+", Unidades Disp "+Arrays.toString(cantidad)+", Precio Unidad "+Arrays.toString(precio)+ ", Plataformas "+Arrays.toString(plataforma));
                Escritura= new FileWriter(archivo,true);
                Linea= new PrintWriter(Escritura);
                Linea.print(datos);
                Linea.close();
                Escritura.close();
                
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+ex);
            }
        }
        else
        {
          try {
                datos=("\n"+Arrays.toString(juego)+" *ID "+id+"*"+", Unidades Disp: "+Arrays.toString(cantidad)+", Precio Unidad: "+Arrays.toString(precio)+ ", Plataformas: "+Arrays.toString(plataforma));
                Escritura= new FileWriter(archivo,true);
                Linea= new PrintWriter(Escritura);
                Linea.print(datos);
                Linea.close();
                Escritura.close();
                
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+ex);
            }  
        }
    }
    
}
