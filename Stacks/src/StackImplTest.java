import static org.junit.Assert.*;

/**
 * Created by pauli on 26/09/2016.
 */
public class StackImplTest {
    Stack<Integer> si;

    @org.junit.Before
    public void setUp() throws Exception {
        si = new StackImpl<Integer>(10);
        si.push(1);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        si =null;
    }





    @org.junit.Test
    public void push() throws Exception {
        si.push(3);
        assertEquals(2, si.size());
    }
    @org.junit.Test
    public void Pilaplena() throws Exception {
        si.push(4);
        si.push(5);
        si.push(6);
        si.push(7);
        assertEquals(10, si.size());

    }
    @org.junit.Test
    public void pop() throws Exception {
        si.push(3);
        assertEquals(2, si.size());

    }




    @org.junit.Test
    public void size() throws Exception {


    }


}