import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by pauli on 03/10/2016.
 */
public class MainServer {

    public static final String HOST = "localhost";
    public static final int PUERTO = 1234;
    public ServerSocket socketServer;
    //lista de sockets,donde guardaremos los socket que se vayan conectando
    private LinkedList<Socket> usuarios1 = new LinkedList<Socket>();
    public Socket socket;



    public void comenzarServidor(){
        try {
            socketServer = new ServerSocket(PUERTO);

            while(true){
                System.out.println("Esperando conexion...");
                Socket sCliente = socketServer.accept(); //crea un objeto para comenzar socket y estar en LISTEN
                Runnable run = new Servidor(sCliente,usuarios1);
                Thread hilos = new Thread((Runnable) sCliente);
                hilos.start();
                usuarios1.add(sCliente);//guarda el socket del cliente que se conecta

            }
            //DataOutputStream salida = new DataOutputStream(csCliente.getOutputStream());
            //salida.writeUTF("ESCRIBE...");
        }catch (IOException e){
            System.out.println(e.getMessage());

        }

    }
    public static void main(String[] args) throws IOException {

        MainServer serv = new MainServer();
        serv.comenzarServidor();
    }

}
