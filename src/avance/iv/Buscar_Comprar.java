package avance.iv;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

public class Buscar_Comprar extends ListaJuegos //seCreaUnaClaseQueSeExtiendeDeOtraParaQuePuedaLeerLosDatosDeLaOtraClase
{

    private int x;
    private Object[] Arrelgo; //seCreaUnArregloPrivadoParaQueNoSePuedaCo=ambiarLosDatos
    public void buscar()
    {
        int ID=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID del juego que quiere comprar"));
        switch (ID) //seCreaUnMenuParaQueBusqueElJuegoQueDesea
        {
            case 1 :
            JOptionPane.showMessageDialog(null, "[GTA V]*ID 1*, Unidades Disp [100], Precio Unidad [10000], Plataformas [PC, PS4, PS5]" );
            compra();
            break;
            case 2:
            JOptionPane.showMessageDialog(null,"[Mario Kart] *ID 2*, Unidades Disp: [15], Precio Unidad: [23000], Plataformas: [PS4,PS5,PC,XBOX]");
            compra();
            break;
            case 3:
            JOptionPane.showMessageDialog(null,"[Spiderman] *ID 3*, Unidades Disp: [50], Precio Unidad: [28000], Plataformas: [PS4,PS5]");
            compra();
            
        }
        
    }
    public void compra() //creacionDeUnMetodoParaSolicitarLosDatosDelUsuarioParaRealizarLaCompraDelJuego
    {
        boolean menu=false;//seVuelveACrearUnMenuParaQueElUsuarioElijaLaAccionQueDeseaRealizar
        while(!menu)
        {
            int confirmacion=Integer.parseInt(JOptionPane.showInputDialog("Digite '1' si quiere comprar este juego o '2' si quiere volver"));
            switch (confirmacion)
            {
                case 1: //seSolicitanLosDatos
                    String plat=JOptionPane.showInputDialog("Escriba la plataforma en la que va a querer su juego");
                    JOptionPane.showMessageDialog(null,"Por favor llene los siguientes datos personales para realizar su compra");
                    datos[] Arreglo=new datos [1];//seCreaUnArregloParaGuardarLosDatos
                    for(int o=0; o <Arreglo.length; o++){
                    String nombre=JOptionPane.showInputDialog("Escriba el nombre");
                    String apellidos=JOptionPane.showInputDialog("Escriba los apellidos");
                    String mail=JOptionPane.showInputDialog("Escriba su correo electronico");
                    String telefono=JOptionPane.showInputDialog("Escriba su numero telefonico");
                    Arreglo[o]= new datos(mail,telefono,nombre,apellidos);}
                    JOptionPane.showMessageDialog(null,"Sus datos personales se han guardado correctamente");
                    JOptionPane.showMessageDialog(null, "Procederemos a solicitarle los datos para realizar el pago");
                    String tarjeta="Ingrese los numeros de su tarjeta";
                    String input = showInputDialog( tarjeta, "XXXXXXXXXXXXXXXX" ); 
                    String fecha="Ingrese la fecha de caducidad";
                    String input3 = showInputDialog( fecha, "mes/año" ); 
                    String SC="Ingrese el codigo de seguridad";
                    String input2 = showInputDialog( SC, "ultimos 3 numeros de la parte trasera" ); 
                    for (datos Arreglo1 : Arreglo) {
                    JOptionPane.showMessageDialog(null,"Fecha de la compra: "+fechaA()+"\n Cliente "+Arreglo[x].mail+"\n Telefono "+Arreglo[x].apellidos+"\n Mail "+Arreglo[x].nombre+"\n Juego seleccionado: GTA V"+"\n Monto a pagar: 10000"+"\n Plataforma "+plat);
                    JOptionPane.showConfirmDialog(null,"El pago se va a terminar de procesar, desea realizar la compra?");
                }
                    JOptionPane.showMessageDialog(null,"Gracias por comprar en Juegos506, la factura sera enviada a su correo electronico");
                    String datos;
                    File archivo;
                    FileWriter Escritura;
                    PrintWriter Linea;
                    archivo= new File("Factura.txt"); //seCreaUnArchivoPlanoQueLeDeUnaFacturaDeLaCompraDelUsuario
                    try {
                        archivo.createNewFile();
                        datos=("Juegos 506 Factura electronica"+"\n---------------------"+"\nFecha de la compra: "+fechaA()+"\nCliente "+Arreglo[x].mail+"\nTelefono "+Arreglo[x].apellidos+"\nMail "+Arreglo[x].nombre+"\nJuego seleccionado: GTA V"+"\nMonto a pagar: 10000"+"\nPlataforma "+plat+"\n---------------------"+"\nCualquier consulta o reclamo escribanos a"+"\nWhatsApp: 64856905"+"\nMail:506Juegos@gmail.com"+"\nO dejenos un reclamo en el apartado de Dudas y Consultas");
                        Escritura= new FileWriter(archivo,true);
                        Linea= new PrintWriter(Escritura);
                        Linea.print(datos);
                        Linea.close();
                        Escritura.close();
                         } catch (IOException ex) {
                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+ex);}
                    menu=true;
                    break;
                case 2:
                    menu=true;
                    break;
                    default:
            }
        }
        
    }
    public String fechaA() //creaciondeUnMetodoParaQueDeLaFechaExactaDelDiaQueSeRealizaLaCompra
    {
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);    
    }
    //seIntanciaLOsGetterySetterParaLosAtributosPrivados
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Object[] getArrelgo() {
        return Arrelgo;
    }

    public void setArrelgo(Object[] Arrelgo) {
        this.Arrelgo = Arrelgo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Integer getAutoIncrement() {
        return autoIncrement;
    }

    public static void setAutoIncrement(Integer autoIncrement) {
        ListaJuegos.autoIncrement = autoIncrement;
    }

    public String[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(String[] cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getJuego() {
        return juego;
    }

    public void setJuego(String[] juego) {
        this.juego = juego;
    }

    public String[] getPrecio() {
        return precio;
    }

    public void setPrecio(String[] precio) {
        this.precio = precio;
    }

    public String[] getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String[] plataforma) {
        this.plataforma = plataforma;
    }
    
}

