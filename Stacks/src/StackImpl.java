/**
 * Created by pauli on 19/09/2016.
 */
public class StackImpl<E> implements Stack <E>{

    private E[] elems;
    int i;

    //Aquest constructor es crear un constructor de len objectes
    public StackImpl(int len) {

        this.elems= (E[])new Object[len];
    }

    @Override
    public void push(E e) throws  PilaPlena {

       // System.out.println("size: "+this.size()+" "+" len: " +this.elems.length);
        if (this.size()>=this.elems.length)  throw new PilaPlena();

        this.elems[this.i++]=e;
    }

    @Override
    public E pop() throws PilaBuida{
        if (this.size()==0) throw new PilaBuida();
        return this.elems[--this.i];
    }

    @Override
    public int size() {

        return this.i;
    }

}