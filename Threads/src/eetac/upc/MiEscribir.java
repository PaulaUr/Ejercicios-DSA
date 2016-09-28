package eetac.upc;

/**
 * Created by pauli on 27/09/2016.
 */
public class MiEscribir extends Thread {

    //private Thread thread;
    int counter = 1;

    public MiEscribir(String s, int[] ints) {
        super(s);

    }

    @Override
    public void run() {

        for (int i = 1; i < 11; i++) {
            System.out.println("Soy el " +getName() + " y mi contador es " + counter);
            ++counter;
        }
        super.run();
        long sleep = (long) (Math.random() * 1000);
        try {
            Thread.sleep(sleep);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}