package org.example;

import static org.junit.Assert.assertArrayEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class ValidacionesTest {
    @Test
    public void testCuadEx() {

    }

    @Test
    public void testDivEx() {

    }

    @Test
    public void testEcRectaEx() {

    }

    @Test
    public void testIngresarNumero() {

    }

    @Test
    public void testSistEcLinealEx() {

    }

    @Test
    public void testArr3Ex() {

    }

    @Test
    public void testArreglo2() {
        double[] arrExp = {1,5};
        double[] arrAct = {1,5};
        assertArrayEquals(arrExp, arrAct, 0);
    }

    @Test
    public void testArreglo3() {
        double[] arrExp = {1,5,8};
        double[] arrAct = {1,5,8};
        assertArrayEquals(arrExp, arrAct, 0);
    }

    @Test
    public void testMatriz() {

        double[] arr1 = {1,6};
        double[] arr2 = {2,7};
        double[][] mat ={{1,6},{2,7}};

        assertArrayEquals(mat, Validaciones.matriz(arr1, arr2));
    }

    @Test
    public void testPrintCuad() {
        double[] arr={5,1};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Validaciones.printCuad(arr);
        
        String output = outputStream.toString().trim();

        Assert.assertEquals("x1 = "+arr[0]+
        "\nx2 = "+arr[1], output);
    }

    @Test
    public void testPrintEcRecta() {
        double[] arr={1,2};
        double[] arr0={0,3};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Validaciones.printEcRecta(arr);
        
        String output = outputStream.toString().trim();

        Assert.assertEquals("La ecuacion de la recta es: "+
        "\ny = "+arr[0]+"x +"+arr[1], output);

    }

    @Test
    public void testPrintPerimArea() {
        double[] arr={2,6};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Validaciones.printPerimArea(arr);
        
        String output = outputStream.toString().trim();

        Assert.assertEquals("Perímetro = "+arr[0]+
        "\nÁrea = "+arr[1], output);
    }

    @Test
    public void testPrintPerimAreaVol() {

        double[] arr={1,2,3};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Validaciones.printPerimAreaVol(arr);
        
        String output = outputStream.toString().trim();

        Assert.assertEquals("Perímetro = "+arr[0]+
        "\nÁrea = "+arr[1]+
        "\nVolumen = "+arr[2], output);
    }

    @Test
    public void testPrintSistEcLineal() {
        double[] arr={1,2};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Validaciones.printSistEcLineal(arr);
        
        String output = outputStream.toString().trim();

        Assert.assertEquals("Los valores de 'x' e 'y' son: "+"\nx = "+arr[0]+
        "\ny = "+arr[1], output);
    }
}
