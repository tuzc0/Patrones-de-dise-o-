package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Clase que recorre todas las secciones
class Biblioteca {
    private List<Seccion> secciones;

    public Biblioteca() {
        secciones = new ArrayList<>();
        secciones.add(new SeccionNovelas());
        secciones.add(new SeccionEnciclopedias());
        secciones.add(new SeccionCiencia());
    }

    public void mostrarTodosLosLibros() {
        for (Seccion seccion : secciones) {
            Iterator<Libro> iterator = seccion.crearIterator();
            while (iterator.hasNext()) {
                Libro libro = iterator.next();
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}
