import Figura.*;

import java.util.Arrays;

public class MainTest {

     public static void main(String[] args) {

        Figura[] f = new Figura[4];
        f[0] = new Circulo(5.0);
        f[1] = new Rectangulo(14.3, 17.5);
        f[2] = new Triangulo(40.2, 5.0);
        f[3] = new Cuadrado(6.0);

        System.out.println("suma=" + GestorFiguras.suma(f));

        Arrays.sort(f); //lo ordena de menro a mayor
        for (Figura i : f) {
            System.out.println(i + " < ");
        }

    }
}
