package iterator;

import java.util.Iterator;
import java.util.Stack;

// Sección con Stack
class SeccionCiencia implements Seccion {
    private Stack<Libro> libros = new Stack<>();

    public SeccionCiencia() {
        libros.push(new Libro("Breve historia del tiempo"));
        libros.push(new Libro("El gen egoísta"));
    }

    public Iterator<Libro> crearIterator() {
        return libros.iterator();
    }
}

