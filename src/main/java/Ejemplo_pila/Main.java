package Ejemplo_pila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Navegador navegador = new Navegador();

        int opcion;
        do {
            System.out.println("\n SIMULADOR DE NAVEGADOR");
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Ir atrás");
            System.out.println("3. Ver página actual");
            System.out.println("4. Ver historial");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la página que desea visitar: ");
                    String url = sc.nextLine();
                    navegador.visitar(url);
                    break;
                case 2:
                    navegador.atras();
                    break;
                case 3:
                    navegador.mostrarActual();
                    break;
                case 4:
                    navegador.mostrarHistorial();
                    break;
                case 0:
                    System.out.println("Saliendo del navegador...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
