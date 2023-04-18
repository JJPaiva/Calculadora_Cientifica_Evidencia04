package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.FigurasGeometricas.Figura;

class FigurasGeometricasTest {

    @Test
    void testResolverFigurasGeometricas_cuadrado() {
        double[] resultadosEsperados = {16, 16};
        double[] resultadosObtenidos = FigurasGeometricas.resolverFigurasGeometricas(Figura.CUADRADO, 4);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverFigurasGeometricas_rectangulo() {
        double[] resultadosEsperados = {18, 20};
        double[] resultadosObtenidos = FigurasGeometricas.resolverFigurasGeometricas(Figura.RECTANGULO, 4, 5);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverFigurasGeometricas_circulo() {
        double[] resultadosEsperados = {12.566370614359172, 12.566370614359172};
        double[] resultadosObtenidos = FigurasGeometricas.resolverFigurasGeometricas(Figura.CIRCULO, 2);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverFigurasGeometricas_esfera() {
        double[] resultadosEsperados = {50.26548245743669, 33.510321638291124};
        double[] resultadosObtenidos = FigurasGeometricas.resolverFigurasGeometricas(Figura.ESFERA, 2);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverFigurasGeometricas_cubo() {
        double[] resultadosEsperados = {48, 96, 64};
        double[] resultadosObtenidos = FigurasGeometricas.resolverFigurasGeometricas(Figura.CUBO, 4);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverFigurasGeometricas_cono() {
        double[] resultadosEsperados = {45.97812434112497, 57.97812434112497, 25.132741228718345};
        double[] resultadosObtenidos = FigurasGeometricas.resolverFigurasGeometricas(Figura.CONO, 3, 4);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverFigurasGeometricas_figuraInvalida() {
        assertThrows(IllegalArgumentException.class, () -> FigurasGeometricas.resolverFigurasGeometricas(null));
    }
}
