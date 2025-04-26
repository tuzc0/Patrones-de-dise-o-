from abc import ABC, abstractmethod
# Clase base con el método plantilla
class BebidaCaliente(ABC):

    def preparar(self):
        self.hervir_agua()
        self.preparar_ingrediente_principal()
        self.servir_en_taza()
        self.agregar_extras()

    def hervir_agua(self):
        print("Hirviendo agua...")

    @abstractmethod
    def preparar_ingrediente_principal(self):
        pass

    def servir_en_taza(self):
        print("Sirviendo en la taza...")

    @abstractmethod
    def agregar_extras(self):
        pass

# Subclase para preparar té
class Te(BebidaCaliente):
    def preparar_ingrediente_principal(self):
        print("Remojando la bolsita de té...")

    def agregar_extras(self):
        print("Agregando limón...")

# Subclase para preparar café
class Cafe(BebidaCaliente):
    def preparar_ingrediente_principal(self):
        print("Agregando café molido al agua...")

    def agregar_extras(self):
        print("Agregando azúcar y leche...")

# Uso
def main():
    print("Preparando té:")
    bebida = Te()
    bebida.preparar()

    print("\nPreparando café:")
    bebida = Cafe()
    bebida.preparar()

main()