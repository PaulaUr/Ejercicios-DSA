package ejercicios;

import java.util.ArrayList;

/**
 * Created by pauli on 13/09/2016.
 */
public class FigurasG implements Figura {


    public static void main (String [] args){

       Figura[] ll = new Figura[4];
        ll [0] = new Rectangulo(10, 7);
        ll [1] = new Cuadrado(10);
        ll [2] = new Circulo(7,3.15);
        ll [3] = new Triangulo(12,15);


        double suma=0;

        for (Figura f:ll){
            suma = suma + f.area();

            System.out.println(" Area de la figura: " +f +" tiene un area de " +f.area());
        }
        System.out.println("La suma de todo es : "+suma);

/*
        Rectangulo rectangulo = new Rectangulo(10,7);
        Cuadrado cuadrado = new Cuadrado(10);
        Circulo circulo = new Circulo(7,3.15);
        Triangulo triangulo = new Triangulo(13,15);


        System.out.println("Area del rectangulo de base 10 y altura 7: "+rectangulo.area());
        System.out.println("Area del cuadrado de lado 10: "+cuadrado.area());
        System.out.println("Area del triangulo de base 13 y altura 15: "+triangulo.area());
        System.out.println("Area del circulo de radio 7: "+circulo.area());

*/
    }

    public double area() {
        return 0;
    }
}
