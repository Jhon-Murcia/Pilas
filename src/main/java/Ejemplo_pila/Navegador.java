package Ejemplo_pila;

import java.util.Stack;

public class Navegador {
    private Stack<String> historial = new Stack<>();

    public void visitar(String url) {
        historial.push(url);
        System.out.println("Visitando: " + url);
    }

    public void atras() {
        if (historial.size() <= 1) {
            System.out.println("No se puede retroceder. Estás en la primera página.");
        } else {
            String paginaActual = historial.pop();
            System.out.println("Volviendo desde: " + paginaActual);
            System.out.println("Ahora estás en: " + historial.peek());
        }
    }

    public void mostrarActual() {
        if (historial.isEmpty()) {
            System.out.println("No hay páginas visitadas.");
        } else {
            System.out.println("Página actual: " + historial.peek());
        }
    }

    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("El historial está vacío.");
        } else {
            System.out.println("Historial de navegación:");
            for (int i = historial.size() - 1; i >= 0; i--) {
                System.out.println("- " + historial.get(i));
            }
        }
    }
}
