import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by pauli on 03/10/2016.
 */
public class MainCliente {

    public static final String HOST = "localhost";
    public static final int PUERTO = 1234;

    public Socket csCliente;
    public Scanner scanner = new Scanner(System.in);
    String mensaje1;

    public void comenzarCliente() {

        try {
            Cliente cliente = new Cliente();
            Thread hilos = new Thread(cliente);
            hilos.start();

            while(true) {
                mensaje1 = scanner.nextLine();
                cliente.enviar(mensaje1);
            }
            // csCliente.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        MainCliente cli = new MainCliente();
        cli.comenzarCliente();
    }
}
