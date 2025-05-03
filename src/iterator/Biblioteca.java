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
        System.out.println("Clase: " + this.getClass().getSimpleName() + " [Mostrando todos los libros]");
        for (Seccion seccion : secciones) {
            String nombreSeccion = seccion.getClass().getSimpleName();
            Iterator<Libro> iterator = seccion.crearIterator();
            while (iterator.hasNext()) {
                Libro libro = iterator.next();
                System.out.println("Clase: " + nombreSeccion + " - Libro: " + libro.getTitulo());
            }
        }
    }
}
