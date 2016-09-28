/**
 * Created by pauli on 19/09/2016.
 */
public interface Stack <E>{

    public void push(E e) throws PilaPlena;
    public E pop() throws  PilaBuida;
    public int size();



}
