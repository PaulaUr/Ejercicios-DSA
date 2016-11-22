import java.util.ArrayList;
import java.util.List;

/**
 * Created by pauli on 18/11/2016.
 */
public interface JuegoEetac {

    void añadirUsuario(String nombre, String contraseña);
    void modificarUsuario(String nombre, String contraseña);
    List<Usuarios> listaUsuarios();

     void  crearEtakamons(String nombre,String nomEtakamon);
    List<String> listaEtakamons(String nombre, String nomEtakamon);

}
