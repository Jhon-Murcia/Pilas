Concepto de pilas en Java

Este repositorio contiene dos programas realizados en Java que demuestran el uso de estructuras tipo pila

Integrantes: Jhon Sebastian Murcia Romero-Angie Katherine Robayo Angel

1. Programa básico de pila

Este programa basico permite visualizar como funcionan los conceptos de pilas en la programación y permite realizar operaciones fundamentales de una pila como:

- `push`: Insertar un nuevo elemento en la pila.
- `pop`: Eliminar el último elemento insertado.
- `isEmpty`: Verificar si la pila está vacía.
- `isFull`: Verificar si la pila alcanzó su límite de capacidad (en este caso 5 elementos).
- `ver`: Mostrar el contenido actual de la pila.

FUNCIONALIDAD

El usuario ingresa datos a través del teclado y el menú permite ir probando cada una de las operaciones, para el funcionaminto de este programa se dividio el codigo en dos archivos: Pila.java y Main.java

Pila.java

- Se implementa un metodo constructor que reserva espacio en el arreglo pila para 5 elementos y coloca el tope en -1, lo cual indica que la pila está vacía.
- El método push(String elemento) sirve para inserta un nuevo elemento si la pila no está llena y usa ++tope para avanzar una posición antes de insertar.
- Se usa un metodo pop que elimina el último elemento insertado (LIFO) y disminuye el índice del tope.
- Los métodos isEmpty() e isFull() se implementan para retornar true si no hay elementos y para retorna true si se alcanzó el máximo permitido.
- El método ver muestra todos los elementos de la pila de arriba hacia abajo (del tope al fondo).

Main.java

- Primero se crea un objeto Scanner para leer datos del usuario y se crea una nueva instancia de la clase Pila.
- Posteriormente se muestra un menú con 5 opciones y se lee la opción del usuario y ejecuta la acción correspondiente.


2. Ejemplo real: Simulador de Navegador Web

Este programa simula un navegador en el que el usuario puede:

- Visitar nuevas páginas web (se agregan a la pila).
- Ir hacia atrás en el historial (se eliminan páginas de la pila).
- Ver la página actual.
- Ver todo el historial almacenado.

Se utiliza una `Stack<String>` para manejar el historial de navegación como lo haría un navegador real.

FUNCIONALIDAD

El usuario ingresa datos a través del teclado y el menú permite ir probando cada una de las operaciones, para el funcionaminto de este programa se dividio el codigo en dos archivos: Navegador.java y Main.java

Navegador.java

- primeramente se crea un constructor que inicializa la pila vacía (new Stack<>()) y coloca "Inicio" como la primera página por defecto.
- El metodo visitar(String url) permite que cuando el usuario visita una nueva página: se guarda la página actual en la pila y se actualiza la variable paginaActual con el nombre de la pagina.
- El boton "atras" simula un boton de retroceso de cualquier navegador web, si el historial no está vacío, extrae la última página y la pone como actual y si está vacío, avisa que no hay más páginas anteriores.
- El metodo mostrarActual() muestra en pantalla cuál es la página actual.
- El metodo mostrarHistorial() recorre la pila (sin modificarla) y muestra las páginas visitadas en orden inverso, desde la más reciente a la más antigua.
  
Main.java

- Primeramente se crea una instancia del navegador, se usa Scanner para permitir que el usuario ingrese el nombre de la página y opciones.
- Se muestra el menú de opciones y permite que el usuario elija una acción.
- Se implementa un switch que permite ejecutar el método correspondiente según la opción que ingrese el usuario.










