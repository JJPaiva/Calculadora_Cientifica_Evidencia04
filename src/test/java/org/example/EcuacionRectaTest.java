package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionRectaTest {

    @Test
    void testResolverEcuacionRecta_calculoCorrecto() {
        double[] puntoInicial = {1, 2};
        double[] puntoFinal = {3, 6};
        double[] resultadoEsperado = {2, 0};
        double[] resultadoObtenido = EcuacionRecta.resolverEcuacionRecta(puntoInicial, puntoFinal);

        assertArrayEquals(resultadoEsperado, resultadoObtenido, 1e-6);
    }

    @Test
    void testResolverEcuacionRecta_mismaCoordenadaX() {
        double[] puntoInicial = {1, 2};
        double[] puntoFinal = {1, 6};

        assertThrows(ArithmeticException.class, () -> EcuacionRecta.resolverEcuacionRecta(puntoInicial, puntoFinal));
    }
}
