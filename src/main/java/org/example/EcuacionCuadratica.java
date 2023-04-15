package org.example;

public class EcuacionCuadratica {

    public static double[] resolverEcuacionCuadratica(double[] coeficientes) {
        if (coeficientes.length != 3) {
            throw new IllegalArgumentException("Se esperan exactamente 3 coeficientes");
        }

        double a = coeficientes[0];
        double b = coeficientes[1];
        double c = coeficientes[2];

        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente 'a' no puede ser 0 en una ecuación cuadrática");
        }

        double discriminante = b * b - 4 * a * c;
        double[] soluciones = new double[2];

        if (discriminante >= 0) {
            soluciones[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            soluciones[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
        } else {
            throw new IllegalArgumentException("La ecuación no tiene soluciones reales");
        }

        return soluciones;
    }
}


