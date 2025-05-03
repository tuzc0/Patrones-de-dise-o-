package iterator;

import java.util.Scanner;

public class BibliotecaIteratorDemo {

    private static void pausar() {
        System.out.println("Presiona Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println(BibliotecaIteratorDemo.class.getSimpleName() + " [📚 Libros en la biblioteca]");
        pausar();

        biblioteca.mostrarTodosLosLibros();
        System.out.println(BibliotecaIteratorDemo.class.getSimpleName() + " [Fin de la lista de libros]");
    }
}
