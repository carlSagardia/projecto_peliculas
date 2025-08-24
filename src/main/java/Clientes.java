import java.util.ArrayList;
import java.util.List;

public class Clientes{
    private int idCliente;
    private String Nombre;
    private String Direccion;
    private int Numero;
    private List<Arriendos> arriendos;
    
    public Clientes (int idCliente, String Nombre, String Direccion, int Numero){
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Numero = Numero;
        this.arriendos = new ArrayList<>();
    }
    public int getidCliente(){
        return idCliente;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getDireccion(){
        return Direccion;
    }
    public int getNumero(){
        return Numero;
    }
    public List<Arriendos> getArriendos(){
        return arriendos;
    }
}
