package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Sección con ArrayList
class SeccionNovelas implements Seccion {
    private List<Libro> libros = new ArrayList<>();

    public SeccionNovelas() {
        libros.add(new Libro("1984"));
        libros.add(new Libro("El Principito"));
    }

    public Iterator<Libro> crearIterator() {
        return libros.iterator();
    }
}
