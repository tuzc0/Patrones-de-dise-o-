from abc import ABC, abstractmethod

# Clase base: Libro
class Libro:
    def __init__(self, titulo):
        self.titulo = titulo

    def __str__(self):
        return self.titulo

# Interfaz de sección
class Seccion(ABC):
    @abstractmethod
    def crear_iterador(self):
        pass

# Sección de novelas (usando lista)
class SeccionNovelas(Seccion):
    def __init__(self):
        self.libros = [
            Libro("1984"),
            Libro("El Principito")
        ]

    def crear_iterador(self):
        return iter(self.libros)

# Sección de enciclopedias (usando tupla)
class SeccionEnciclopedias(Seccion):
    def __init__(self):
        self.libros = (
            Libro("Enciclopedia Británica"),
            Libro("Enciclopedia Larousse")
        )

    def crear_iterador(self):
        return iter(self.libros)

# Sección de ciencia (usando stack)
class SeccionCiencia(Seccion):
    def __init__(self):
        self.libros = []
        self.libros.append(Libro("Breve historia del tiempo"))
        self.libros.append(Libro("El gen egoísta"))

    def crear_iterador(self):
        return iter(self.libros)

# Biblioteca que usa todas las secciones
class Biblioteca:
    def __init__(self):
        self.secciones = [
            SeccionNovelas(),
            SeccionEnciclopedias(),
            SeccionCiencia()
        ]

    def mostrar_todos_los_libros(self):
        for seccion in self.secciones:
            nombre_seccion = seccion.__class__.__name__
            iterador = seccion.crear_iterador()
            for libro in iterador:
                print(f"Clase: {nombre_seccion} | Libro: {libro}")
                input("Presiona Enter para continuar...\n")

# Ejecución
if __name__ == "__main__":
    biblioteca = Biblioteca()
    print("📚 Libros en la biblioteca:")
    biblioteca.mostrar_todos_los_libros()
