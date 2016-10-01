package eetac.upc;

import java.util.Iterator;

/**
 * Created by pauli on 30/09/2016.
 */
public class QueueImpl {

    int inicio = 0;
    int max = 6;
    int fin =0;
    int Arraynum[] = new int[max];
    int Arrayfinal[] = new int[max];

    public QueueImpl() {

    }

    public void Empezar(int num) {

        inicio = num;
        int[] inArray = new int[max];

        Crear(inicio, inArray);

    }

    public int[] Crear(int ref, int[] Array) {

        if (Array.length != 0) {
            Arraynum = Array;
            for (int i = 0; i < max; i++) {
                // ++ref;
                Arraynum[i] = i + ref + Array[i];

            }
        }
        return Arraynum;
    }

    public int[] Leer() {
        return Arraynum.length != 0 ? Arraynum : null;

    }

    public void Volver(int num1){

        fin  = num1;
        int[] finArray = new int[max];
        Crear(fin, finArray);
    }
}