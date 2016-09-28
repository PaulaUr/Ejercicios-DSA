/**
 * Created by pauli on 19/09/2016.
 */
public class Principal {


    public static void main(String[] args) {

        Stack<Integer> st1 = new StackImpl<Integer>(11);
        try {

            for (int i = 1; i < 24; i++) {
                st1.push(i);
                System.out.println("Creciente: " + i);

            }
        } catch (PilaPlena pilaPlena) {
            pilaPlena.printStackTrace();
            System.out.println("Error: " + pilaPlena.getMessage() +"\n");

        }

        //Stack<Integer> syso = new StackImpl<Integer>(15);
        try {
            for (int i = 11; i < 12; i--) {
                st1.pop();
                System.out.println("Decreciendo: " + i);
            }
        } catch (PilaBuida pilaBuida) {
            pilaBuida.printStackTrace();
            System.out.println("Error: "+pilaBuida.getMessage());
        }
    }
}


