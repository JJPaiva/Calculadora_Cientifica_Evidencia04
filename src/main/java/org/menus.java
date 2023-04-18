package org;
import org.example.OperacionesAritmeticas;
import org.example.OperacionesAritmeticas.Operacion;
import org.example.MenuTexto;
import org.example.Validaciones;
import org.example.FigurasGeometricas.Figura;
import org.example.FigurasGeometricas;


public class menus{

    public static void menu(String [] args){
        MenuTexto.menuTextoPrincipal();
        int aux;
        do{
            aux = Validaciones.IngresarNumero(args);
            switch(aux){
                case 0:
                System.out.println("Usted a seleccionado Salir");
                System.out.println("");
                break;
                case 1:
                System.out.println("Usted a seleccionado la opcion 1");
                System.out.println("");
                menuOperaciones(args);
                break;
                case 2:
                System.out.println("Usted a seleccionado la opcion 2");
                System.out.println("A continuación ingrese los números de su ecuación cuadratica");
                System.out.println("Considere la ecuación de la forma (valor1x^2 + valor2x + valor3 = 0)");
                Validaciones.CuadEx(args);
                MenuTexto.continuación();
                break;
                case 3:
                System.out.println("Usted a seleccionado la opcion 3");
                System.out.println("");
                menuGeometria(args);
                MenuTexto.continuación();
                break;
                case 4:
                System.out.println("Usted a seleccionado la opcion 4");
                System.out.println("A continuación ingrese los números del sistema de ecuaciones");
                System.out.println("Considere los números ingresados se tomarán en el siguente orden: ");
                System.out.println("x1, y1 (de la primera ecuación), x2, y2 (de la segunda ecuación), constante de la ecuación 1, constante de la ecuación 2");
                Validaciones.SistEcLinealEx(args);
                MenuTexto.continuación();
                break;
                case 5:
                System.out.println("Usted a seleccionado la opcion 5");
                System.out.println("A continuación ingrese los puntos de la ecuación de la recta");
                System.out.println("Considere los números ingresados se tomarán en el siguente orden: x1, y1, x2, y2");
                Validaciones.EcRectaEx(args);
                System.out.println("");
                MenuTexto.continuación();
                break;
                default:
                System.out.println("El número ingresado no se encuentra entre las opciones");
                System.out.println("Ingrese un número correspondiente");
                System.out.println("");
            }
        }while(aux !=0);
    }

    public static void menuOperaciones(String[] args) {
        MenuTexto.menuTextoOperaciones();
        int aux;
        do{
            aux = Validaciones.IngresarNumero(args);
            switch(aux){
                case 0:
                System.out.println("Usted a seleccionado Atrás");
                System.out.println("");
                MenuTexto.menuTextoPrincipal();
                break;
                case 1:
                System.out.println("Usted a seleccionado la opción Sumar");
                System.out.println("A continuation ingrese los dos números que desea sumar");
                double resultSuma=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.SUMA, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultSuma);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                case 2:
                System.out.println("Usted a seleccionado la opción Restar");
                System.out.println("A continuation ingrese los dos números que desea restar");
                System.out.println("Considere que la operación será de la forma (numero 1 - numero 2)");
                double resultResta=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.RESTA, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultResta);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                case 3:
                System.out.println("Usted a seleccionado la opción Multiplicar");
                System.out.println("A continuation ingrese los dos números que desea multiplicar");
                double resultMulti=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.MULTIPLICACION, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultMulti);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                case 4:
                System.out.println("Usted a seleccionado la opción Dividir");
                System.out.println("A continuation ingrese los dos números que desea dividir");
                System.out.println("Considere que la operación será de la forma (numero 1 / numero 2)");
                Validaciones.DivEx(args);
                MenuTexto.continuación2();
                break;
                case 5:
                System.out.println("Usted a seleccionado la opcion número Mayor");
                System.out.println("A continuation ingrese los dos números que desea comparar");
                double resultMayor=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.MAXIMO, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultMayor);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                case 6:
                System.out.println("Usted a seleccionado la opcion número Menor");
                System.out.println("A continuation ingrese los dos números que desea comparar");
                double resultMenor=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.MINIMO, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultMenor);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                case 7:
                System.out.println("Usted a seleccionado la opcion Potencia");
                System.out.println("A continuation ingrese los dos números con los que desea realizar la potencia");
                System.out.println("Considere que la operación será de la forma (numero 1 ^ numero 2)");
                double resultPotencia=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.POTENCIA, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultPotencia);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                case 8:
                System.out.println("Usted a seleccionado la opcion Porcentaje");
                System.out.println("A continuation ingrese los dos números con los que desea realizar el porcentaje");
                System.out.println("Considere que el primer valor corresponderá al número como tal, y el segundo al porcentaje");
                double resultPorcentaje=OperacionesAritmeticas.resolverOperacionesAritmeticas(Operacion.PORCENTAJE, Validaciones.arreglo2(args));
                System.out.println("Su resultado es: "+resultPorcentaje);
                System.out.println("");
                MenuTexto.continuación2();
                break;
                default:
                System.out.println("El número ingresado no se encuentra entre las opciones");
                System.out.println("Ingrese un número correspondiente");
                System.out.println("");
            }
        }while(aux !=0);
    }


    public static void menuGeometria(String[] args) {
        MenuTexto.menuTextoGeometria();
        int aux;
        do{
            aux = Validaciones.IngresarNumero(args);
            switch(aux){
                case 0:
                System.out.println("Usted a seleccionado Atrás");
                System.out.println("");
                MenuTexto.menuTextoGeometria();
                break;
                case 1:
                System.out.println("Usted a seleccionado la opcion Cuadrado");
                System.out.println("Ingrese el valor del lado del cuadrado");
                Validaciones.printPerimArea(FigurasGeometricas.resolverFigurasGeometricas(Figura.CUADRADO, Validaciones.IngresarNumero(args)));
                System.out.println("");
                System.out.println("Qué desea realizar a continuación");
                break;
                case 2:
                System.out.println("Usted a seleccionado la opcion Rectángulo");
                System.out.println("Ingrese los valores de los lados del rectangulo");
                Validaciones.printPerimArea(FigurasGeometricas.resolverFigurasGeometricas(Figura.RECTANGULO, Validaciones.arreglo2(args)));
                System.out.println("");
                System.out.println("Qué desea realizar a continuación");
                break;
                case 3:
                System.out.println("Usted a seleccionado la opcion Circulo");
                System.out.println("Ingrese el valor del radio del circulo");
                Validaciones.printPerimArea(FigurasGeometricas.resolverFigurasGeometricas(Figura.CIRCULO, Validaciones.IngresarNumero(args)));
                System.out.println("");
                System.out.println("Qué desea realizar a continuación");
                break;
                case 4:
                System.out.println("Usted a seleccionado la opcion Esfera");
                System.out.println("Ingrese el valor del radio del esfera");
                Validaciones.printPerimAreaVol(FigurasGeometricas.resolverFigurasGeometricas(Figura.ESFERA, Validaciones.IngresarNumero(args)));
                System.out.println("");
                System.out.println("Qué desea realizar a continuación");
                break;
                case 5:
                System.out.println("Usted a seleccionado la opcion Cubo");
                System.out.println("Ingrese el valor del lado del cubo");
                Validaciones.printPerimAreaVol(FigurasGeometricas.resolverFigurasGeometricas(Figura.CUBO, Validaciones.IngresarNumero(args)));
                System.out.println("");
                System.out.println("Qué desea realizar a continuación");
                break;
                case 6:
                System.out.println("Usted a seleccionado la opcion Cono");
                System.out.println("Ingrese el radio y la altura del cono");
                System.out.println("Considere que se considerará radio = primer valor, altura = segundo valor");
                Validaciones.printPerimAreaVol(FigurasGeometricas.resolverFigurasGeometricas(Figura.CONO, Validaciones.arreglo2(args)));
                System.out.println("");
                System.out.println("Qué desea realizar a continuación");
                break;
                default:
                System.out.println("El número ingresado no se encuentra entre las opciones");
                System.out.println("Ingrese un número correspondiente");
                System.out.println("");
            }
        }while(aux !=0);
    }
}