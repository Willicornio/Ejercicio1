package Figura;
public abstract class Figura implements Comparable <Figura> {

    private double area;

    public abstract double area();

    public int compareTo(Figura f) {
        double com;

        com = this.area() - f.area();
        return (int) com;
    }
}

