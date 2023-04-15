package org.example;

public class SistemaEcuacionesLineales {

    public static double[] resolverSistema2x2(double[][] coeficientes, double[] constantes) {
        double det = coeficientes[0][0] * coeficientes[1][1] - coeficientes[0][1] * coeficientes[1][0];
        if (det == 0) {
            throw new ArithmeticException("El sistema no tiene solución única");
        }

        double x = (constantes[0] * coeficientes[1][1] - constantes[1] * coeficientes[0][1]) / det;
        double y = (coeficientes[0][0] * constantes[1] - coeficientes[1][0] * constantes[0]) / det;

        return new double[] { x, y };
    }
}

