import org.apache.log4j.Logger;

import java.util.*;

/**
 * Created by pauli on 18/11/2016.
 */
public class Fachada implements JuegoEetac {

    final static Logger logger = Logger.getLogger(Fachada.class);
    private static Fachada instance=null;
    private HashMap<String, Usuarios> cache;


    private Fachada(){
        cache=new HashMap<String, Usuarios>();
        logger.info("Creación de cache de Uusarios");

    }

    public static Fachada getInstance(){
        if(instance==null) instance=new Fachada();
        return instance;
    }



    public void añadirUsuario(String nombre, String contraseña) {
        Usuarios user = new Usuarios(nombre,contraseña);
        cache.put(nombre,user);
        logger.info("Creando usuarios: "+nombre+ " con contraseña: "+contraseña);
    }

    public void modificarUsuario(String nombre, String contraseña) {
        Usuarios user = new Usuarios();
        try{
            if(cache.containsKey(nombre)) {
                user = cache.get(nombre);
            }}catch (Exception e){
            logger.error("El usuario no ha sido creado");
        }
        user.modificarUsuario(nombre,contraseña);
        logger.info("Actualizacion del Usuario "+nombre+" y contraseña: "+contraseña);
        cache.remove(nombre);
        cache.put(nombre,user);
    }

    public List<Usuarios> listaUsuarios() {
        List<Usuarios> list = new ArrayList<Usuarios>(cache.values());
        List<String> listNombres = new ArrayList<String>();

        for(int i=0; i<list.size();i++){
            listNombres.add(list.get(i).getNombre());
        }
        Collections.sort(listNombres);
        list.clear();
        for(int j=0; j<listNombres.size();j++){
            list.add(cache.get(listNombres.get(j)));
        }
        logger.info(listNombres);
        return list;
    }
    public Usuarios listUsuarios(String nombre){

        //log("juegp :"+juego);
        /*Usuarios j=cache.get(juego);
        if(j==null){
            Class cl=Class.forName(juego);
            j= (Usuarios) cl.newInstance();
            cache.put(juego,j);
            logger.info(" " +getClass().getName());
        }
        //log("result :"+j);*/
        return cache.get(nombre);
    }

    public void crearEtakamons(String nombre, String nomEtakamon) {
        Usuarios user = new Usuarios();
        try{
            if(cache.containsKey(nombre)) {
                user = cache.get(nombre);
            }
        }catch (Exception e){
            logger.error("El usuario no ha creado el etakemon");
        }
        user.crearEtakamons(nomEtakamon);
        logger.info("Creación del Etakemon: "+nomEtakamon+" del usuario "+nombre);
        cache.remove(nombre);
        cache.put(nombre,user);

    }
    public List<String> listaEtakamons(String nombre, String nomCreador) {

        Usuarios user= new Usuarios();
        user = cache.get(nombre);
        return user.etakamons;
    }


}
