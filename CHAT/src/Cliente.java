import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by pauli on 03/10/2016.
 */
public class Cliente extends Thread {

    public static final String HOST = "localhost";
    public static final int PUERTO = 1234;

    public Socket csCliente = new Socket( HOST , PUERTO);
    public DataInputStream entrada;
    public DataOutputStream salida;

    String mensaje;

    public Cliente() throws IOException {
    }


    public void enviar(String texto) throws Exception {
        salida.writeUTF(texto);
    }

    @Override
    public void run() {
        try {
            //flujos de datos de entrada
            entrada = new DataInputStream(csCliente.getInputStream());

            //Flujos de datos hacia el servidor
            salida = new DataOutputStream(csCliente.getOutputStream());

            while (true) {
                mensaje = entrada.readUTF();
                System.out.println(mensaje);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
