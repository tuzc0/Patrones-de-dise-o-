from abc import ABC, abstractmethod

# Componente base
class ItemPedido(ABC):
    @abstractmethod
    def mostrar(self):
        pass

    @abstractmethod
    def obtener_precio(self):
        pass

# Hoja: ítem individual como café o dona
class Producto(ItemPedido):
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def _pausar(self, metodo):
        print(f"Clase: {self.__class__.__name__} | Acción: {metodo} | Nombre: {self.nombre}")
        input("Presiona Enter para continuar...\n")

    def mostrar(self):
        self._pausar("mostrar")
        print(f"- {self.nombre}: ${self.precio:.2f}")

    def obtener_precio(self):
        self._pausar("obtener_precio")
        return self.precio

# Compuesto: combo que puede tener varios productos
class Combo(ItemPedido):
    def __init__(self, nombre):
        self.nombre = nombre
        self.items = []

    def _pausar(self, metodo, detalle=""):
        mensaje = f"Clase: {self.__class__.__name__} | Acción: {metodo} | Nombre: {self.nombre}"
        if detalle:
            mensaje += f" | {detalle}"
        print(mensaje)
        input("Presiona Enter para continuar...\n")

    def agregar(self, item):
        self._pausar("agregar", f"Producto agregado: {item.nombre}")
        self.items.append(item)

    def mostrar(self):
        self._pausar("mostrar")
        print(f"[Combo: {self.nombre}]")
        for item in self.items:
            item.mostrar()

    def obtener_precio(self):
        self._pausar("obtener_precio")
        return sum(item.obtener_precio() for item in self.items)

# Uso del patrón
cafe = Producto("Cafe Americano", 2.50)
dona = Producto("Dona de chocolate", 1.20)
sandwich = Producto("Sándwich de jamón", 3.80)

combo_desayuno = Combo("Desayuno Feliz")
combo_desayuno.agregar(cafe)
combo_desayuno.agregar(sandwich)
combo_desayuno.agregar(dona)

combo_desayuno.mostrar()
print(f"Total: ${combo_desayuno.obtener_precio():.2f}")

