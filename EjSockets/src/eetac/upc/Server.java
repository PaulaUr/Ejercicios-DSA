package eetac.upc;
import java.io.*;
import java.net.*;
/**
 * Created by pauli on 28/09/2016.
 */
public class Server {

    public static final String HOST="localhost";
    public static  final int PUERTO=1234;

    public ServerSocket socketServer;
    public Socket so;
   // public DataOutputStream salida;
        String mensaje;

    public Server(){
    }

    public void comenzarServidor() throws IOException {

        try {

            socketServer = new ServerSocket(PUERTO);
            System.out.println("Esperando conexion...");

            Socket csCliente = socketServer.accept(); //crea un objeto para comenzar socket y estar en LISTEN

            DataOutputStream salida = new DataOutputStream(csCliente.getOutputStream());
            salida.writeUTF("ESCRIBE...");

            //HASTA AQUI MUYYY BIENNNNN

            BufferedReader entrada = new BufferedReader(new InputStreamReader(csCliente.getInputStream()));

            mensaje = entrada.readLine();

                System.out.println(mensaje);

                salida.writeUTF(mensaje.toUpperCase());

                salida.flush();
            System.out.println("FIN ...");
            socketServer.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


}
