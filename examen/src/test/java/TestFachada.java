import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.sun.corba.se.impl.util.RepositoryId.cache;
import static org.junit.Assert.assertNotEquals;


public class TestFachada {


    @Before
    public void setUp() throws Exception {
        Fachada.getInstance().añadirUsuario("Tommy","tommy");
        Fachada.getInstance().crearEtakamons("Tommy","DogEtakamon");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void añadirUsuario() throws Exception {
    Fachada.getInstance().añadirUsuario("Marc","marc");
    }

    @Test
    public void modificarUsuario() throws Exception {

        Fachada.getInstance().modificarUsuario("Tommy","321");
    }


}
