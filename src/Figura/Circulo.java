package Figura;
public class Circulo extends Figura {

    private double radio;
    public Circulo (double r){
        this.radio = r;

    }
    public double area (){
        double area;
        area = this.radio*this.radio*Math.PI;
        return area;
    }
}


