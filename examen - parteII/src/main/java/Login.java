import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Login")
public class Login extends HttpServlet {


    protected void doPost (HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {

        String result = null;
        String nombre = request.getParameter("login");
        String contraseña = request.getParameter("contraseña");
        Usuarios user = new Usuarios();
        try{

          user = Fachada.getInstance().listUsuarios(nombre);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(user == null){
            try{
            Fachada.getInstance().añadirUsuario(nombre, contraseña);
            result= "Usuario añadido";
        }catch (Exception e){
            e.printStackTrace();
        }
        }
        else {
            result=("Bienvenido: "+nombre);
        }
        // response.setContentType("application/html");
        //response.setCharacterEncoding("UTF-8");
        //response.getWriter().write(result);
        // response.getOutputStream().print("Bienvenido: "+nombre);
       request.setAttribute("Result",result);
        request.getRequestDispatcher("Result.jsp").forward(request,response);
    }

    }
