package avance.iv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Archivos_Planos
{
    
    public void Leer(String nombreArchivo) //CreacionDeMetodoParaLaLecturaDeLosArchivosPlanos
    {
        File archivo;
        FileReader fr;
        BufferedReader br;
        
        try
        {
            archivo= new File(nombreArchivo);
            fr= new FileReader(archivo);
            br= new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
            {
                JOptionPane.showMessageDialog(null,linea);
            }
            br.close();
            fr.close();
        }
        catch(IOException e){JOptionPane.showMessageDialog(null,"Ha sucedido un error"+ e);}
    }
    public void Escribir(String nombre) //metodoParaLaLecturaDelArchivoPlanoCreado
    {
        String clien="", tele="",game="", venta="",date="";
        File archivo;
        FileWriter Escritura;
        PrintWriter Linea;
        archivo= new File("Administrar ventas.txt");
        if(!archivo.exists())
        {
            try {
                archivo.createNewFile(); //SeCreaUnNuevoArchivoPlanoYSeProcedeASolicitarLosDatosQueLlenaranEsteArchivo
                clien=JOptionPane.showInputDialog("Nombre del cliente");
                tele=JOptionPane.showInputDialog("Telefono del cliente");
                date=JOptionPane.showInputDialog("Fecha de la venta");
                game=JOptionPane.showInputDialog("Nombre del juego vendido");
                venta=JOptionPane.showInputDialog("Cantidad de unidades vendidas");
                archivo.createNewFile();
                Escritura= new FileWriter(archivo,true);
                Linea= new PrintWriter(Escritura);
                Linea.println(clien);
                Linea.println(tele);
                Linea.println(date);
                Linea.println(game);
                Linea.println("Unidades vendidas: "+venta);
                Linea.close();
                Escritura.close();
                
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+ex); //seDaUnMensajeEnCasoDeQueLaCreacionDelArchivoNoSeEjecuteCorrectamente
            }
        }
        else //seCreaUnElseEnCasoDequeElArchivoPlanoYaExistaSeEscribanLosDatosEnElExistenteYNoSeCreeUnoNuevo
        {
          try {//seVuelvenaPedirLosDatosParaLlenarElArchivo
                clien=JOptionPane.showInputDialog("Nombre del cliente");
                tele=JOptionPane.showInputDialog("Telefono del cliente");
                date=JOptionPane.showInputDialog("Fecha de la venta");
                game=JOptionPane.showInputDialog("Nombre del juego vendido");
                venta=JOptionPane.showInputDialog("Cantidad de unidades vendidas");
                archivo.createNewFile();
                Escritura= new FileWriter(archivo,true);
                Linea= new PrintWriter(Escritura);
                Linea.println(clien);
                Linea.println(tele);
                Linea.println(date);
                Linea.println(game);
                Linea.println("Unidades vendidas: "+venta+"\n");
                Linea.close();
                Escritura.close();
                
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+ex);//seVuelveADarElMensajeEnCasoDeCualquierError
            }  
        }
    }
}
