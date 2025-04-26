package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Interfaz común para todas las secciones
interface Seccion {
    Iterator<Libro> crearIterator();
}

