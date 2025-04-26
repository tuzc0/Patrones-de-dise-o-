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

    def mostrar(self):
        print(f"- {self.nombre}: ${self.precio:.2f}")

    def obtener_precio(self):
        return self.precio

# Compuesto: combo que puede tener varios productos
class Combo(ItemPedido):
    def __init__(self, nombre):
        self.nombre = nombre
        self.items = []

    def agregar(self, item):
        self.items.append(item)

    def mostrar(self):
        print(f"[Combo: {self.nombre}]")
        for item in self.items:
            item.mostrar()

    def obtener_precio(self):
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
