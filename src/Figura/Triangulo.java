package Figura;

public class Triangulo extends Figura {

    private double t1;
    private double t2;
    public Triangulo (double t, double h){
        this.t1 = t;
        this.t2 = h;

    }
    public double area (){
        double area;
        area = this.t1*this.t2*1/2;
        return area;
    }
}


