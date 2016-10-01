package eetac.upc;

import java.io.IOException;

/**
 * Created by pauli on 28/09/2016.
 */
public class MainServer {


    public static void main(String[] args) throws IOException {


        Server serv = new Server();
        serv.comenzarServidor();

    }

}