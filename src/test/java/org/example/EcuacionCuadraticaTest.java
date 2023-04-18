package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcuacionCuadraticaTest {

    @Test
    void testResolverEcuacionCuadratica_solucionesReales() {
        double[] coeficientes = {1, -3, 2};
        double[] solucionesEsperadas = {2, 1};
        double[] solucionesObtenidas = EcuacionCuadratica.resolverEcuacionCuadratica(coeficientes);

        assertArrayEquals(solucionesEsperadas, solucionesObtenidas, 1e-6);
    }

    @Test
    void testResolverEcuacionCuadratica_noSolucionesReales() {
        double[] coeficientes = {1, 2, 3};
        
        assertThrows(IllegalArgumentException.class, () -> EcuacionCuadratica.resolverEcuacionCuadratica(coeficientes));
    }

    @Test
    void testResolverEcuacionCuadratica_coeficienteACero() {
        double[] coeficientes = {0, 2, 3};
        
        assertThrows(IllegalArgumentException.class, () -> EcuacionCuadratica.resolverEcuacionCuadratica(coeficientes));
    }

    @Test
    void testResolverEcuacionCuadratica_argumentoInvalido() {
        double[] coeficientes = {1, 2};
        
        assertThrows(IllegalArgumentException.class, () -> EcuacionCuadratica.resolverEcuacionCuadratica(coeficientes));
    }
}

