package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaEcuacionesLinealesTest {

    @Test
    void testResolverSistemaEcuacionesLineales_solucionUnica() {
        double[][] coeficientes = {{2, -1}, {3, 4}};
        double[] constantes = {1, 7};
        double[] resultadosEsperados = {1, 1};
        double[] resultadosObtenidos = SistemaEcuacionesLineales.resolverSistemaEcuacionesLineales(coeficientes, constantes);

        assertArrayEquals(resultadosEsperados, resultadosObtenidos, 1e-6);
    }

    @Test
    void testResolverSistemaEcuacionesLineales_sinSolucionUnica() {
        double[][] coeficientes = {{1, -1}, {2, -2}};
        double[] constantes = {2, 4};

        assertThrows(ArithmeticException.class, () -> SistemaEcuacionesLineales.resolverSistemaEcuacionesLineales(coeficientes, constantes));
    }
}

