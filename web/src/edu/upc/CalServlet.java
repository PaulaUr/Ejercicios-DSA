package edu.upc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pauli on 23/10/2016.
 */
@WebServlet(name = "CalServlet")
public class CalServlet extends HttpServlet {

    protected void doPost (HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{

       /* if (request.getSession().getAttribute("numero1") != null) {
            RequestDispatcher a = request.getRequestDispatcher("calculadora.html");
            a.forward(request, response);
            }*/

                String p1= request.getParameter("num1");
                String p2= request.getParameter("num2");
                String op= request.getParameter("op");

             System.out.println("p1: "+p1);
             System.out.println("p2: "+p2);
             System.out.println("op: "+op);


                int par1=Integer.parseInt(p1);
                int par2= Integer.parseInt(p2);
                int result=-1;
                if(op.equals("+"))
                    result= sumar(par1,par2);
                else if(op.equals("-"))
                    result = restar(par1,par2);
                else if(op.equals("*"))
                    result = multiplicar(par1,par2);
                else if(op.equals("/"))
                    result = dividir(par1,par2);

                response.setContentType("text/html");
                response.getOutputStream().print(p1+" "+op+" "+p2+"= "+result);
        }


        public Integer sumar(int a, int b){
            return a+b;}

        public Integer restar(int a , int b){
            return a-b;}

        public Integer multiplicar(int a , int b){
        return a*b;}

        public Integer dividir(int a , int b){
        return a/b;}
}
