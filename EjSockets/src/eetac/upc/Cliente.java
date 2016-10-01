package eetac.upc;
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * Created by pauli on 28/09/2016.
 */
public class Cliente {


    public static final String HOST="localhost";
    public static  final int PUERTO=1234;

    public Socket csCliente;
    public DataInputStream entrada;
    public DataOutputStream salida;
    public Scanner scanner = new Scanner(System.in);
    String mensaje1;
    String mensaje;

    public Cliente() {


    }
    public void comenzarCliente(){

        try{

            csCliente = new Socket( HOST , PUERTO);

            //flujos de datos de entrada
            entrada = new DataInputStream(csCliente.getInputStream());
            mensaje = entrada.readUTF();
            System.out.println(mensaje);

            //Flujos de datos hacia el servidor
            salida = new DataOutputStream(csCliente.getOutputStream());

            mensaje1 = scanner.nextLine();
            salida.writeUTF("mensaje en Mayusculas: "+mensaje1+" \n");



            mensaje = entrada.readUTF();
            System.out.println(mensaje);

            csCliente.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }





}
