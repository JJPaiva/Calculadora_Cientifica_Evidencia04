package org.example;

public class MenuTexto {
    
    public static void menuTextoPrincipal(){
        System.out.println("Ingrese el número correspondiente a lo que desea realizar: ");
        System.out.println("[1].-Calcular operaciones entre 2 números.");
        System.out.println("[2].-Calcular soluciones de una cuadrática");
        System.out.println("[3].-Calcular perímetros, áreas y volúmenes");
        System.out.println("[4].-Calcular un sistema de ecuaciónes");
        System.out.println("[5].-Calcular la ecuación de la recta con 2 puntos");
        System.out.println("[0].-Salir");
    }

    public static void menuTextoOperaciones(){
        System.out.println("Ingrese el número correspondiente a lo que desea realizar: ");
        System.out.println("[1].-Sumar 2 números");
        System.out.println("[2].-Restar 2 números");
        System.out.println("[3].-Multiplicar 2 números");
        System.out.println("[4].-Dividir 2 números");
        System.out.println("[5].-Cuál número es mayor");
        System.out.println("[6].-Cuál número es menor");
        System.out.println("[7].-Número elevado al segúndo número");
        System.out.println("[8].-calcular porcentaje de un número");
        System.out.println("[0].-Atrás");
    }

    public static void menuTextoGeometria(){
        System.out.println("Ingrese el número de la figura que desea calcular: ");
        System.out.println("[1].-Cuadrado");
        System.out.println("[2].-Rectángulo");
        System.out.println("[3].-Circulo");
        System.out.println("[4].-Esfera");
        System.out.println("[5].-Cubo");
        System.out.println("[6].-Cono");
        System.out.println("[0].-Atrás");
    }

    public static void continuación() {
        System.out.println("¿Qué desea realizar a continuación?");
        MenuTexto.menuTextoPrincipal();
    }

    public static void continuación2() {
        System.out.println("¿Qué desea realizar a continuación?");
        MenuTexto.menuTextoOperaciones();
    }
}
