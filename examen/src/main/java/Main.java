/**
 * Created by pauli on 18/11/2016.
 */
public class Main {



    public static void main(String[] args) {

        Fachada.getInstance().añadirUsuario("Tommy","tommy");
        Fachada.getInstance().añadirUsuario("Marc","marc");
        Fachada.getInstance().añadirUsuario("Vicky","vicky");
        Fachada.getInstance().crearEtakamons("Tommy","DogEtakamon");
        Fachada.getInstance().crearEtakamons("Vicky","CatEtakamon");

        Fachada.getInstance().listaUsuarios();
        Fachada.getInstance().listUsuarios("Tommy");
        Fachada.getInstance().modificarUsuario("Marc","1234");

    }
}
