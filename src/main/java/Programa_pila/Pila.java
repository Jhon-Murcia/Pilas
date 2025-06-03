package Programa_pila;

public class Pila {
    private int[] stack;
    private int top;
    private int max;

    public Pila(int tamaño) {
        max = tamaño;
        stack = new int[max];
        top = -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int valor) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede insertar.");
        } else {
            stack[++top] = valor;
            System.out.println("Insertado: " + valor);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede eliminar.");
        } else {
            int eliminado = stack[top--];
            System.out.println("Eliminado: " + eliminado);
        }
    }

    public void mostrarPila() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos en la pila:");
            for (int i = top; i >= 0; i--) {
                System.out.println("[" + stack[i] + "]");
            }
        }
    }
}
