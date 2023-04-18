package org.example;

public class FigurasGeometricas {

    public enum Figura {
        CUADRADO, RECTANGULO, CIRCULO, ESFERA, CUBO, CONO
    }
    public static double[] resolverFigurasGeometricas(Figura figura, double... parametros) {
        double[] resultados;

        switch (figura) {
            case CUADRADO:
                //Lado
                resultados = new double[] { 4 * parametros[0], parametros[0] * parametros[0] };
                break;
            case RECTANGULO:
                //Longitud,anchura
                resultados = new double[] { 2 * (parametros[0] + parametros[1]), parametros[0] * parametros[1] };
                break;
            case CIRCULO:
                //Radio
                resultados = new double[] { 2 * Math.PI * parametros[0], Math.PI * parametros[0] * parametros[0] };
                break;
            case ESFERA:
                //Radio
                resultados = new double[] { 4 * Math.PI * Math.pow(parametros[0], 2), (4.0 / 3.0) * Math.PI * Math.pow(parametros[0], 3) };
                break;
                //Lado
            case CUBO:
                resultados = new double[] { 12 * parametros[0], 6 * parametros[0] * parametros[0], Math.pow(parametros[0], 3) };
                break;
            case CONO:
                double slantHeight = Math.sqrt(Math.pow(parametros[0], 2) + Math.pow(parametros[1], 2));
                double areaLateral = (Math.PI * parametros[0] * slantHeight) / 2;
                //Radio, altura
                resultados = new double[] { Math.PI * parametros[0] * (parametros[0] + slantHeight), areaLateral + Math.PI * parametros[0] * parametros[0], (1.0 / 3.0) * Math.PI * Math.pow(parametros[0], 2) * parametros[1] };
                break;
            default:
                throw new IllegalArgumentException("Opción de figura no válida");
        }
        return resultados;
    }
}
