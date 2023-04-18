package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.OperacionesAritmeticas.Operacion;

class OperacionesAritmeticasTest {

    @Test
    void testResolverOperacionesAritmeticas_suma() {
        double[] valores = {5, 3};
        double resultadoEsperado = 8;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.SUMA, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverOperacionesAritmeticas_resta() {
        double[] valores = {5, 3};
        double resultadoEsperado = 2;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.RESTA, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverOperacionesAritmeticas_multiplicacion() {
        double[] valores = {5, 3};
        double resultadoEsperado = 15;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.MULTIPLICACION, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverOperacionesAritmeticas_division() {
        double[] valores = {6, 3};
        double resultadoEsperado = 2;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.DIVISION, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverOperacionesAritmeticas_divisionPorCero() {
        double[] valores = {6, 0};

        assertThrows(ArithmeticException.class, () -> OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.DIVISION, valores));
    }

    @Test
    void testResolverOperacionesAritmeticas_maximo() {
        double[] valores = {5, 3};
        double resultadoEsperado = 5;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.MAXIMO, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverOperacionesAritmeticas_minimo() {
        double[] valores = {5, 3};
        double resultadoEsperado = 3;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.MINIMO, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverOperacionesAritmeticas_potencia() {
        double[] valores = {2, 3};
        double resultadoEsperado = 8;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.POTENCIA, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

        @Test
    void testResolverOperacionesAritmeticas_porcentaje() {
        double[] valores = {200, 15};
        double resultadoEsperado = 30;
        double resultadoObtenido = OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.PORCENTAJE, valores);

        assertEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }
}

