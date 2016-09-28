package ejercicios;

/**
 * Created by pauli on 14/09/2016.
 */
public class Rectangulo extends FigurasG {

    public double lado1;
    public double lado2;

    //constructor
    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    //metodos
    public double area(){

        return lado1*lado2;
    }
}
