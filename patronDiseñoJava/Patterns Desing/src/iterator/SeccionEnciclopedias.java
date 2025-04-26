package iterator;

import java.util.Arrays;
import java.util.Iterator;

// Sección con arreglo
class SeccionEnciclopedias implements Seccion {
    private Libro[] libros;

    public SeccionEnciclopedias() {
        libros = new Libro[] {
                new Libro("Enciclopedia Británica"),
                new Libro("Enciclopedia Larousse")
        };
    }

    public Iterator<Libro> crearIterator() {
        return Arrays.asList(libros).iterator();
    }
}
