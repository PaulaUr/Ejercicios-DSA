package ejercicios;

/**
 * Created by pauli on 15/09/2016.
 */
public class Triangulo extends FigurasG {
    public double b;
    public double h;

    //constructor
    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    //metodos
    public double area() {

        return b*(h/2);
    }
}
