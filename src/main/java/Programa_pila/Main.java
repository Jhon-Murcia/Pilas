package Programa_pila;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el tamaño máximo de la pila: ");
        int tamaño = sc.nextInt();
        Pila pila = new Pila(tamaño);

        int opcion;
        do {
            System.out.println("\n MENÚ ");
            System.out.println("1. Insertar (push)");
            System.out.println("2. Eliminar (pop)");
            System.out.println("3. Mostrar pila");
            System.out.println("4. ¿Está llena?");
            System.out.println("5. ¿Está vacía?");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número para insertar: ");
                    int valor = sc.nextInt();
                    pila.push(valor);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.mostrarPila();
                    break;
                case 4:
                    System.out.println(pila.isFull() ? "La pila está llena." : "ℹLa pila NO está llena.");
                    break;
                case 5:
                    System.out.println(pila.isEmpty() ? "La pila está vacía." : "ℹLa pila NO está vacía.");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}