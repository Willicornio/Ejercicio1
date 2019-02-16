
import Figura.*;
public class GestorFiguras {

    public static double suma(Figura[] figuras) {

        double res = 0;
        for (Figura f : figuras) {
            res = res + f.area();
        }
        return res;
    }

    public static void main(String[] args) {
        Figura[] f = new Figura[4];
        f[0] = new Circulo(5.0);
        f[1] = new Rectangulo(14.3, 17.5);

        System.out.println("suma=" + suma(f));
    }
}