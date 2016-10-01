package eetac.upc;

import javax.sound.sampled.Line;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        String Line = System.getProperty("line.separator");
        int[] array1;
        int[] array2;
        QueueImpl cola = new QueueImpl();//instaciamos
        cola.Empezar(7);//empezamos el metodo de otra clase

        array1 = cola.Leer();

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        System.out.println("Cola de longitud de " + array1.length + Line);
        for (int i = 0; array1.length > i; i++) {
            pq.add(array1[i]);//rellenamos cola
                if (array1[i] != 0) {

                    System.out.println("Comienza en la posicion " + i + " y cuenta desde  " + array1[i]);

                } else {
                    System.out.println("recorriendo: " + " Posicion" + i + " vacia " + array1[i] + Line);
                }

                int poll1 = pq.poll(); //eliminamos 1 elemento de la cola y guardamos en variable poll1
                //pq.remove(array1[i]);

            System.out.println("Borramos el primer elemento gue será: " + poll1 + Line);


            }

        cola.Volver(12);
        array2 = cola.Leer();

            for (int j=0;array2.length>j;j++) {
                pq.add(array2[j]);
                if(array2[j] !=0) {
                    System.out.println("Vuelve a comenzar desde la posicion " + j + " y cuenta desde" + array2[j]);
                }else{
                    System.out.println("recorriendo: " + " Posicion" + j + " vacia " + array2[j] + Line);

                }
                int poll2 = pq.poll();
                System.out.println("Borramos el primer elemento gue será: " + poll2 + Line);
                //pq.add(array2[j]);
            }

        }

        }






