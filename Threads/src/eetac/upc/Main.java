package eetac.upc;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Thread th1 = new MiEscribir("Thread 1", new int[]{});
        Thread th2 = new MiEscribir("Thread 2", new int[]{});
        Thread th3 = new MiEscribir("Thread 3", new int[]{});
        Thread th4 = new MiEscribir("Thread 4", new int[]{});
        Thread th5 = new MiEscribir("Thread 5", new int[]{});
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        th1.join();
        th2.join();
        th3.join();



    }
}
