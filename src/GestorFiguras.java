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

        System.out.println("No pinto nada aquí, pero si me borran el otro main no funciona");

        }
    }


