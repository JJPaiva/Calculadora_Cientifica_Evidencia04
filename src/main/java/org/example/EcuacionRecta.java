package org.example;

public class EcuacionRecta {

    public static double[] resolverEcuacionRecta(double[] puntoInicial, double[] puntoFinal) {
        if (puntoInicial[0] == puntoFinal[0]) {
            throw new ArithmeticException("Los puntos tienen la misma coordenada X, no se puede calcular la recta");
        }

        double m = (puntoFinal[1] - puntoInicial[1]) / (puntoFinal[0] - puntoInicial[0]);
        double b = puntoInicial[1] - m * puntoInicial[0];

        return new double[] { m, b };
    }
}

