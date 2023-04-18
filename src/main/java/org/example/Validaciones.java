package org.example;
import org.example.OperacionesAritmeticas.Operacion;
import java.util.Scanner;

public class Validaciones {

    public static void main(String[] args) {
        
    }

    public static int IngresarNumero(String[] args){
        Scanner sn = new Scanner(System.in);
        String sopcion;
        sopcion = sn.nextLine();
        while(!sopcion.matches("-?\\d{1,2}")){
            System.out.println("Por favor ingrese un valor correcto");
            sopcion = sn.nextLine();
        }
        int opcion = Integer.parseInt(sopcion);
        return opcion;
    }

    public static double[] arreglo2(String[] args) {
        double[] arr={IngresarNumero(args),IngresarNumero(args)};
        return arr;
    }

    public static void arreglo2Ex(String[] args) {
        try{
            arreglo2(args);
        }catch(NumberFormatException e){
            System.out.println("Se ha ingresado un valor nulo");
            System.out.println("Por favor intentelo nuevamente");
            System.out.println("");
        }
    }


    public static double[] arreglo3(String[] args) {
        double[] arr={IngresarNumero(args),IngresarNumero(args),IngresarNumero(args)};
        if(arr[0]==0){
            throw new IllegalArgumentException();
        }
        return arr;
    }

    public static void arreglo3Ex(String[] args) {
        try{
            arreglo3(args);
        }catch(NumberFormatException e){
            System.out.println("Se ha ingresado un valor nulo");
            System.out.println("Por favor intentelo nuevamente");
            System.out.println("");
        }
    }

    public static double[] arr3Ex(String[] args) {
        try{
            return arreglo3(args);
        }catch(IllegalArgumentException e){
        }
        return null;
    }

    public static void DivEx(String[] args) {
        try{
            System.out.println("Su resultado es: " + OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.DIVISION, arreglo2(args)));
            System.out.println("");
        }catch(ArithmeticException e){
            System.out.println("No es posible dividir entre 0");
            System.out.println("");
        }
    }

    public static void CuadEx(String[] args) {
        try{
            printCuad(EcuacionCuadratica.resolverEcuacionCuadratica(arr3Ex(args)));
            System.out.println("");
        }catch(IllegalArgumentException e){
            System.out.println("La ecuacion no tiene solucion en los reales");
            System.out.println("");
        }catch(NullPointerException e){
            System.out.println("El primer valor de la cuadratica no puede ser 0");
            System.out.println("");
        }
    }

    public static void printCuad(double[] list) {
        double[] arr=list;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.println("x1 = "+arr[i]);
            }else{
                System.out.println("x2 = "+arr[i]);
            }
        }
    }

    public static void printPerimArea(double[] list) {
        double[] arr=list;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.println("Perímetro = "+arr[i]);
            }else{
                System.out.println("Área = "+arr[i]);
            }
        }
    }

    public static void printPerimAreaVol(double[] list) {
        double[] arr=list;
        for(int i=0;i<arr.length;i++){
            if(i==0){
                System.out.println("Perímetro = "+arr[i]);
            }else if(i==1){
                System.out.println("Área = "+arr[i]);
            }else{
                System.out.println("Volumen = "+arr[i]);
            }
        }
    }

    public static void EcRectaEx(String[] args) {
        try{
            printEcRecta(EcuacionRecta.resolverEcuacionRecta(Validaciones.arreglo2(args), Validaciones.arreglo2(args)));
        }catch(ArithmeticException e){
            System.out.println("El punto inicial y el punto final son iguales");
        }
    }

    public static void printEcRecta(double[] list) {
        double[] arr=list;
        if(arr[0]==0){
            System.out.println("La pendiente de la recta es igual a 0");
            System.out.println("y = "+arr[1]);
        }else{
            System.out.println("La ecuacion de la recta es: ");
            System.out.println("y = "+arr[0]+"x +"+arr[1]);
        }
    }

    public static double[][] matriz(double[] list1, double[] list2) {
        double[][] mat = new double[2][2];
        double[] arr1 = list1;
        double[] arr2 = list2;
        mat[0][0]=arr1[0];
        mat[0][1]=arr1[1];
        mat[1][0]=arr2[0];
        mat[1][1]=arr2[1]; 
        return mat;  
    }

    public static void SistEcLinealEx(String[] args) {
        try{
            printSistEcLineal(SistemaEcuacionesLineales.resolverSistemaEcuacionesLineales(matriz(arreglo2(args), arreglo2(args)), arreglo2(args)));
        }catch(ArithmeticException e){
            System.out.println("El sistema no tiene solución única");
        }
    }

    public static void printSistEcLineal(double[] list) {
        double[] arr=list;
        System.out.println("Los valores de 'x' e 'y' son: ");
        System.out.println("x = "+arr[0]);
        System.out.println("y = "+arr[1]);
    }

}
