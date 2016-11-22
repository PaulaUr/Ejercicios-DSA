import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pauli on 18/11/2016.
 */
public class EServlet {

    @WebServlet(name = "EServlet")
    public class CalServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String result;

            String p1 = request.getParameter("login");
            String p2 = request.getParameter("contraseña");

            response.setContentType("text/html");
            response.getOutputStream().print("Binevenido: "+p1);
        }



    }
}
