import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauli on 18/11/2016.
 */
public class Usuarios  {


    private  String nombre;
    private String contraseña;
    public List<String> etakamons;


    public Usuarios(){
    }

    public Usuarios(String nombre, String contraseña) {

        this();
        this.nombre=nombre;
        this.contraseña=contraseña;
        this.etakamons=new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void crearEtakamons(String nomCreador){
        etakamons.add(nomCreador);
    }
    public void modificarUsuario(String nombre, String contraseña){
        this.nombre=nombre;
        this.contraseña=contraseña;
    }


}
