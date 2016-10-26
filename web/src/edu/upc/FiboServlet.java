package edu.upc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pauli on 24/10/2016.
 */
public class FiboServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {



        String p1 = request.getParameter("serie");
       // response.setContentType("tex/html");
        response.getOutputStream().print("<b> Fibonacci Series generada hasta: " + "" +p1 +"</b><BR>");

        int n = Integer.parseInt(p1);
       // int  p2 = Integer.parseInt(num2);

        int num1=0;
        int num2=1;
        int num;


        for (int i=0;i < n; ++i){

            num= num1; //num=0
            num1=num2; //num1=1

            num2 = num + num1;
            System.out.println(num2);
           response.getOutputStream().print("<html><head><title>Fibonacci Series</title>" +
                    "<style>\n" +
                    "        table, th, td{\n" +
                    "            border: 1px solid black;\n" +
                    //"            border-collapse: collapse;\n" +
                    "        }\n" +
                    "        th, td {\n" +
                    "            padding: 5px;\n" +
                    "        }\n" +
                    "    </style></head>" +
                    " <body><table style=\"width:100%\">\n" +
                    "    <tr>\n" +
                    "        <th>"+i+"</th>\n" +
                    "        <td>"+num2+"</td>\n" +
                    "    </tr>\n" +
                    "</table>\n</body></html>");

          //  response.getOutputStream().print("<br>" +i+ ":" +num2);
          //  response.getOutputStream().print(i+":"+num2);
        }


    }
    }
