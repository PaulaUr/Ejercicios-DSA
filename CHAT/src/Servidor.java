import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

/**
 * Created by pauli on 03/10/2016.
 */
public class Servidor extends Thread {

    public static final String HOST = "localhost";
    public static final int PUERTO = 1234;
    public ServerSocket socketServer;
    public Socket socket;
    public Socket sCliente;
    //lista de usuarios conectados
    public LinkedList<Socket> usuarios = new LinkedList<Socket>();


    //constructor q recibe el socket que atendera el hilo y la lsta de usuarios conectados
    public Servidor(Socket soc, LinkedList users) {
        socket = soc;
        usuarios= users;
    }

    @Override
    public void run() {

        try {
            //inicializar canales de comunicacion
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Bienvenidos al chat");
            //ciclo infinito para escuchar x mensajes del cliente
            while (true) {
                String recibir = in.readUTF();

                //si se recibe un mensaje se envia a todos los usuarios conectados
                for(int i =0; i < usuarios.size();i++){
                    out = new DataOutputStream(usuarios.get(i).getOutputStream());
                    out.writeUTF(recibir);
                }

            }

        } catch (IOException e) {

            for(int i = 0; i<usuarios.size();i++){
                if(usuarios.get(i) == socket){
                    usuarios.remove(i);
                    break;
                }
            }
        }
    }


}
