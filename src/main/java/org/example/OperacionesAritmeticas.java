package org.example;

public class OperacionesAritmeticas {

    public enum Operacion {
        SUMA, RESTA, MULTIPLICACION, DIVISION, MAXIMO, MINIMO, POTENCIA, PORCENTAJE
    }

    public static double calcular(Operacion operacion, double[] valores) {
        double resultado = 0;

        switch (operacion) {
            case SUMA:
                resultado = valores[0] + valores[1];
                break;
            case RESTA:
                resultado = valores[0] - valores[1];
                break;
            case MULTIPLICACION:
                resultado = valores[0] * valores[1];
                break;
            case DIVISION:
                if (valores[1] == 0) {
                    throw new ArithmeticException("La división entre cero no está permitida.");
                }
                resultado = valores[0] / valores[1];
                break;
            case MAXIMO:
                resultado = Math.max(valores[0], valores[1]);
                break;
            case MINIMO:
                resultado = Math.min(valores[0], valores[1]);
                break;
            case POTENCIA:
                resultado = Math.pow(valores[0], valores[1]);
                break;
            case PORCENTAJE:
                resultado = valores[0] * (valores[1] / 100);
                break;
        }
        return resultado;
    }
}

