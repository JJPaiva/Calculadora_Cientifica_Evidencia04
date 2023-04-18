package org.example;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class MenuTextoTest {
    @Test
    public void testContinuación() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        MenuTexto.continuación();
        
        String output = outputStream.toString().trim();

        Assert.assertEquals("¿Qué desea realizar a continuación?\n"+
        "Ingrese el número correspondiente a lo que desea realizar:\n"+
        "[1].-Calcular operaciones entre 2 números.\n"+
        "[2].-Calcular soluciones de una cuadrática\n"+
        "[3].-Calcular perímetros, áreas y volúmenes\n"+
        "[4].-Calcular un sistema de ecuaciones\n"+
        "[5].-Calcular la ecuación de la recta con 2 puntos\n"+
        "[0].-Salir", output);
    }

    @Test
    public void testContinuación2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        MenuTexto.continuación();
        
        String output = outputStream.toString().trim();
        Assert.assertEquals("¿Qué desea realizar a continuación?\n"+
        "Ingrese el número correspondiente a lo que desea realizar:\n"+
        "[1].-Calcular operaciones entre 2 números.\n"+
        "[2].-Calcular soluciones de una cuadrática\n"+
        "[3].-Calcular perímetros, áreas y volúmenes\n"+
        "[4].-Calcular un sistema de ecuaciónes\n"+
        "[5].-Calcular la ecuación de la recta con 2 puntos\n"+
        "[0].-Salir", output);
    }

    @Test
    public void testMenuTextoGeometria() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        MenuTexto.menuTextoGeometria();
        
        String output = outputStream.toString().trim();
        Assert.assertEquals("Ingrese el número de la figura que desea calcular: \n"+
        "[1].-Cuadrado\n"+
        "[2].-Rectángulo\n"+
        "[3].-Circulo\n"+
        "[4].-Esfera\n"+
        "[5].-Cubo\n"+
        "[6].-Cono\n"+
        "[0].-Atrás", output);

    }

    @Test
    public void testMenuTextoOperaciones() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        MenuTexto.menuTextoOperaciones();
        
        String output = outputStream.toString().trim();
        Assert.assertEquals("Ingrese el número correspondiente a lo que desea realizar: \n"+
        "[1].-Sumar 2 números\n"+
        "[2].-Restar 2 números\n"+
        "[3].-Multiplicar 2 números\n"+
        "[4].-Dividir 2 números\n"+
        "[5].-Cuál número es mayor\n"+
        "[6].-Cuál número es menor\n"+
        "[7].-Número elevado al segúndo número\n"+
        "[8].-calcular porcentaje de un número\n"+
        "[0].-Atrás", output);

    }

    @Test
    public void testMenuTextoPrincipal() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        MenuTexto.menuTextoPrincipal();
        
        String output = outputStream.toString().trim();
        Assert.assertEquals("Ingrese el número correspondiente a lo que desea realizar:\n"+
        "[1].-Calcular operaciones entre 2 números.\n"+
        "[2].-Calcular soluciones de una cuadrática\n"+
        "[3].-Calcular perímetros, áreas y volúmenes\n"+
        "[4].-Calcular un sistema de ecuaciónes\n"+
        "[5].-Calcular la ecuación de la recta con 2 puntos\n"+
        "[0].-Salir", output);
    }
}
