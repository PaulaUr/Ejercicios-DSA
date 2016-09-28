package ejercicios;

/**
 * Created by pauli on 15/09/2016.
 */
public class Circulo extends FigurasG{
    public double r;
    public double pi=3.15;

    //constructor
    public Circulo(double r, double pi){
        this.r = r;
        this.pi = pi;

    }

    //metodos
    public double area(){

        return pi*(r*r);
    }

}
